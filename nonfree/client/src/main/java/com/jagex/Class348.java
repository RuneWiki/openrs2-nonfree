package com.jagex;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public class Class348 {

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
	static final int anInt4625 = 10;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
	static final int anInt4627 = 60000;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
	static final int anInt4628 = 10000;

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
	static final int anInt4629 = 10000;

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
	static final int anInt4630 = 2;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "J")
	long aLong263;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	volatile int anInt4626 = 0;

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService anExecutorService1 = Executors.newFixedThreadPool(2);

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "Z")
	boolean aBoolean721 = false;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Ljava/lang/String;")
	String aString209;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	int anInt4624;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	final int anInt4623;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/lang/String;II)V", line = 24)
	public Class348(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString209 = arg0;
		this.anInt4624 = arg1 * 477113249;
		this.anInt4623 = arg2 * 136528829;
	}

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "(Ljava/lang/String;I)V", line = 31)
	public void method26545(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString209 = arg0;
		this.anInt4624 = arg1 * 477113249;
	}

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "(Ljava/lang/String;I)V", line = 31)
	public void method26551(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString209 = arg0;
		this.anInt4624 = arg1 * 477113249;
	}

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "(Ljava/lang/String;IB)V", line = 31)
	public void method26552(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString209 = arg0;
		this.anInt4624 = arg1 * 477113249;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)Z", line = 36)
	boolean method26544() {
		return this.anInt4626 * -1475142477 >= 10;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "()Z", line = 36)
	boolean method26550() {
		return this.anInt4626 * -1475142477 >= 10;
	}

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)Lclient!aok;", line = 40)
	Class3_Sub1_Sub12_Sub1 method26542() {
		return this.method26546(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "()Lclient!aok;", line = 40)
	Class3_Sub1_Sub12_Sub1 method26553() {
		return this.method26546(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "(IIBZIII)Lclient!aok;", line = 44)
	Class3_Sub1_Sub12_Sub1 method26546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method26544()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean721 && !local33) {
				return null;
			} else if (this.aLong263 * 3867315579094338911L + 10000L >= Class176.method23413()) {
				return null;
			} else {
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class176.method23413();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				@Pc(112) URL local112;
				try {
					local112 = new URL("http", this.aString209, this.anInt4624 * 697071713, "/ms?m=" + this.anInt4623 * 1004507029 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class3_Sub1_Sub12_Sub1 local121 = new Class3_Sub1_Sub12_Sub1(arg2);
				local121.aBoolean515 = arg3;
				this.anInt4626 += 1402008187;
				@Pc(140) Future local140 = this.anExecutorService1.submit(new Class351(this, local112, local121));
				local121.method20932(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "(IIBZII)Lclient!aok;", line = 44)
	Class3_Sub1_Sub12_Sub1 method26554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method26544()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean721 && !local33) {
				return null;
			} else if (this.aLong263 * 3867315579094338911L + 10000L >= Class176.method23413()) {
				return null;
			} else {
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class176.method23413();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				@Pc(112) URL local112;
				try {
					local112 = new URL("http", this.aString209, this.anInt4624 * 697071713, "/ms?m=" + this.anInt4623 * 1004507029 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class3_Sub1_Sub12_Sub1 local121 = new Class3_Sub1_Sub12_Sub1(arg2);
				local121.aBoolean515 = arg3;
				this.anInt4626 += 1402008187;
				@Pc(140) Future local140 = this.anExecutorService1.submit(new Class351(this, local112, local121));
				local121.method20932(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "(IIBZII)Lclient!aok;", line = 44)
	Class3_Sub1_Sub12_Sub1 method26555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method26544()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean721 && !local33) {
				return null;
			} else if (this.aLong263 * 3867315579094338911L + 10000L >= Class176.method23413()) {
				return null;
			} else {
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class176.method23413();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				@Pc(112) URL local112;
				try {
					local112 = new URL("http", this.aString209, this.anInt4624 * 697071713, "/ms?m=" + this.anInt4623 * 1004507029 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class3_Sub1_Sub12_Sub1 local121 = new Class3_Sub1_Sub12_Sub1(arg2);
				local121.aBoolean515 = arg3;
				this.anInt4626 += 1402008187;
				@Pc(140) Future local140 = this.anExecutorService1.submit(new Class351(this, local112, local121));
				local121.method20932(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "(B)V", line = 72)
	void method26547() {
		this.anInt4626 -= 1402008187;
	}

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "(I)V", line = 76)
	public void method26548() {
		this.anExecutorService1.shutdown();
	}

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "()V", line = 76)
	public void method26556() {
		this.anExecutorService1.shutdown();
	}

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "([[B[[B[I[B[IIIB)I", line = 76)
	static int method26562(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = arg4[arg5] + local3;
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local39) {
			local39 = arg3[arg6] & 0xFF;
		}
		@Pc(56) byte[] local56 = arg1[arg5];
		@Pc(60) byte[] local60 = arg0[arg6];
		@Pc(64) int local64 = local21 - local3;
		@Pc(68) int local68 = local21 - local13;
		for (@Pc(70) int local70 = local21; local70 < local28; local70++) {
			@Pc(83) int local83 = local56[local64++] + local60[local68++];
			if (local83 < local39) {
				local39 = local83;
			}
		}
		return -local39;
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(Z)V", line = 80)
	void method26543(@OriginalArg(0) boolean arg0) {
		this.aBoolean721 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "(ZI)V", line = 80)
	void method26549(@OriginalArg(0) boolean arg0) {
		this.aBoolean721 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "(Z)V", line = 80)
	void method26557(@OriginalArg(0) boolean arg0) {
		this.aBoolean721 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(Z)V", line = 80)
	void method26558(@OriginalArg(0) boolean arg0) {
		this.aBoolean721 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lclient!xz;", line = 364)
	public static Class592 method26559(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class510.aFile4, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class592(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class284.anInt4354 * 1372763379 == 33) {
			local29 = "_rc";
		} else if (Class284.anInt4354 * 1372763379 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class406.aString218, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class592(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class592(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nl", name = "ub", descriptor = "(Lclient!vs;I)V", line = 7732)
	static final void method26560(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class229.method24532(local13, local23, false);
	}

	@OriginalMember(owner = "client!nl", name = "afa", descriptor = "(Lclient!vs;B)V", line = 9870)
	static final void method26561(@OriginalArg(0) Class536 arg0) {
	}
}
