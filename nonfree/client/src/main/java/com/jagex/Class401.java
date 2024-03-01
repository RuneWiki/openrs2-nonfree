package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!py")
public class Class401 implements Interface6 {

	@OriginalMember(owner = "client!py", name = "p", descriptor = "Lclient!act;")
	Class26_Sub1_Sub1_Sub1 aClass26_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!py", name = "p", descriptor = "(II)Z", line = 58)
	public static boolean method27609(@OriginalArg(0) int arg0) {
		if (arg0 != Class131.anInt3330 * -2090483569 || Class2.aClass145_1 == null) {
			Class123.method22843();
			Class2.aClass145_1 = Class145.aClass145_4;
			Class131.anInt3330 = arg0 * 1334009455;
		}
		@Pc(39) int local39;
		if (Class145.aClass145_4 == Class2.aClass145_1) {
			@Pc(23) byte[] local23 = Class329.aClass359_60.method26705(arg0);
			if (local23 == null) {
				return false;
			}
			@Pc(32) Class3_Sub41 local32 = new Class3_Sub41(local23);
			Class189.method23982(local32);
			local39 = local32.method20269();
			@Pc(41) int local41;
			for (local41 = 0; local41 < local39; local41++) {
				Class131.aClass553_48.method32702(new Class3_Sub6(local32));
			}
			local41 = local32.method20334();
			Class131.aClass162Array1 = new Class162[local41];
			@Pc(62) int local62;
			for (local62 = 0; local62 < local41; local62++) {
				Class131.aClass162Array1[local62] = new Class162(local32);
			}
			local62 = local32.method20334();
			Class131.aClass163Array1 = new Class163[local62];
			@Pc(83) int local83;
			for (local83 = 0; local83 < local62; local83++) {
				Class131.aClass163Array1[local83] = new Class163(local32, local83);
			}
			local83 = local32.method20334();
			Class131.aClass142Array1 = new Class142[local83];
			@Pc(105) int local105;
			for (local105 = 0; local105 < local83; local105++) {
				Class131.aClass142Array1[local105] = new Class142(local32);
			}
			local105 = local32.method20334();
			Class131.aClass150Array1 = new Class150[local105];
			@Pc(126) int local126;
			for (local126 = 0; local126 < local105; local126++) {
				Class131.aClass150Array1[local126] = new Class150(local32);
			}
			local126 = local32.method20334();
			Class496.aClass13Array1 = new Class13[local126];
			for (@Pc(147) int local147 = 0; local147 < local126; local147++) {
				Class496.aClass13Array1[local147] = Class595.method33433(local32);
			}
			Class2.aClass145_1 = Class145.aClass145_3;
		}
		if (Class145.aClass145_3 == Class2.aClass145_1) {
			@Pc(165) boolean local165 = true;
			@Pc(167) Class163[] local167 = Class131.aClass163Array1;
			for (local39 = 0; local39 < local167.length; local39++) {
				@Pc(177) Class163 local177 = local167[local39];
				if (!local177.method23285()) {
					local165 = false;
				}
			}
			@Pc(187) Class13[] local187 = Class496.aClass13Array1;
			for (local39 = 0; local39 < local187.length; local39++) {
				@Pc(197) Class13 local197 = local187[local39];
				if (!local197.method16890()) {
					local165 = false;
				}
			}
			@Pc(207) Class142[] local207 = Class131.aClass142Array1;
			for (local39 = 0; local39 < local207.length; local39++) {
				@Pc(217) Class142 local217 = local207[local39];
				if (!local217.method23038()) {
					local165 = false;
				}
			}
			if (!local165) {
				return false;
			}
			Class2.aClass145_1 = Class145.aClass145_2;
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "u", descriptor = "(II)V", line = 103)
	public static void method27610(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(4, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!py", name = "<init>", descriptor = "(Lclient!act;)V", line = 739)
	Class401(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0) {
		this.aClass26_Sub1_Sub1_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!py", name = "u", descriptor = "(Lclient!cy;B)I", line = 744)
	@Override
	public int method32385(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "i", descriptor = "(Lclient!cy;)I", line = 744)
	@Override
	public int method32387(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "o", descriptor = "(Lclient!cy;)I", line = 744)
	@Override
	public int method32386(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "w", descriptor = "(Lclient!cy;)I", line = 744)
	@Override
	public int method32388(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "b", descriptor = "(Lclient!cy;)J", line = 748)
	@Override
	public long method32396(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33307(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "a", descriptor = "(Lclient!cy;I)J", line = 748)
	@Override
	public long method32393(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33307(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "m", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 752)
	@Override
	public Object method32405(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "n", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 752)
	@Override
	public Object method32400(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "e", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 752)
	@Override
	public Object method32406(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "r", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 752)
	@Override
	public Object method32402(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "d", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 752)
	@Override
	public Object method32403(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "q", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 752)
	@Override
	public Object method32404(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "l", descriptor = "(Lclient!cy;I)Ljava/lang/Object;", line = 752)
	@Override
	public Object method32408(@OriginalArg(0) Class11 arg0) {
		return this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!py", name = "f", descriptor = "(Lclient!ky;)I", line = 756)
	@Override
	public int method32383(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.method32385(arg0.aClass11_1));
	}

	@OriginalMember(owner = "client!py", name = "y", descriptor = "(Lclient!ky;I)I", line = 756)
	@Override
	public int method32384(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.method32385(arg0.aClass11_1));
	}

	@OriginalMember(owner = "client!py", name = "p", descriptor = "(Lclient!cy;II)V", line = 760)
	@Override
	public void method32389(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33305(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "s", descriptor = "(Lclient!cy;I)V", line = 760)
	@Override
	public void method32395(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33305(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "z", descriptor = "(Lclient!cy;J)V", line = 764)
	@Override
	public void method32398(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "g", descriptor = "(Lclient!cy;J)V", line = 764)
	@Override
	public void method32401(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "j", descriptor = "(Lclient!cy;J)V", line = 764)
	@Override
	public void method32399(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "c", descriptor = "(Lclient!cy;J)V", line = 764)
	@Override
	public void method32397(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "h", descriptor = "(Lclient!cy;Ljava/lang/Object;I)V", line = 768)
	@Override
	public void method32391(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "at", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 768)
	@Override
	public void method32409(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "af", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 768)
	@Override
	public void method32410(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "ak", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 768)
	@Override
	public void method32390(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.aClass26_Sub1_Sub1_Sub1_3.anInterface58_5.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!py", name = "x", descriptor = "(Lclient!ky;II)V", line = 772)
	@Override
	public void method32411(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!py", name = "v", descriptor = "(Lclient!ky;I)V", line = 772)
	@Override
	public void method32394(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!py", name = "t", descriptor = "(Lclient!ky;I)V", line = 772)
	@Override
	public void method32407(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!py", name = "k", descriptor = "(Lclient!ky;I)V", line = 772)
	@Override
	public void method32392(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!py", name = "uk", descriptor = "(Lclient!vs;B)V", line = 7827)
	static final void method27606(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16664();
	}

	@OriginalMember(owner = "client!py", name = "kl", descriptor = "(Lclient!agh;IIIB)V", line = 9688)
	static void method27607(@OriginalArg(0) Class3_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg0.aClass3_Sub41_Sub1_1.method20254(arg1);
		arg0.aClass3_Sub41_Sub1_1.method20287(arg2);
		arg0.aClass3_Sub41_Sub1_1.method20287(arg3);
	}

	@OriginalMember(owner = "client!py", name = "lx", descriptor = "(B)V", line = 11141)
	public static void method27608() {
		for (@Pc(1) int local1 = 0; local1 < 112; local1++) {
			client.aBooleanArray19[local1] = true;
		}
	}
}
