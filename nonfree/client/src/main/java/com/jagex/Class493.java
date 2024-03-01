package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public class Class493 {

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	static final int anInt5163 = 2;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	static final int anInt5164 = 60000;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
	static final int anInt5166 = 10;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
	static final int anInt5168 = 10000;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	static final int anInt5169 = 10000;

	@OriginalMember(owner = "client!pu", name = "fe", descriptor = "Lclient!py;")
	public static Class497 aClass497_124;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "J")
	long aLong282;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
	volatile int anInt5167 = 0;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService anExecutorService2 = Executors.newFixedThreadPool(2);

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Z")
	boolean aBoolean781 = false;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Ljava/lang/String;")
	String aString218;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	int anInt5165;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
	final int anInt5170;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/lang/String;II)V", line = 24)
	public Class493(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString218 = arg0;
		this.anInt5165 = arg1 * 1397175519;
		this.anInt5170 = arg2 * -776423417;
	}

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "(Lclient!akt;I)Lclient!akt;", line = 27)
	public static Class93_Sub30 method30015(@OriginalArg(0) Class93_Sub30 arg0) {
		@Pc(2) Class93_Sub30[] local2 = Class93_Sub30.aClass93_Sub30Array1;
		synchronized (Class93_Sub30.aClass93_Sub30Array1) {
			if (Class509.anInt5206 * 672498035 == 0) {
				return new Class93_Sub30(arg0);
			} else {
				Class93_Sub30.aClass93_Sub30Array1[(Class509.anInt5206 -= -1799648325) * 672498035].method13885(arg0);
				return Class93_Sub30.aClass93_Sub30Array1[Class509.anInt5206 * 672498035];
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)Z", line = 31)
	boolean method29985() {
		return this.anInt5167 * -843676671 >= 10;
	}

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "()Z", line = 31)
	boolean method29991() {
		return this.anInt5167 * -843676671 >= 10;
	}

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "()Z", line = 31)
	boolean method30001() {
		return this.anInt5167 * -843676671 >= 10;
	}

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "(I)Lclient!atb;", line = 35)
	Class93_Sub1_Sub16_Sub1 method29986() {
		return this.method30005(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "()Lclient!atb;", line = 35)
	Class93_Sub1_Sub16_Sub1 method29992() {
		return this.method30005(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "()Lclient!atb;", line = 35)
	Class93_Sub1_Sub16_Sub1 method29994() {
		return this.method30005(255, 255, (byte) 0, true, 0, 0);
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(IIBZII)Lclient!atb;", line = 39)
	Class93_Sub1_Sub16_Sub1 method29993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method29985()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean781 && !local33) {
				return null;
			} else if (this.aLong282 * 5663573980390976855L + 10000L >= Class305.method26796()) {
				return null;
			} else {
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26796();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				@Pc(112) URL local112;
				try {
					local112 = new URL("http", this.aString218, this.anInt5165 * 1264682783, "/ms?m=" + this.anInt5170 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean544 = arg3;
				this.anInt5167 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local112, local121));
				local121.method23311(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(IIBZII)Lclient!atb;", line = 39)
	Class93_Sub1_Sub16_Sub1 method29995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method29985()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean781 && !local33) {
				return null;
			} else if (this.aLong282 * 5663573980390976855L + 10000L >= Class305.method26796()) {
				return null;
			} else {
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26796();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				@Pc(112) URL local112;
				try {
					local112 = new URL("http", this.aString218, this.anInt5165 * 1264682783, "/ms?m=" + this.anInt5170 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean544 = arg3;
				this.anInt5167 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local112, local121));
				local121.method23311(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "(IIBZII)Lclient!atb;", line = 39)
	Class93_Sub1_Sub16_Sub1 method29997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method29985()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean781 && !local33) {
				return null;
			} else if (this.aLong282 * 5663573980390976855L + 10000L >= Class305.method26796()) {
				return null;
			} else {
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26796();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				@Pc(112) URL local112;
				try {
					local112 = new URL("http", this.aString218, this.anInt5165 * 1264682783, "/ms?m=" + this.anInt5170 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean544 = arg3;
				this.anInt5167 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local112, local121));
				local121.method23311(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "(IIBZIII)Lclient!atb;", line = 39)
	Class93_Sub1_Sub16_Sub1 method30005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method29985()) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean781 && !local33) {
				return null;
			} else if (this.aLong282 * 5663573980390976855L + 10000L >= Class305.method26796()) {
				return null;
			} else {
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26796();
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				@Pc(112) URL local112;
				try {
					local112 = new URL("http", this.aString218, this.anInt5165 * 1264682783, "/ms?m=" + this.anInt5170 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean544 = arg3;
				this.anInt5167 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local112, local121));
				local121.method23311(local140);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "(I)V", line = 67)
	void method29988() {
		this.anInt5167 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "()V", line = 67)
	void method29989() {
		this.anInt5167 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "()V", line = 67)
	void method29998() {
		this.anInt5167 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "()V", line = 67)
	void method29999() {
		this.anInt5167 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "()V", line = 71)
	public void method29987() {
		this.anExecutorService2.shutdown();
	}

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "()V", line = 71)
	public void method29996() {
		this.anExecutorService2.shutdown();
	}

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V", line = 71)
	public void method30000() {
		this.anExecutorService2.shutdown();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V", line = 75)
	void method29984(@OriginalArg(0) boolean arg0) {
		this.aBoolean781 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "(ZB)V", line = 75)
	void method29990(@OriginalArg(0) boolean arg0) {
		this.aBoolean781 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "(Z)V", line = 75)
	void method30002(@OriginalArg(0) boolean arg0) {
		this.aBoolean781 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(Z)V", line = 75)
	void method30003(@OriginalArg(0) boolean arg0) {
		this.aBoolean781 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "(Z)V", line = 75)
	void method30004(@OriginalArg(0) boolean arg0) {
		this.aBoolean781 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(Z)V", line = 75)
	void method30006(@OriginalArg(0) boolean arg0) {
		this.aBoolean781 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "(IIZZI)I", line = 79)
	public static int method30014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31065(arg0, arg3);
		if (local4 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local4.anIntArray173.length; local12++) {
			if (local4.anIntArray173[local12] >= 0 && local4.anIntArray173[local12] < Class277.aClass32_Sub12_1.anInt2487 * -152478627) {
				@Pc(40) Class47 local40 = (Class47) Class277.aClass32_Sub12_1.method18261(local4.anIntArray173[local12]);
				@Pc(53) int local53 = local40.method945(arg1, ((Class87) Class124.aClass32_Sub21_7.method18261(arg1)).anInt265 * 951920133);
				if (arg2) {
					local10 += local53 * local4.anIntArray174[local12];
				} else if (local4.anIntArray174[local12] > 0) {
					local10 += local53;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(Lclient!yf;B)V", line = 4838)
	static final void method30007(@OriginalArg(0) Class681 arg0) {
		@Pc(9) Class108 local9 = (Class108) arg0.aClass93_Sub1_Sub13_1.anObjectArray5[arg0.anInt5889 * -709694321];
		@Pc(31) Interface20 local31 = (Interface20) (arg0.anIntArray520[arg0.anInt5889 * -709694321] == 0 ? arg0.aMap26.get(local9.aClass138_6) : arg0.aMap25.get(local9.aClass138_6));
		@Pc(36) Class500 local36 = local9.aClass519_6.method30311();
		if (local36 == Class500.aClass500_6) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local31.method33455(local9);
		} else if (local36 == Class500.aClass500_3) {
			arg0.aLongArray27[(arg0.anInt5894 += -1364417339) * -2000995827 - 1] = local31.method33465(local9);
		} else if (local36 == Class500.aClass500_2) {
			try {
				@Pc(89) String local89 = (String) local31.method33467(local9);
				if (local89 == null) {
					local89 = "null";
				}
				arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local89;
			} catch (@Pc(110) Exception local110) {
				throw new RuntimeException(local110);
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pu", name = "sg", descriptor = "(Lclient!hf;Lclient!yf;I)V", line = 8342)
	static final void method30008(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1) {
		@Pc(5) Class5 local5 = arg0.method26851(Class157.aClass462_2, client.anInterface50_1);
		@Pc(18) int local18 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(31) int local31 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(48) int local48 = local5.method46(arg0.aString164, arg0.anInt3981 * 1215292027, arg0.anInt4005 * -889720761, local31, local18, Class110_Sub14.aClass100Array4);
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local48;
	}

	@OriginalMember(owner = "client!pu", name = "adc", descriptor = "(Lclient!yf;I)V", line = 10090)
	static final void method30009(@OriginalArg(0) Class681 arg0) {
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = arg0.aClass93_Sub28_4.aString44;
	}

	@OriginalMember(owner = "client!pu", name = "ji", descriptor = "(Lclient!ax;Lclient!hf;IIII)V", line = 10239)
	static void method30013(@OriginalArg(0) Class175 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class93_Sub22 local8;
		if (arg2 == 1) {
			local8 = Class102.method2592(Class446.aClass446_113, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 2) {
			local8 = Class102.method2592(Class446.aClass446_49, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 3) {
			local8 = Class102.method2592(Class446.aClass446_88, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 4) {
			local8 = Class102.method2592(Class446.aClass446_33, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 5) {
			local8 = Class102.method2592(Class446.aClass446_72, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 6) {
			local8 = Class102.method2592(Class446.aClass446_85, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 7) {
			local8 = Class102.method2592(Class446.aClass446_65, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 8) {
			local8 = Class102.method2592(Class446.aClass446_52, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 9) {
			local8 = Class102.method2592(Class446.aClass446_68, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
		if (arg2 == 10) {
			local8 = Class102.method2592(Class446.aClass446_69, arg0.aClass24_2);
			Class484.method29791(local8, arg3, arg4, arg1.anInt4045 * 307668159);
			arg0.method24351(local8);
		}
	}

	@OriginalMember(owner = "client!pu", name = "arq", descriptor = "(Lclient!yf;I)V", line = 12992)
	static final void method30012(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub7_1, local12);
		client.aClass532_1.method30469();
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!pu", name = "asn", descriptor = "(Lclient!yf;I)V", line = 13153)
	static final void method30010(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 < 0 || local12 > 5 || local12 == 2) {
			local12 = 3;
		}
		Class543.method30948(local12, false);
	}

	@OriginalMember(owner = "client!pu", name = "axu", descriptor = "(Lclient!yf;B)V", line = 13953)
	static final void method30011(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18261(local23);
		if (local29.method1508()) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class322) Class542.aClass32_Sub2_3.method18261(local13)).method27257(local23, local29.aString11);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class322) Class542.aClass32_Sub2_3.method18261(local13)).method27256(local23, local29.anInt265 * 951920133);
		}
	}
}
