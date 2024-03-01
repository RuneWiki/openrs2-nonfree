package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public class Class295 implements Interface25 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!go", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Lclient!ga;")
	final Class282 aClass282_1;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "(Ljava/lang/CharSequence;B)I", line = 140)
	public static int method26602(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class138_Sub3.method11406(arg0.charAt(local6));
		}
		return local4;
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 160)
	Class295(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.this$0 = arg0;
		@Pc(13) boolean local13 = arg1.method22413() != 255;
		if (local13) {
			arg1.anInt3070 -= -1445626955;
		}
		this.aClass282_1 = new Class282(arg1, local13, true);
	}

	@OriginalMember(owner = "client!go", name = "m", descriptor = "(Lclient!gq;)V", line = 167)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26681(this.aClass282_1);
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(Lclient!gq;B)V", line = 167)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0) {
		arg0.method26681(this.aClass282_1);
	}

	@OriginalMember(owner = "client!go", name = "n", descriptor = "(Lclient!gq;)V", line = 167)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26681(this.aClass282_1);
	}

	@OriginalMember(owner = "client!go", name = "ano", descriptor = "(Lclient!yf;Lclient!ahm;I)V", line = 12372)
	static final void method26601(@OriginalArg(0) Class681 arg0, @OriginalArg(1) Class132_Sub1_Sub1_Sub1 arg1) {
		arg0.anInt5891 -= -262021061;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4];
		@Pc(68) boolean local68 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 5] == 1;
		@Pc(78) int local78 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 6];
		if (Class65.aClass123_Sub1_2.method9023() != Class342.aClass342_3) {
			throw new RuntimeException();
		}
		@Pc(92) Class124_Sub1 local92 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
		@Pc(96) Class471 local96 = new Class471();
		@Pc(100) Class471 local100 = new Class471();
		local96.method29466(0.0F, 1.0F, 0.0F, (float) ((double) local53 * 2.0D * 3.141592653589793D / 16384.0D));
		@Pc(121) Class472 local121 = new Class472(1.0F, 0.0F, 0.0F);
		local121.method29572(local96);
		local121.method29540();
		local100.method29465(local121, (float) ((double) local43 * 3.141592653589793D * 2.0D / 16384.0D));
		local96.method29476(local100);
		@Pc(145) Class611 local145 = client.aClass532_1.method30443();
		@Pc(152) int local152 = local145.anInt5623 * 270611681 << 9;
		@Pc(159) int local159 = local145.anInt5624 * -1994307635 << 9;
		if (arg1 != null) {
			local92.method9158(arg1, new Class472((float) local13, (float) local23, (float) local33), local96, local68, local78, client.aClass532_1.method30460().anIntArrayArrayArray14, client.aClass532_1.method30509(), local152, local159);
		}
		client.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!go", name = "atw", descriptor = "(Lclient!yf;I)V", line = 13257)
	static final void method26603(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
	}
}
