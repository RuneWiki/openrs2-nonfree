package com.jagex;

import java.awt.Canvas;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public class Class470 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	static final int anInt4992 = 10000;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "I")
	static final int anInt4994 = 2;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "I")
	static final int anInt4995 = 60000;

	@OriginalMember(owner = "client!po", name = "x", descriptor = "I")
	static final int anInt4996 = 10000;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	static final int anInt4997 = 10;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Ljava/awt/Font;")
	static Font aFont2;

	@OriginalMember(owner = "client!po", name = "fs", descriptor = "Lclient!pw;")
	public static Class478 aClass478_125;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "J")
	long aLong277;

	@OriginalMember(owner = "client!po", name = "y", descriptor = "I")
	volatile int anInt4993 = 0;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService anExecutorService1 = Executors.newFixedThreadPool(2);

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Z")
	boolean aBoolean754 = false;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "Ljava/lang/String;")
	String aString217;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	int anInt4991;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "I")
	final int anInt4990;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;II)V", line = 24)
	public Class470(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString217 = arg0;
		this.anInt4991 = arg1 * -1195386527;
		this.anInt4990 = arg2 * -1036106071;
	}

	@OriginalMember(owner = "client!po", name = "w", descriptor = "(Lclient!aiw;I)V", line = 28)
	static void method29597(@OriginalArg(0) Class131_Sub4 arg0) {
		arg0.aClass104_Sub1_Sub1_Sub1_1 = null;
		if (Class131_Sub4.anInt1438 * 1885450739 < 20) {
			Class131_Sub4.aClass703_2.method36525(arg0);
			Class131_Sub4.anInt1438 += 816205627;
		}
	}

	@OriginalMember(owner = "client!po", name = "p", descriptor = "(I)Z", line = 31)
	boolean method29598() {
		return this.anInt4993 * 728104507 >= 10;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)Lclient!ata;", line = 35)
	Class77_Sub1_Sub18_Sub1 method29599() {
		return this.method29604(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!po", name = "q", descriptor = "()Lclient!ata;", line = 35)
	Class77_Sub1_Sub18_Sub1 method29600() {
		return this.method29604(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!po", name = "x", descriptor = "()Lclient!ata;", line = 35)
	Class77_Sub1_Sub18_Sub1 method29601() {
		return this.method29604(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!po", name = "t", descriptor = "()Lclient!ata;", line = 35)
	Class77_Sub1_Sub18_Sub1 method29602() {
		return this.method29604(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(IIBZII)Lclient!ata;", line = 39)
	Class77_Sub1_Sub18_Sub1 method29603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method29598()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean754 && !local33) {
				return null;
			} else if (this.aLong277 * -3745950328826741227L + 10000L >= Class280.method26667()) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class280.method26667();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString217, this.anInt4991 * -1570075999, "/ms?m=" + this.anInt4990 * -2066367079 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class77_Sub1_Sub18_Sub1 local121 = new Class77_Sub1_Sub18_Sub1(arg2);
				local121.aBoolean538 = arg3;
				this.anInt4993 += -1915868429;
				@Pc(140) Future local140 = this.anExecutorService1.submit(new Class476(this, local54, local121));
				local121.method23654(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "v", descriptor = "(IIBZIII)Lclient!ata;", line = 39)
	Class77_Sub1_Sub18_Sub1 method29604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method29598()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean754 && !local33) {
				return null;
			} else if (this.aLong277 * -3745950328826741227L + 10000L >= Class280.method26667()) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class280.method26667();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString217, this.anInt4991 * -1570075999, "/ms?m=" + this.anInt4990 * -2066367079 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class77_Sub1_Sub18_Sub1 local121 = new Class77_Sub1_Sub18_Sub1(arg2);
				local121.aBoolean538 = arg3;
				this.anInt4993 += -1915868429;
				@Pc(140) Future local140 = this.anExecutorService1.submit(new Class476(this, local54, local121));
				local121.method23654(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "l", descriptor = "(B)V", line = 67)
	void method29605() {
		this.anInt4993 -= -1915868429;
	}

	@OriginalMember(owner = "client!po", name = "s", descriptor = "()V", line = 67)
	void method29606() {
		this.anInt4993 -= -1915868429;
	}

	@OriginalMember(owner = "client!po", name = "r", descriptor = "()V", line = 71)
	public void method29607() {
		this.anExecutorService1.shutdown();
	}

	@OriginalMember(owner = "client!po", name = "y", descriptor = "(I)V", line = 71)
	public void method29608() {
		this.anExecutorService1.shutdown();
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "()V", line = 71)
	public void method29609() {
		this.anExecutorService1.shutdown();
	}

	@OriginalMember(owner = "client!po", name = "w", descriptor = "(ZI)V", line = 75)
	void method29610(@OriginalArg(0) boolean arg0) {
		this.aBoolean754 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "j", descriptor = "(Z)V", line = 75)
	void method29611(@OriginalArg(0) boolean arg0) {
		this.aBoolean754 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "z", descriptor = "(Z)V", line = 75)
	void method29612(@OriginalArg(0) boolean arg0) {
		this.aBoolean754 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "v", descriptor = "(B)V", line = 86)
	public static final void method29613() {
		@Pc(4) Class77_Sub4 local4;
		for (local4 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36395(); local4 != null; local4 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36406()) {
			if (local4.aBoolean324) {
				local4.method24063();
			} else {
				local4.aBoolean323 = true;
				if (local4.anInt1452 * -1522052283 >= 0 && local4.anInt1454 * -1246362377 >= 0 && local4.anInt1452 * -1522052283 < client.aClass517_1.method30411() && local4.anInt1454 * -1246362377 < client.aClass517_1.method30417()) {
					Class258.method26230(local4);
				}
			}
		}
		for (local4 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36395(); local4 != null; local4 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36406()) {
			if (local4.aBoolean324) {
				local4.method24063();
			} else {
				local4.aBoolean323 = true;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "bn", descriptor = "(Lclient!yf;B)V", line = 4736)
	static final void method29614(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 == null) {
			return;
		}
		@Pc(29) int local29;
		for (local29 = 0; local29 < Class351.anIntArray446.length; local29++) {
			if (Class351.anIntArray446[local29] == local13) {
				Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.method32545(local29, local23, Class333.aClass35_Sub14_1);
				return;
			}
		}
		for (local29 = 0; local29 < Class351.anIntArray445.length; local29++) {
			if (Class351.anIntArray445[local29] == local13) {
				Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.method32545(local29, local23, Class333.aClass35_Sub14_1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "jx", descriptor = "(Lclient!yf;B)V", line = 6199)
	static final void method29615(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class92.method23488(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!po", name = "wo", descriptor = "(Lclient!yf;I)V", line = 8517)
	static final void method29616(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean629 ? 1 : 0;
	}

	@OriginalMember(owner = "client!po", name = "xe", descriptor = "(Lclient!yf;I)V", line = 8646)
	static final void method29617(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (Class157.aString127 != null && Class157.aString127.equalsIgnoreCase(local13)) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!po", name = "jq", descriptor = "(II)V", line = 9584)
	static final void method29618(@OriginalArg(0) int arg0) {
		@Pc(2) Class77_Sub39_Sub1 local2 = client.aClass82_2.aClass77_Sub39_Sub1_1;
		while (local2.method22195(client.aClass82_2.anInt327 * -1013636781) >= 15) {
			@Pc(17) int local17 = local2.method22189(15);
			if (local17 == 32767) {
				break;
			}
			@Pc(23) boolean local23 = false;
			@Pc(29) Class77_Sub6 local29 = (Class77_Sub6) client.aClass12_22.method173((long) local17);
			@Pc(38) Class104_Sub1_Sub1_Sub1_Sub1 local38;
			if (local29 == null) {
				local38 = new Class104_Sub1_Sub1_Sub1_Sub1(client.aClass517_1.method30435());
				local38.anInt2867 = local17 * -2061161143;
				local29 = new Class77_Sub6(local38);
				client.aClass12_22.method184(local29, (long) local17);
				client.aClass77_Sub6Array1[(client.anInt3438 += 1085173643) * 759971875 - 1] = local29;
				local23 = true;
			}
			local38 = (Class104_Sub1_Sub1_Sub1_Sub1) local29.anObject5;
			client.anIntArray317[(client.anInt3527 += 590354627) * -1125820437 - 1] = local17;
			local38.anInt2894 = client.anInt3411 * -526016129;
			if (local38.aClass333_1 != null && local38.aClass333_1.method27652()) {
				Class689.method36313(local38);
			}
			@Pc(105) int local105 = local2.method22189(1);
			if (local105 == 1) {
				client.anIntArray341[(client.anInt3410 += 382245089) * 1422306081 - 1] = local17;
			}
			local38.method19810((Class333) Class578.aClass35_Sub3_1.method18319(local2.method22189(15)));
			@Pc(136) int local136 = local2.method22189(2);
			@Pc(147) int local147 = local2.method22189(3) + 4 << 11 & 0x3FFF;
			@Pc(152) int local152 = local2.method22189(1);
			@Pc(157) int local157 = local2.method22189(arg0);
			if (local157 > (0x1 << arg0 - 1) - 1) {
				local157 -= 0x1 << arg0;
			}
			@Pc(177) int local177 = local2.method22189(arg0);
			if (local177 > (0x1 << arg0 - 1) - 1) {
				local177 -= 0x1 << arg0;
			}
			local38.method21092(local38.aClass333_1.anInt4117 * -1821838479);
			local38.anInt2897 = (local38.aClass333_1.anInt4112 * -1373680215 << 3) * 1883849079;
			if (local23) {
				local38.method21070(local147, true);
			}
			local38.method19822(local136, local177 + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0], local157 + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0], local152 == 1, local38.method21095());
			if (local38.aClass333_1.method27652()) {
				Class458.method29495(local38.aByte100, local38.anIntArray274[0], local38.anIntArray275[0], 0, null, local38, null);
			}
			if (local23) {
				local38.method19805();
			}
		}
		local2.method22192();
	}

	@OriginalMember(owner = "client!po", name = "awt", descriptor = "(Lclient!yf;I)V", line = 13292)
	static final void method29619(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1.method16264(local12);
	}

	@OriginalMember(owner = "client!po", name = "ayv", descriptor = "(Lclient!yf;I)V", line = 13663)
	static final void method29620(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593;
	}
}
