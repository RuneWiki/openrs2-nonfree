package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xq")
public abstract class Class72 {

	@OriginalMember(owner = "client!xq", name = "fg", descriptor = "Lclient!ny;")
	public static Class359 aClass359_23;

	@OriginalMember(owner = "client!xq", name = "tm", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!xq", name = "a", descriptor = "I")
	int anInt2085;

	@OriginalMember(owner = "client!xq", name = "p", descriptor = "Ljava/lang/String;")
	String aString69;

	@OriginalMember(owner = "client!xq", name = "<init>", descriptor = "()V", line = 10)
	Class72() {
	}

	@OriginalMember(owner = "client!xq", name = "p", descriptor = "(I)[Lclient!vu;", line = 18)
	public static Class538[] method14644() {
		return new Class538[] { Class538.aClass538_4, Class538.aClass538_1, Class538.aClass538_3, Class538.aClass538_2, Class538.aClass538_5 };
	}

	@OriginalMember(owner = "client!xq", name = "y", descriptor = "()Ljava/net/Socket;", line = 22)
	Socket method14637() throws IOException {
		return new Socket(this.aString69, this.anInt2085 * -1214188461);
	}

	@OriginalMember(owner = "client!xq", name = "g", descriptor = "(I)Ljava/net/Socket;", line = 22)
	Socket method14638() throws IOException {
		return new Socket(this.aString69, this.anInt2085 * -1214188461);
	}

	@OriginalMember(owner = "client!xq", name = "s", descriptor = "()Ljava/net/Socket;", line = 22)
	Socket method14639() throws IOException {
		return new Socket(this.aString69, this.anInt2085 * -1214188461);
	}

	@OriginalMember(owner = "client!xq", name = "u", descriptor = "()Ljava/net/Socket;", line = 22)
	Socket method14642() throws IOException {
		return new Socket(this.aString69, this.anInt2085 * -1214188461);
	}

	@OriginalMember(owner = "client!xq", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method14636() throws IOException;

	@OriginalMember(owner = "client!xq", name = "x", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method14640() throws IOException;

	@OriginalMember(owner = "client!xq", name = "l", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method14641() throws IOException;

	@OriginalMember(owner = "client!xq", name = "h", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method14643() throws IOException;
}
