// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.descriptor

/** The full set of known editions.
  */
sealed abstract class Edition(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
  type EnumType = com.google.protobuf.descriptor.Edition
  type RecognizedType = com.google.protobuf.descriptor.Edition.Recognized
  def isEditionUnknown: _root_.scala.Boolean = false
  def isEditionLegacy: _root_.scala.Boolean = false
  def isEditionProto2: _root_.scala.Boolean = false
  def isEditionProto3: _root_.scala.Boolean = false
  def isEdition2023: _root_.scala.Boolean = false
  def isEdition2024: _root_.scala.Boolean = false
  def isEdition1TestOnly: _root_.scala.Boolean = false
  def isEdition2TestOnly: _root_.scala.Boolean = false
  def isEdition99997TestOnly: _root_.scala.Boolean = false
  def isEdition99998TestOnly: _root_.scala.Boolean = false
  def isEdition99999TestOnly: _root_.scala.Boolean = false
  def isEditionMax: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[Edition] = com.google.protobuf.descriptor.Edition
  final def asRecognized: _root_.scala.Option[com.google.protobuf.descriptor.Edition.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[com.google.protobuf.descriptor.Edition.Recognized])
}

object Edition extends _root_.scalapb.GeneratedEnumCompanion[Edition] {
  sealed trait Recognized extends Edition
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Edition] = this
  
  /** A placeholder for an unknown edition value.
    */
  @SerialVersionUID(0L)
  case object EDITION_UNKNOWN extends Edition(0) with Edition.Recognized {
    val index = 0
    val name = "EDITION_UNKNOWN"
    override def isEditionUnknown: _root_.scala.Boolean = true
  }
  
  /** A placeholder edition for specifying default behaviors *before* a feature
    * was first introduced.  This is effectively an "infinite past".
    */
  @SerialVersionUID(0L)
  case object EDITION_LEGACY extends Edition(900) with Edition.Recognized {
    val index = 1
    val name = "EDITION_LEGACY"
    override def isEditionLegacy: _root_.scala.Boolean = true
  }
  
  /** Legacy syntax "editions".  These pre-date editions, but behave much like
    * distinct editions.  These can't be used to specify the edition of proto
    * files, but feature definitions must supply proto2/proto3 defaults for
    * backwards compatibility.
    */
  @SerialVersionUID(0L)
  case object EDITION_PROTO2 extends Edition(998) with Edition.Recognized {
    val index = 2
    val name = "EDITION_PROTO2"
    override def isEditionProto2: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EDITION_PROTO3 extends Edition(999) with Edition.Recognized {
    val index = 3
    val name = "EDITION_PROTO3"
    override def isEditionProto3: _root_.scala.Boolean = true
  }
  
  /** Editions that have been released.  The specific values are arbitrary and
    * should not be depended on, but they will always be time-ordered for easy
    * comparison.
    */
  @SerialVersionUID(0L)
  case object EDITION_2023 extends Edition(1000) with Edition.Recognized {
    val index = 4
    val name = "EDITION_2023"
    override def isEdition2023: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EDITION_2024 extends Edition(1001) with Edition.Recognized {
    val index = 5
    val name = "EDITION_2024"
    override def isEdition2024: _root_.scala.Boolean = true
  }
  
  /** Placeholder editions for testing feature resolution.  These should not be
    * used or relyed on outside of tests.
    */
  @SerialVersionUID(0L)
  case object EDITION_1_TEST_ONLY extends Edition(1) with Edition.Recognized {
    val index = 6
    val name = "EDITION_1_TEST_ONLY"
    override def isEdition1TestOnly: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EDITION_2_TEST_ONLY extends Edition(2) with Edition.Recognized {
    val index = 7
    val name = "EDITION_2_TEST_ONLY"
    override def isEdition2TestOnly: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EDITION_99997_TEST_ONLY extends Edition(99997) with Edition.Recognized {
    val index = 8
    val name = "EDITION_99997_TEST_ONLY"
    override def isEdition99997TestOnly: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EDITION_99998_TEST_ONLY extends Edition(99998) with Edition.Recognized {
    val index = 9
    val name = "EDITION_99998_TEST_ONLY"
    override def isEdition99998TestOnly: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EDITION_99999_TEST_ONLY extends Edition(99999) with Edition.Recognized {
    val index = 10
    val name = "EDITION_99999_TEST_ONLY"
    override def isEdition99999TestOnly: _root_.scala.Boolean = true
  }
  
  /** Placeholder for specifying unbounded edition support.  This should only
    * ever be used by plugins that can expect to never require any changes to
    * support a new edition.
    */
  @SerialVersionUID(0L)
  case object EDITION_MAX extends Edition(2147483647) with Edition.Recognized {
    val index = 11
    val name = "EDITION_MAX"
    override def isEditionMax: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends Edition(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
  lazy val values: scala.collection.immutable.Seq[ValueType] = scala.collection.immutable.Seq(EDITION_UNKNOWN, EDITION_LEGACY, EDITION_PROTO2, EDITION_PROTO3, EDITION_2023, EDITION_2024, EDITION_1_TEST_ONLY, EDITION_2_TEST_ONLY, EDITION_99997_TEST_ONLY, EDITION_99998_TEST_ONLY, EDITION_99999_TEST_ONLY, EDITION_MAX)
  def fromValue(__value: _root_.scala.Int): Edition = __value match {
    case 0 => EDITION_UNKNOWN
    case 1 => EDITION_1_TEST_ONLY
    case 2 => EDITION_2_TEST_ONLY
    case 900 => EDITION_LEGACY
    case 998 => EDITION_PROTO2
    case 999 => EDITION_PROTO3
    case 1000 => EDITION_2023
    case 1001 => EDITION_2024
    case 99997 => EDITION_99997_TEST_ONLY
    case 99998 => EDITION_99998_TEST_ONLY
    case 99999 => EDITION_99999_TEST_ONLY
    case 2147483647 => EDITION_MAX
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor.getEnumTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.scalaDescriptor.enums(0)
  def fromJavaValue(pbJavaSource: com.google.protobuf.DescriptorProtos.Edition): Edition = fromValue(pbJavaSource.getNumber)
  def toJavaValue(pbScalaSource: Edition): com.google.protobuf.DescriptorProtos.Edition = {
    _root_.scala.Predef.require(!pbScalaSource.isUnrecognized, "Unrecognized enum values can not be converted to Java")
    com.google.protobuf.DescriptorProtos.Edition.forNumber(pbScalaSource.value)
  }
}