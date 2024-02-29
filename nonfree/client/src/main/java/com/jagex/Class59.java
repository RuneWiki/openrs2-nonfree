package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acj")
public class Class59 {

	@OriginalMember(owner = "client!acj", name = "p", descriptor = "[Lclient!mo;")
	public Interface46[] anInterface46Array1;

	@OriginalMember(owner = "client!acj", name = "<init>", descriptor = "()V", line = 21)
	Class59() {
	}

	@OriginalMember(owner = "client!acj", name = "p", descriptor = "(Lclient!akv;B)V", line = 24)
	void method866(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInterface46Array1 = new Interface46[arg0.method22478()];
		@Pc(8) Class406[] local8 = Class670.method33192();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface46Array1.length; local10++) {
			this.anInterface46Array1[local10] = this.method872(arg0, local8[arg0.method22478()]);
		}
	}

	@OriginalMember(owner = "client!acj", name = "w", descriptor = "(Lclient!akv;)V", line = 24)
	void method867(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInterface46Array1 = new Interface46[arg0.method22478()];
		@Pc(8) Class406[] local8 = Class670.method33192();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface46Array1.length; local10++) {
			this.anInterface46Array1[local10] = this.method872(arg0, local8[arg0.method22478()]);
		}
	}

	@OriginalMember(owner = "client!acj", name = "y", descriptor = "(Lclient!akv;)V", line = 24)
	void method868(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInterface46Array1 = new Interface46[arg0.method22478()];
		@Pc(8) Class406[] local8 = Class670.method33192();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface46Array1.length; local10++) {
			this.anInterface46Array1[local10] = this.method872(arg0, local8[arg0.method22478()]);
		}
	}

	@OriginalMember(owner = "client!acj", name = "l", descriptor = "(Lclient!akv;)V", line = 24)
	void method869(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInterface46Array1 = new Interface46[arg0.method22478()];
		@Pc(8) Class406[] local8 = Class670.method33192();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface46Array1.length; local10++) {
			this.anInterface46Array1[local10] = this.method872(arg0, local8[arg0.method22478()]);
		}
	}

	@OriginalMember(owner = "client!acj", name = "v", descriptor = "(Lclient!akv;)V", line = 24)
	void method870(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInterface46Array1 = new Interface46[arg0.method22478()];
		@Pc(8) Class406[] local8 = Class670.method33192();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface46Array1.length; local10++) {
			this.anInterface46Array1[local10] = this.method872(arg0, local8[arg0.method22478()]);
		}
	}

	@OriginalMember(owner = "client!acj", name = "q", descriptor = "(Lclient!akv;Lclient!mt;)Lclient!mo;", line = 32)
	Interface46 method871(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class406 arg1) {
		if (Class406.aClass406_5 == arg1) {
			return Class701.method36497(arg0);
		} else if (Class406.aClass406_2 == arg1) {
			return Class312.method27300(arg0);
		} else if (Class406.aClass406_1 == arg1) {
			return Class393.method28388(arg0);
		} else if (arg1 == Class406.aClass406_7) {
			return Class96_Sub18.method7708(arg0);
		} else if (Class406.aClass406_6 == arg1) {
			return Class676.method35969(arg0);
		} else if (arg1 == Class406.aClass406_3) {
			return Class676.method35968(arg0);
		} else if (Class406.aClass406_4 == arg1) {
			return Class35.method18320(arg0);
		} else if (Class406.aClass406_9 == arg1) {
			return Class42_Sub1.method17684(arg0);
		} else if (Class406.aClass406_8 == arg1) {
			return Class498.method30183(arg0);
		} else if (Class406.aClass406_10 == arg1) {
			return Class131_Sub2.method23068(arg0);
		} else if (Class406.aClass406_11 == arg1) {
			return Class11.method169(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!acj", name = "c", descriptor = "(Lclient!akv;Lclient!mt;I)Lclient!mo;", line = 32)
	Interface46 method872(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class406 arg1) {
		if (Class406.aClass406_5 == arg1) {
			return Class701.method36497(arg0);
		} else if (Class406.aClass406_2 == arg1) {
			return Class312.method27300(arg0);
		} else if (Class406.aClass406_1 == arg1) {
			return Class393.method28388(arg0);
		} else if (arg1 == Class406.aClass406_7) {
			return Class96_Sub18.method7708(arg0);
		} else if (Class406.aClass406_6 == arg1) {
			return Class676.method35969(arg0);
		} else if (arg1 == Class406.aClass406_3) {
			return Class676.method35968(arg0);
		} else if (Class406.aClass406_4 == arg1) {
			return Class35.method18320(arg0);
		} else if (Class406.aClass406_9 == arg1) {
			return Class42_Sub1.method17684(arg0);
		} else if (Class406.aClass406_8 == arg1) {
			return Class498.method30183(arg0);
		} else if (Class406.aClass406_10 == arg1) {
			return Class131_Sub2.method23068(arg0);
		} else if (Class406.aClass406_11 == arg1) {
			return Class11.method169(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!acj", name = "t", descriptor = "(Lclient!akv;Lclient!mt;)Lclient!mo;", line = 32)
	Interface46 method873(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class406 arg1) {
		if (Class406.aClass406_5 == arg1) {
			return Class701.method36497(arg0);
		} else if (Class406.aClass406_2 == arg1) {
			return Class312.method27300(arg0);
		} else if (Class406.aClass406_1 == arg1) {
			return Class393.method28388(arg0);
		} else if (arg1 == Class406.aClass406_7) {
			return Class96_Sub18.method7708(arg0);
		} else if (Class406.aClass406_6 == arg1) {
			return Class676.method35969(arg0);
		} else if (arg1 == Class406.aClass406_3) {
			return Class676.method35968(arg0);
		} else if (Class406.aClass406_4 == arg1) {
			return Class35.method18320(arg0);
		} else if (Class406.aClass406_9 == arg1) {
			return Class42_Sub1.method17684(arg0);
		} else if (Class406.aClass406_8 == arg1) {
			return Class498.method30183(arg0);
		} else if (Class406.aClass406_10 == arg1) {
			return Class131_Sub2.method23068(arg0);
		} else if (Class406.aClass406_11 == arg1) {
			return Class11.method169(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!acj", name = "x", descriptor = "(Lclient!akv;Lclient!mt;)Lclient!mo;", line = 32)
	Interface46 method874(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class406 arg1) {
		if (Class406.aClass406_5 == arg1) {
			return Class701.method36497(arg0);
		} else if (Class406.aClass406_2 == arg1) {
			return Class312.method27300(arg0);
		} else if (Class406.aClass406_1 == arg1) {
			return Class393.method28388(arg0);
		} else if (arg1 == Class406.aClass406_7) {
			return Class96_Sub18.method7708(arg0);
		} else if (Class406.aClass406_6 == arg1) {
			return Class676.method35969(arg0);
		} else if (arg1 == Class406.aClass406_3) {
			return Class676.method35968(arg0);
		} else if (Class406.aClass406_4 == arg1) {
			return Class35.method18320(arg0);
		} else if (Class406.aClass406_9 == arg1) {
			return Class42_Sub1.method17684(arg0);
		} else if (Class406.aClass406_8 == arg1) {
			return Class498.method30183(arg0);
		} else if (Class406.aClass406_10 == arg1) {
			return Class131_Sub2.method23068(arg0);
		} else if (Class406.aClass406_11 == arg1) {
			return Class11.method169(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!acj", name = "ay", descriptor = "(I)Z", line = 552)
	public static boolean method875() {
		if (Class508.aString221.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class508.aString221.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!acj", name = "amr", descriptor = "(Lclient!yf;I)V", line = 11687)
	static final void method876(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(41) Class447 local41 = Class447.method29120((float) local13, (float) local23, (float) local33);
		Class597.aClass107_Sub1_2.method8827(local41);
		local41.method29130();
	}

	@OriginalMember(owner = "client!acj", name = "mq", descriptor = "(Ljava/lang/String;I)V", line = 12078)
	public static final void method877(@OriginalArg(0) String arg0) {
		@Pc(5) int local5 = client.aBoolean629 ? 400 : 200;
		if (arg0 == null) {
			return;
		}
		if (client.anInt3529 * -1979292205 >= local5) {
			Class554.method31068(4, client.aBoolean629 ? Class44.aClass44_141.method713(Class128.aClass667_3) : Class44.aClass44_59.method713(Class128.aClass667_3));
			return;
		}
		@Pc(34) String local34 = Class471.method29622(arg0, Class33.aClass53_11);
		if (local34 == null) {
			return;
		}
		@Pc(40) int local40;
		@Pc(55) String local55;
		@Pc(86) String local86;
		for (local40 = 0; local40 < client.anInt3529 * -1979292205; local40++) {
			@Pc(49) Class162 local49 = client.aClass162Array1[local40];
			local55 = Class471.method29622(local49.aString131, Class33.aClass53_11);
			if (local55 != null && local55.equals(local34)) {
				Class554.method31068(4, arg0 + Class44.aClass44_16.method713(Class128.aClass667_3));
				return;
			}
			if (local49.aString129 != null) {
				local86 = Class471.method29622(local49.aString129, Class33.aClass53_11);
				if (local86 != null && local86.equals(local34)) {
					Class554.method31068(4, arg0 + Class44.aClass44_16.method713(Class128.aClass667_3));
					return;
				}
			}
		}
		for (local40 = 0; local40 < client.anInt3532 * 2103713403; local40++) {
			@Pc(120) Class217 local120 = client.aClass217Array1[local40];
			local55 = Class471.method29622(local120.aString169, Class33.aClass53_11);
			if (local55 != null && local55.equals(local34)) {
				Class554.method31068(4, Class44.aClass44_134.method713(Class128.aClass667_3) + arg0 + Class44.aClass44_155.method713(Class128.aClass667_3));
				return;
			}
			if (local120.aString171 != null) {
				local86 = Class471.method29622(local120.aString171, Class33.aClass53_11);
				if (local86 != null && local86.equals(local34)) {
					Class554.method31068(4, Class44.aClass44_134.method713(Class128.aClass667_3) + arg0 + Class44.aClass44_155.method713(Class128.aClass667_3));
					return;
				}
			}
		}
		if (Class471.method29622(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82, Class33.aClass53_11).equals(local34)) {
			Class554.method31068(4, Class44.aClass44_151.method713(Class128.aClass667_3));
			return;
		}
		@Pc(210) Class82 local210 = Class230.method25826();
		@Pc(216) Class77_Sub20 local216 = Class365.method28132(Class414.aClass414_20, local210.aClass16_1);
		local216.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0));
		local216.aClass77_Sub39_Sub1_2.method22440(arg0);
		local210.method2004(local216);
	}
}
