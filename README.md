# Java-Letter
灵感来源于Android Parcelable，提供对对象的简单序列化和反序列化操作工具，可用于Java IPC（包括网络通信）、存储、反序列化等应用。

Inspired by Androidable Parcel, it provides simple serialization and deserialization tools for objects for Java IPC (including network communications), storage, deserialization and more.

Letter的设计目标，Java的Parcelable，比Google ProtoBuf更加方便使用。

Letter's design target, Java Parcelable, is more user-friendly than Google ProtoBuf.

# 使用示例（The example）
在工程根目录的 Letter/src/main/java/com/trb/java/letter/test/Test.java 类中有详细的示例代码。

Detailed sample code in the Letter/src/main/java/com/trb/java/letter/test/Test.java class

# 像Android Parcelable一样使用（Use like Android Parcelable）
Letter的使用方式跟Android Parcelable一样。

Letter is used in the same way as Android Parcelable.

# 像Google ProtoBuf一样使用（Use like Google ProtoBuf）
虽然现在Letter的实现可能没有Google ProtoBuf一样高效，但是我认为替代JSON还是可行的。

While Letter's implementation may not be as efficient now as Google ProtoBuf, I think it's possible to replace JSON.
