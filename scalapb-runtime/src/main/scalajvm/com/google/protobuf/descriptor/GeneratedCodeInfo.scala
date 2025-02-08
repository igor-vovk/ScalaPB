// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.descriptor
import _root_.scalapb.internal.compat.JavaConverters._

/** Describes the relationship between generated code and its original source
  * file. A GeneratedCodeInfo message is associated with only one generated
  * source file, but may contain references to different source .proto files.
  *
  * @param annotation
  *   An Annotation connects some span of text in generated code to an element
  *   of its generating .proto file.
  */
@SerialVersionUID(0L)
final case class GeneratedCodeInfo(
    annotation: _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = _root_.scala.Vector.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[GeneratedCodeInfo] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      annotation.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      annotation.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearAnnotation = copy(annotation = _root_.scala.Vector.empty)
    def addAnnotation(__vs: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation *): GeneratedCodeInfo = addAllAnnotation(__vs)
    def addAllAnnotation(__vs: Iterable[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = annotation ++ __vs)
    def withAnnotation(__v: _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => annotation
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(annotation.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.protobuf.descriptor.GeneratedCodeInfo.type = com.google.protobuf.descriptor.GeneratedCodeInfo
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.GeneratedCodeInfo])
}

object GeneratedCodeInfo extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.GeneratedCodeInfo): com.google.protobuf.DescriptorProtos.GeneratedCodeInfo = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.newBuilder
    javaPbOut.addAllAnnotation(_root_.scalapb.internal.compat.toIterable(scalaPbSource.annotation.iterator.map(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.toJavaProto(_))).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.GeneratedCodeInfo): com.google.protobuf.descriptor.GeneratedCodeInfo = com.google.protobuf.descriptor.GeneratedCodeInfo(
    annotation = javaPbSource.getAnnotationList.asScala.iterator.map(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.fromJavaProto(_)).toSeq
  )
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo = {
    val __annotation: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __annotation += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.descriptor.GeneratedCodeInfo(
        annotation = __annotation.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.GeneratedCodeInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.GeneratedCodeInfo(
        annotation = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(22)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.scalaDescriptor.messages(22)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo(
    annotation = _root_.scala.Vector.empty
  )
  /** @param path
    *   Identifies the element in the original source .proto file. This field
    *   is formatted the same as SourceCodeInfo.Location.path.
    * @param sourceFile
    *   Identifies the filesystem path to the original source .proto.
    * @param begin
    *   Identifies the starting offset in bytes in the generated code
    *   that relates to the identified object.
    * @param end
    *   Identifies the ending offset in bytes in the generated code that
    *   relates to the identified object. The end offset should be one past
    *   the last relevant byte (so the length of the text = end - begin).
    */
  @SerialVersionUID(0L)
  final case class Annotation(
      path: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Vector.empty,
      sourceFile: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
      begin: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
      end: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
      semantic: _root_.scala.Option[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic] = _root_.scala.None,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Annotation] {
      private[this] def pathSerializedSize = {
        if (__pathSerializedSizeField == 0) __pathSerializedSizeField = {
          var __s: _root_.scala.Int = 0
          path.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(__i))
          __s
        }
        __pathSerializedSizeField
      }
      @transient private[this] var __pathSerializedSizeField: _root_.scala.Int = 0
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        if (path.nonEmpty) {
          val __localsize = pathSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if (sourceFile.isDefined) {
          val __value = sourceFile.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        };
        if (begin.isDefined) {
          val __value = begin.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
        };
        if (end.isDefined) {
          val __value = end.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, __value)
        };
        if (semantic.isDefined) {
          val __value = semantic.get.value
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(5, __value)
        };
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
        var __size = __serializedSizeMemoized
        if (__size == 0) {
          __size = __computeSerializedSize() + 1
          __serializedSizeMemoized = __size
        }
        __size - 1
        
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        if (path.nonEmpty) {
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(pathSerializedSize)
          path.foreach(_output__.writeInt32NoTag)
        };
        sourceFile.foreach { __v =>
          val __m = __v
          _output__.writeString(2, __m)
        };
        begin.foreach { __v =>
          val __m = __v
          _output__.writeInt32(3, __m)
        };
        end.foreach { __v =>
          val __m = __v
          _output__.writeInt32(4, __m)
        };
        semantic.foreach { __v =>
          val __m = __v.value
          _output__.writeEnum(5, __m)
        };
        unknownFields.writeTo(_output__)
      }
      def clearPath = copy(path = _root_.scala.Vector.empty)
      def addPath(__vs: _root_.scala.Int *): Annotation = addAllPath(__vs)
      def addAllPath(__vs: Iterable[_root_.scala.Int]): Annotation = copy(path = path ++ __vs)
      def withPath(__v: _root_.scala.Seq[_root_.scala.Int]): Annotation = copy(path = __v)
      def getSourceFile: _root_.scala.Predef.String = sourceFile.getOrElse("")
      def clearSourceFile: Annotation = copy(sourceFile = _root_.scala.None)
      def withSourceFile(__v: _root_.scala.Predef.String): Annotation = copy(sourceFile = _root_.scala.Option(__v))
      def getBegin: _root_.scala.Int = begin.getOrElse(0)
      def clearBegin: Annotation = copy(begin = _root_.scala.None)
      def withBegin(__v: _root_.scala.Int): Annotation = copy(begin = _root_.scala.Option(__v))
      def getEnd: _root_.scala.Int = end.getOrElse(0)
      def clearEnd: Annotation = copy(end = _root_.scala.None)
      def withEnd(__v: _root_.scala.Int): Annotation = copy(end = _root_.scala.Option(__v))
      def getSemantic: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic = semantic.getOrElse(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.NONE)
      def clearSemantic: Annotation = copy(semantic = _root_.scala.None)
      def withSemantic(__v: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic): Annotation = copy(semantic = _root_.scala.Option(__v))
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => path
          case 2 => sourceFile.orNull
          case 3 => begin.orNull
          case 4 => end.orNull
          case 5 => semantic.map(_.javaValueDescriptor).orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PRepeated(path.iterator.map(_root_.scalapb.descriptors.PInt(_)).toVector)
          case 2 => sourceFile.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 3 => begin.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 4 => end.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 5 => semantic.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.type = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
      // @@protoc_insertion_point(GeneratedMessage[google.protobuf.GeneratedCodeInfo.Annotation])
  }
  
  object Annotation extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation): com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation = {
      val javaPbOut = com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.newBuilder
      javaPbOut.addAllPath(_root_.scalapb.internal.compat.toIterable(scalaPbSource.path.iterator.map(_root_.scala.Int.box(_))).asJava)
      scalaPbSource.sourceFile.foreach(javaPbOut.setSourceFile)
      scalaPbSource.begin.foreach(javaPbOut.setBegin)
      scalaPbSource.end.foreach(javaPbOut.setEnd)
      scalaPbSource.semantic.map(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.toJavaValue(_)).foreach(javaPbOut.setSemantic)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
      path = javaPbSource.getPathList.asScala.iterator.map(_.intValue).toSeq,
      sourceFile = if (javaPbSource.hasSourceFile) Some(javaPbSource.getSourceFile) else _root_.scala.None,
      begin = if (javaPbSource.hasBegin) Some(javaPbSource.getBegin.intValue) else _root_.scala.None,
      end = if (javaPbSource.hasEnd) Some(javaPbSource.getEnd.intValue) else _root_.scala.None,
      semantic = if (javaPbSource.hasSemantic) Some(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.fromJavaValue(javaPbSource.getSemantic)) else _root_.scala.None
    )
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = {
      val __path: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int]
      var __sourceFile: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
      var __begin: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None
      var __end: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None
      var __semantic: _root_.scala.Option[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic] = _root_.scala.None
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __path += _input__.readInt32()
          case 10 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __path += _input__.readInt32()
            }
            _input__.popLimit(oldLimit)
          }
          case 18 =>
            __sourceFile = _root_.scala.Option(_input__.readStringRequireUtf8())
          case 24 =>
            __begin = _root_.scala.Option(_input__.readInt32())
          case 32 =>
            __end = _root_.scala.Option(_input__.readInt32())
          case 40 =>
            __semantic = _root_.scala.Option(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.fromValue(_input__.readEnum()))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
          path = __path.result(),
          sourceFile = __sourceFile,
          begin = __begin,
          end = __end,
          semantic = __semantic,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
          path = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty),
          sourceFile = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
          begin = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
          end = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
          semantic = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.fromValue(__e.number))
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 5 => com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic
      }
    }
    lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
      path = _root_.scala.Vector.empty,
      sourceFile = _root_.scala.None,
      begin = _root_.scala.None,
      end = _root_.scala.None,
      semantic = _root_.scala.None
    )
    /** Represents the identified object's effect on the element in the original
      * .proto file.
      */
    sealed abstract class Semantic(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
      type EnumType = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic
      type RecognizedType = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.Recognized
      def isNone: _root_.scala.Boolean = false
      def isSet: _root_.scala.Boolean = false
      def isAlias: _root_.scala.Boolean = false
      def companion: _root_.scalapb.GeneratedEnumCompanion[Semantic] = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic
      final def asRecognized: _root_.scala.Option[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic.Recognized])
    }
    
    object Semantic extends _root_.scalapb.GeneratedEnumCompanion[Semantic] {
      sealed trait Recognized extends Semantic
      implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Semantic] = this
      
      /** There is no effect or the effect is indescribable.
        */
      @SerialVersionUID(0L)
      case object NONE extends Semantic(0) with Semantic.Recognized {
        val index = 0
        val name = "NONE"
        override def isNone: _root_.scala.Boolean = true
      }
      
      /** The element is set or otherwise mutated.
        */
      @SerialVersionUID(0L)
      case object SET extends Semantic(1) with Semantic.Recognized {
        val index = 1
        val name = "SET"
        override def isSet: _root_.scala.Boolean = true
      }
      
      /** An alias to the element is returned.
        */
      @SerialVersionUID(0L)
      case object ALIAS extends Semantic(2) with Semantic.Recognized {
        val index = 2
        val name = "ALIAS"
        override def isAlias: _root_.scala.Boolean = true
      }
      
      @SerialVersionUID(0L)
      final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends Semantic(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
      lazy val values: scala.collection.immutable.Seq[ValueType] = scala.collection.immutable.Seq(NONE, SET, ALIAS)
      def fromValue(__value: _root_.scala.Int): Semantic = __value match {
        case 0 => NONE
        case 1 => SET
        case 2 => ALIAS
        case __other => Unrecognized(__other)
      }
      def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.javaDescriptor.getEnumTypes().get(0)
      def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.scalaDescriptor.enums(0)
      def fromJavaValue(pbJavaSource: com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic): Semantic = fromValue(pbJavaSource.getNumber)
      def toJavaValue(pbScalaSource: Semantic): com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic = {
        _root_.scala.Predef.require(!pbScalaSource.isUnrecognized, "Unrecognized enum values can not be converted to Java")
        com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic.forNumber(pbScalaSource.value)
      }
    }
    implicit class AnnotationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation](_l) {
      def path: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.path)((c_, f_) => c_.copy(path = f_))
      def sourceFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getSourceFile)((c_, f_) => c_.copy(sourceFile = _root_.scala.Option(f_)))
      def optionalSourceFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.sourceFile)((c_, f_) => c_.copy(sourceFile = f_))
      def begin: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getBegin)((c_, f_) => c_.copy(begin = _root_.scala.Option(f_)))
      def optionalBegin: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.begin)((c_, f_) => c_.copy(begin = f_))
      def end: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getEnd)((c_, f_) => c_.copy(end = _root_.scala.Option(f_)))
      def optionalEnd: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.end)((c_, f_) => c_.copy(end = f_))
      def semantic: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic] = field(_.getSemantic)((c_, f_) => c_.copy(semantic = _root_.scala.Option(f_)))
      def optionalSemantic: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic]] = field(_.semantic)((c_, f_) => c_.copy(semantic = f_))
    }
    final val PATH_FIELD_NUMBER = 1
    final val SOURCE_FILE_FIELD_NUMBER = 2
    final val BEGIN_FIELD_NUMBER = 3
    final val END_FIELD_NUMBER = 4
    final val SEMANTIC_FIELD_NUMBER = 5
    def of(
      path: _root_.scala.Seq[_root_.scala.Int],
      sourceFile: _root_.scala.Option[_root_.scala.Predef.String],
      begin: _root_.scala.Option[_root_.scala.Int],
      end: _root_.scala.Option[_root_.scala.Int],
      semantic: _root_.scala.Option[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Semantic]
    ): _root_.com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = _root_.com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
      path,
      sourceFile,
      begin,
      end,
      semantic
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.GeneratedCodeInfo.Annotation])
  }
  
  implicit class GeneratedCodeInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo](_l) {
    def annotation: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]] = field(_.annotation)((c_, f_) => c_.copy(annotation = f_))
  }
  final val ANNOTATION_FIELD_NUMBER = 1
  def of(
    annotation: _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]
  ): _root_.com.google.protobuf.descriptor.GeneratedCodeInfo = _root_.com.google.protobuf.descriptor.GeneratedCodeInfo(
    annotation
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.GeneratedCodeInfo])
}
