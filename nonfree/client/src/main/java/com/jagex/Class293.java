package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public class Class293 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gm", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	final int anInt3915;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
	final int anInt3914;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 247)
	Class293(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.this$0 = arg0;
		this.anInt3915 = arg1.method22415() * 839503119;
		this.anInt3914 = arg1.method22413() * 2029142337;
	}

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "(Lclient!gq;)V", line = 253)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26611(this.anInt3915 * -1456766481, this.anInt3914 * -1749332287);
		arg0.method26622(this.anInt3915 * -1456766481).method26756();
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(Lclient!gq;B)V", line = 253)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0) {
		arg0.method26611(this.anInt3915 * -1456766481, this.anInt3914 * -1749332287);
		arg0.method26622(this.anInt3915 * -1456766481).method26756();
	}

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "(Lclient!gq;)V", line = 253)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26611(this.anInt3915 * -1456766481, this.anInt3914 * -1749332287);
		arg0.method26622(this.anInt3915 * -1456766481).method26756();
	}

	@OriginalMember(owner = "client!gm", name = "ew", descriptor = "(ILjava/lang/String;ZI)V", line = 2041)
	public static void method26588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 == 0) {
			Class694.aClass104_14 = Class5.method79(0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16343() * 2);
			if (arg1 != null) {
				Class694.aClass104_14.method20774(1, 0);
				@Pc(33) Class5 local33 = Class446.method28897(Class633.aClass497_137, Class393.anInt4653 * 545040483, 0, Class157.aClass462_2);
				@Pc(44) Class106 local44 = Class694.aClass104_14.method20506(local33, Class203.method24652(Class110_Sub7.aClass497_22, Class393.anInt4653 * 545040483, 0), true);
				Class555.method31053();
				Class95.method1801(arg1, true, Class694.aClass104_14, local44, local33);
			}
		} else {
			label245: {
				@Pc(56) Class104 local56 = null;
				if (arg1 != null) {
					local56 = Class5.method79(0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, 0);
					local56.method20774(1, 0);
					@Pc(82) Class5 local82 = Class219.method25513(Class633.aClass497_137, Class393.anInt4653 * 545040483, 0);
					@Pc(93) Class106 local93 = local56.method20506(local82, Class203.method24652(Class110_Sub7.aClass497_22, Class393.anInt4653 * 545040483, 0), true);
					Class555.method31053();
					Class95.method1801(arg1, true, local56, local93, local82);
					try {
						local56.method20877();
						local56 = null;
					} catch (@Pc(109) Throwable local109) {
					}
				}
				try {
					try {
						Class507.method30229();
						System.gc();
						Class694.aClass104_14 = Class5.method79(arg0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16343() * 2);
						Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class110_Sub7.aClass497_22, Class633.aClass497_137, Class173.method23800());
						if (Class694.aClass104_14.method20493()) {
							@Pc(143) boolean local143 = true;
							try {
								local143 = Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 > 256;
							} catch (@Pc(155) Throwable local155) {
							}
							@Pc(161) Class93_Sub35 local161;
							if (local143) {
								local161 = Class694.aClass104_14.method20520(146800640);
							} else {
								local161 = Class694.aClass104_14.method20520(104857600);
							}
							Class694.aClass104_14.method20494(local161);
						}
						break label245;
					} catch (@Pc(178) Throwable local178) {
						switch(arg0) {
							case 1:
								Class481.method29755(Class73.aClass73_12);
								break;
							case 3:
								Class481.method29755(Class73.aClass73_5);
						}
					}
					if (local178 instanceof RuntimeException_Sub2) {
						Class51.aClass93_Sub36_1.aClass166_Sub39_2.method16545(0);
						Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16545(0);
					}
					@Pc(205) int local205 = Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424();
					Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_2, 0);
					if (local56 != null) {
						try {
							local56.method20877();
							local56 = null;
						} catch (@Pc(220) Throwable local220) {
						}
					}
					Class507.method30229();
					System.gc();
					method26588(local205, arg1, arg2);
				} finally {
					if (local56 != null) {
						try {
							local56.method20877();
						} catch (@Pc(244) Throwable local244) {
						}
					}
				}
				return;
			}
		}
		if (arg2) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, !arg2);
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_2, arg0);
		if (!arg2) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, !arg2);
		}
		Class93_Sub16.method13573();
		Class694.aClass104_14.method20831(20000);
		Class694.aClass104_14.method20523(32);
		client.aClass532_1.method30536();
		if (Class694.aClass104_14.method20565()) {
			Class154.method14145(Class51.aClass93_Sub36_1.aClass166_Sub28_1.method16037() == 1);
		}
		client.aClass532_1.method30453(true);
		client.aClass532_1.method30532().method33003();
		Class165.method15319();
		client.aBoolean601 = false;
		client.aBoolean602 = false;
		client.aBoolean609 = true;
		Class53.aClass14Array2 = null;
		Class694.aClass104_14.method20638(0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!gm", name = "iq", descriptor = "(I)V", line = 5593)
	static final void method26589() {
		@Pc(2) Iterator local2 = client.aClass16_21.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class93_Sub1_Sub9 local9 = (Class93_Sub1_Sub9) local2.next();
			@Pc(12) Class132_Sub1_Sub1_Sub5 local12 = local9.aClass132_Sub1_Sub1_Sub5_1;
			if (client.aClass532_1.method30459() != null && local12.method24098()) {
				client.aClass532_1.method30459().method31497(local12, true);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "iw", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6557)
	static final void method26592(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(12) int local12 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091];
		if (local12 == Class312.anInt4008 * -184372205 || Class312.anInt4039 * 437976281 == local12 || local12 == Class312.anInt3952 * -837858879 || local12 == Class312.anInt4025 * 1165943799) {
			arg0.anInt4027 = local12 * -1554422429;
		}
	}

	@OriginalMember(owner = "client!gm", name = "lp", descriptor = "(Lclient!yf;I)V", line = 6980)
	static final void method26587(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class210.method25417(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gm", name = "li", descriptor = "(Ljava/lang/String;I)I", line = 11982)
	public static final int method26590(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < client.anInt3573 * 1882800101; local8++) {
			if (arg0.equalsIgnoreCase(client.aClass177Array1[local8].aString125)) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gm", name = "ato", descriptor = "(Lclient!yf;B)V", line = 13233)
	static final void method26591(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
	}
}
