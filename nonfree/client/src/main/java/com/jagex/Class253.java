package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public class Class253 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fn", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)Z", line = 20)
	public static boolean method26188() {
		@Pc(4) Class77_Sub29 local4 = (Class77_Sub29) Class64.aClass695_1.method36395();
		return local4 != null;
	}

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "(B)I", line = 94)
	public static int method26189() {
		if (Class574.anInt5393 * -504964405 == 3) {
			return -1;
		} else if (Class574.anInt5393 * -504964405 == 0) {
			if (Class574.aStringArray32 == null) {
				if (Class508.aString221.startsWith("mac ")) {
					if (Class508.aString222.startsWith("ppc")) {
						Class574.anInt5393 = 214610089;
						return -1;
					}
					Class574.aStringArray32 = new String[3];
					Class574.aStringArray32[0] = "sdk-mac-dynamic";
					Class574.aStringArray32[1] = "twitchsdk";
					Class574.aStringArray32[2] = "twitchtv";
					Class574.aBooleanArray31 = new boolean[3];
					Class574.aBooleanArray31[0] = false;
					Class574.aBooleanArray31[1] = false;
					Class574.aBooleanArray31[2] = true;
				} else if (Class508.aString221.startsWith("win")) {
					Class574.aStringArray32 = new String[6];
					Class574.aStringArray32[0] = "avutil-ttv-51";
					Class574.aStringArray32[1] = "libmp3lame-ttv";
					Class574.aStringArray32[2] = "swresample-ttv-0";
					Class574.aStringArray32[5] = "twitchtv";
					if (Class508.aString222.startsWith("amd64") || Class508.aString222.startsWith("x86_64")) {
						Class574.aStringArray32[3] = "libmfxsw64";
						Class574.aStringArray32[4] = "twitchsdk_64_release";
					} else if (Class508.aString222.startsWith("i386") || Class508.aString222.startsWith("i486") || Class508.aString222.startsWith("i586") || Class508.aString222.startsWith("x86")) {
						Class574.aStringArray32[3] = "libmfxsw32";
						Class574.aStringArray32[4] = "twitchsdk_32_release";
					} else {
						Class574.anInt5393 = 214610089;
						return -1;
					}
					Class574.aBooleanArray31 = new boolean[6];
					Class574.aBooleanArray31[0] = true;
					Class574.aBooleanArray31[1] = true;
					Class574.aBooleanArray31[2] = true;
					Class574.aBooleanArray31[3] = false;
					Class574.aBooleanArray31[4] = true;
					Class574.aBooleanArray31[5] = true;
				} else {
					Class574.anInt5393 = 214610089;
					return -1;
				}
			}
			Class574.anInt5393 = -1360119069;
			return 0;
		} else {
			return Class574.anInt5399 * 1879685621;
		}
	}

	@OriginalMember(owner = "client!fn", name = "aj", descriptor = "(Lclient!yf;I)V", line = 205)
	static void method26190(@OriginalArg(0) Class665 arg0) {
		Class73.method1039();
		Class489.method30015(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!fc;)V", line = 267)
	Class253(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "(Lclient!fd;I)V", line = 270)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26091();
	}

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "(Lclient!fd;)V", line = 270)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26091();
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(Lclient!fd;)V", line = 270)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26091();
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)I", line = 1586)
	static final int method26191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(35) int local35 = Class428.method28804(arg0 + 45365, arg1 + 91923, 4) - 128 + (Class428.method28804(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Class428.method28804(arg0, arg1, 1) - 128 >> 2);
		local35 = (int) ((double) local35 * 0.3D) + 35;
		if (local35 < 10) {
			local35 = 10;
		} else if (local35 > 60) {
			local35 = 60;
		}
		return local35;
	}

	@OriginalMember(owner = "client!fn", name = "aay", descriptor = "(Lclient!yf;B)V", line = 9295)
	static final void method26192(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.anInt4553 * 104457713;
	}

	@OriginalMember(owner = "client!fn", name = "amq", descriptor = "(Lclient!yf;I)V", line = 11741)
	static final void method26193(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_4 || Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_4) {
			throw new RuntimeException();
		}
		@Pc(20) Class447 local20 = ((Class115_Sub1) Class597.aClass107_Sub1_2.method8871()).method9855();
		@Pc(27) Class447 local27 = ((Class149_Sub4) Class597.aClass107_Sub1_2.method8873()).method16846();
		@Pc(30) Class447 local30 = Class447.method29124(local20);
		local30.method29156(local27);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) local30.method29170();
	}

	@OriginalMember(owner = "client!fn", name = "asy", descriptor = "(Lclient!yf;I)V", line = 12756)
	static final void method26194(@OriginalArg(0) Class665 arg0) {
		Class345.method27829();
	}
}
