package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acu")
public class Class68 {

	@OriginalMember(owner = "client!acu", name = "c", descriptor = "Z")
	final boolean aBoolean20;

	@OriginalMember(owner = "client!acu", name = "p", descriptor = "[Lclient!acz;")
	final Class72[] aClass72Array1;

	@OriginalMember(owner = "client!acu", name = "p", descriptor = "(Ljava/io/File;I)V", line = 16)
	static void method975(@OriginalArg(0) File arg0) {
		Class509.aFile3 = arg0;
		if (!Class509.aFile3.exists()) {
			throw new RuntimeException("");
		}
		Class509.aBoolean775 = true;
	}

	@OriginalMember(owner = "client!acu", name = "d", descriptor = "(I)Lclient!zq;", line = 127)
	public static Class699 method976() {
		return Class35_Sub20.aClass699_1 == null ? Class699.aClass699_5 : Class35_Sub20.aClass699_1;
	}

	@OriginalMember(owner = "client!acu", name = "<init>", descriptor = "(Z[Lclient!acz;)V", line = 153)
	Class68(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class72[] arg1) {
		this.aBoolean20 = arg0;
		this.aClass72Array1 = arg1;
	}

	@OriginalMember(owner = "client!acu", name = "x", descriptor = "(ILjava/lang/String;ZI)V", line = 167)
	public static void method977(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (!Class539.method30909()) {
			return;
		}
		if (Class589.anInt5459 * 1832109523 != arg0) {
			Class589.aLong290 = 8972729624098644529L;
		}
		Class589.anInt5459 = arg0 * 1651628635;
		Class589.aString235 = arg1;
		Class589.aBoolean813 = arg2;
		Class668.method33179(12);
	}

	@OriginalMember(owner = "client!acu", name = "ew", descriptor = "(Lclient!yf;I)V", line = 5326)
	static final void method978(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class355.method27963(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!acu", name = "avk", descriptor = "(Lclient!yf;B)V", line = 13093)
	static final void method979(@OriginalArg(0) Class665 arg0) {
		Class261.method26280();
		Class209.method25586();
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
