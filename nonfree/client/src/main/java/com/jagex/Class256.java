package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public class Class256 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fr", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
	final int anInt3807;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "(B)V", line = 13)
	static void method26212() {
	}

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "(Lclient!pw;ILclient!vf;ZLclient!er;I)Lclient!vg;", line = 41)
	public static Interface69 method26213(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class232 arg4) {
		if (Class637.aClass117_6 == null) {
			return null;
		} else {
			return (Interface69) (arg3 ? new Class598(arg0, arg1, Class637.aClass117_6, arg2) : new Class610(arg0, arg1, Class637.aClass117_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "(Ljava/lang/Iterable;Lclient!akv;B)V", line = 46)
	public static void method26214(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		@Pc(3) int local3 = Class338.method27695(arg0);
		arg1.method22471(local3);
		if (local3 == 0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local3; local12++) {
			arg1.aByteArray53[local12 + arg1.anInt3089 * 31645619] = 0;
		}
		@Pc(30) Iterator local30 = arg0.iterator();
		while (local30.hasNext()) {
			@Pc(37) Interface75 local37 = (Interface75) local30.next();
			@Pc(40) int local40 = local37.method36479();
			@Pc(44) int local44 = local40 / 8;
			arg1.aByteArray53[arg1.anInt3089 * 31645619 + local44] = (byte) (arg1.aByteArray53[arg1.anInt3089 * 31645619 + local44] | 0x1 << (local40 & 0x7));
		}
		arg1.anInt3089 += local3 * -1387468933;
	}

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "(I)Lclient!aqh;", line = 65)
	static Class77_Sub1_Sub6 method26215() {
		@Pc(4) Class77_Sub1_Sub6 local4 = (Class77_Sub1_Sub6) Class77_Sub1_Sub6.aClass691_9.method36335();
		if (local4 != null) {
			local4.method24063();
			local4.method24069();
			return local4;
		}
		do {
			local4 = (Class77_Sub1_Sub6) Class77_Sub1_Sub6.aClass691_10.method36335();
			if (local4 == null) {
				return null;
			}
			if (local4.method21553() > Class280.method26667()) {
				return null;
			}
			local4.method24063();
			local4.method24069();
		} while ((local4.aLong230 * -753566336061658369L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 218)
	Class256(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt3807 = arg1.method22483() * -155672519;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(Lclient!fd;)V", line = 223)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26082(this.anInt3807 * -1774629367);
		arg0.method26054(this.anInt3807 * -1774629367);
	}

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "(Lclient!fd;)V", line = 223)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26082(this.anInt3807 * -1774629367);
		arg0.method26054(this.anInt3807 * -1774629367);
	}

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "(Lclient!fd;I)V", line = 223)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26082(this.anInt3807 * -1774629367);
		arg0.method26054(this.anInt3807 * -1774629367);
	}

	@OriginalMember(owner = "client!fr", name = "ahu", descriptor = "(Lclient!yf;I)V", line = 10656)
	static final void method26216(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class96_Sub16.method7533();
	}

	@OriginalMember(owner = "client!fr", name = "alp", descriptor = "(Lclient!yf;Lclient!agh;B)V", line = 11538)
	static final void method26217(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class104_Sub1_Sub1_Sub1 arg1) {
		arg0.anInt5784 -= -2131970355;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(53) int local53 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		@Pc(68) boolean local68 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 5] == 1;
		@Pc(78) int local78 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 6];
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_4) {
			throw new RuntimeException();
		}
		@Pc(92) Class115_Sub1 local92 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
		@Pc(96) Class452 local96 = new Class452();
		@Pc(100) Class452 local100 = new Class452();
		local96.method29292(0.0F, 1.0F, 0.0F, (float) ((double) local53 * 3.141592653589793D * 2.0D / 16384.0D));
		@Pc(121) Class447 local121 = new Class447(1.0F, 0.0F, 0.0F);
		local121.method29198(local96);
		local121.method29144();
		local100.method29290(local121, (float) (2.0D * 3.141592653589793D * (double) local43 / 16384.0D));
		local96.method29330(local100);
		@Pc(145) Class595 local145 = client.aClass517_1.method30409();
		@Pc(152) int local152 = local145.anInt5504 * -424199969 << 9;
		@Pc(159) int local159 = local145.anInt5506 * -1166289421 << 9;
		if (arg1 != null) {
			local92.method9835(arg1, new Class447((float) local13, (float) local23, (float) local33), local96, local68, local78, client.aClass517_1.method30459().anIntArrayArrayArray14, client.aClass517_1.method30441(), local152, local159);
		}
		client.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!fr", name = "amc", descriptor = "(Lclient!yf;I)V", line = 11677)
	static final void method26218(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(41) Class447 local41 = Class447.method29120((float) local13, (float) local23, (float) local33);
		Class597.aClass107_Sub1_2.method8824(local41);
		local41.method29130();
	}

	@OriginalMember(owner = "client!fr", name = "ana", descriptor = "(Lclient!yf;I)V", line = 11956)
	static final void method26219(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5471 * -701003095;
	}

	@OriginalMember(owner = "client!fr", name = "att", descriptor = "(Lclient!yf;I)V", line = 12951)
	static final void method26220(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class302 local18 = (Class302) Class251.aClass35_Sub10_3.method18319(local12);
		if (local18.aString189 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local18.aString189;
		}
	}
}
