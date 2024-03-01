package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xx")
public final class Class590 {

	@OriginalMember(owner = "client!xx", name = "<init>", descriptor = "()V", line = 6)
	Class590() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xx", name = "l", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method33298(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!xx", name = "h", descriptor = "(Ljava/io/File;I)[B", line = 21)
	static byte[] method33299(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class621.method33759(arg0, local2, arg1);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!xx", name = "x", descriptor = "(Ljava/io/File;)[B", line = 31)
	public static byte[] method33300(@OriginalArg(0) File arg0) {
		return Class53_Sub2.method9975(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!xx", name = "s", descriptor = "(Ljava/io/File;)[B", line = 31)
	public static byte[] method33301(@OriginalArg(0) File arg0) {
		return Class53_Sub2.method9975(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!xx", name = "u", descriptor = "(Ljava/io/File;)[B", line = 31)
	public static byte[] method33302(@OriginalArg(0) File arg0) {
		return Class53_Sub2.method9975(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!xx", name = "ajm", descriptor = "(Lclient!vs;I)V", line = 10662)
	static final void method33304(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class72.anInt2086 * 81180077 == 5 ? 1 : 0;
	}

	@OriginalMember(owner = "client!xx", name = "arf", descriptor = "(Lclient!vs;B)V", line = 12090)
	static final void method33303(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class452 local17 = Class107.aClass454_3.method28448(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5041 * 404639277;
	}
}
