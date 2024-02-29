package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hz")
final class Class313 implements Interface28 {

	@OriginalMember(owner = "client!hz", name = "p", descriptor = "(Ljava/lang/String;S)J", line = 20)
	@Override
	public long method27310(@OriginalArg(0) String arg0) {
		return Class227.method25797(arg0);
	}

	@OriginalMember(owner = "client!hz", name = "c", descriptor = "(Ljava/lang/String;)J", line = 20)
	@Override
	public long method27309(@OriginalArg(0) String arg0) {
		return Class227.method25797(arg0);
	}

	@OriginalMember(owner = "client!hz", name = "v", descriptor = "(Ljava/lang/String;)J", line = 20)
	@Override
	public long method27308(@OriginalArg(0) String arg0) {
		return Class227.method25797(arg0);
	}

	@OriginalMember(owner = "client!hz", name = "l", descriptor = "(Ljava/lang/String;)J", line = 20)
	@Override
	public long method27311(@OriginalArg(0) String arg0) {
		return Class227.method25797(arg0);
	}

	@OriginalMember(owner = "client!hz", name = "v", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 26)
	public static File method27312(@OriginalArg(0) String arg0) {
		if (!Class509.aBoolean775) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) Class509.aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(21) File local21 = new File(Class509.aFile3, arg0);
		@Pc(23) RandomAccessFile local23 = null;
		try {
			@Pc(29) File local29 = new File(local21.getParent());
			if (!local29.exists()) {
				throw new RuntimeException("");
			}
			local23 = new RandomAccessFile(local21, "rw");
			@Pc(46) int local46 = local23.read();
			local23.seek(0L);
			local23.write(local46);
			local23.seek(0L);
			local23.close();
			Class509.aHashtable9.put(arg0, local21);
			return local21;
		} catch (@Pc(65) Exception local65) {
			try {
				if (local23 != null) {
					local23.close();
					local23 = null;
				}
			} catch (@Pc(73) Exception local73) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hz", name = "n", descriptor = "(IIZS)V", line = 868)
	static void method27313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class156.aBooleanArrayArray11[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!hz", name = "apn", descriptor = "(Lclient!yf;B)V", line = 12194)
	static final void method27314(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
	}

	@OriginalMember(owner = "client!hz", name = "mz", descriptor = "(I)Ljava/lang/String;", line = 12387)
	public static String method27315() {
		return Class246.method26128("www", false);
	}
}
