package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
class Class264 implements Interface58 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fi", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!yf;I)V", line = 110)
	static void method26207(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1])).method27585(Class624.aClass120_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!fb;)V", line = 204)
	Class264(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 206)
	@Override
	public void method26352(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30806();
		@Pc(10) float local10 = local2.method30847();
		@Pc(14) float local14 = local2.method30808();
		@Pc(19) Class472 local19 = this.this$0.method26030();
		@Pc(23) Class472 local23 = Class472.method29574(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29565();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat317 > local6.aFloat317 - local41 / 2.0F && local19.aFloat317 < local41 / 2.0F + local6.aFloat317 && local19.aFloat319 > local6.aFloat319 - local47 / 2.0F && local19.aFloat319 < local6.aFloat319 + local47 / 2.0F) {
				@Pc(98) float local98 = Math.abs(local19.aFloat317 - (local41 / 2.0F + local6.aFloat317));
				@Pc(109) float local109 = Math.abs(local19.aFloat317 - (local6.aFloat317 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat319 - (local6.aFloat317 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat319 - (local6.aFloat317 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = 1.0F / local135 * local139;
				@Pc(155) float local155 = local143 * (1.0F / local135);
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 206)
	@Override
	public void method26351(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30806();
		@Pc(10) float local10 = local2.method30847();
		@Pc(14) float local14 = local2.method30808();
		@Pc(19) Class472 local19 = this.this$0.method26030();
		@Pc(23) Class472 local23 = Class472.method29574(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29565();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat317 > local6.aFloat317 - local41 / 2.0F && local19.aFloat317 < local41 / 2.0F + local6.aFloat317 && local19.aFloat319 > local6.aFloat319 - local47 / 2.0F && local19.aFloat319 < local6.aFloat319 + local47 / 2.0F) {
				@Pc(98) float local98 = Math.abs(local19.aFloat317 - (local41 / 2.0F + local6.aFloat317));
				@Pc(109) float local109 = Math.abs(local19.aFloat317 - (local6.aFloat317 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat319 - (local6.aFloat317 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat319 - (local6.aFloat317 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = 1.0F / local135 * local139;
				@Pc(155) float local155 = local143 * (1.0F / local135);
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V", line = 206)
	@Override
	public void method26350(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30806();
		@Pc(10) float local10 = local2.method30847();
		@Pc(14) float local14 = local2.method30808();
		@Pc(19) Class472 local19 = this.this$0.method26030();
		@Pc(23) Class472 local23 = Class472.method29574(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29565();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat317 > local6.aFloat317 - local41 / 2.0F && local19.aFloat317 < local41 / 2.0F + local6.aFloat317 && local19.aFloat319 > local6.aFloat319 - local47 / 2.0F && local19.aFloat319 < local6.aFloat319 + local47 / 2.0F) {
				@Pc(98) float local98 = Math.abs(local19.aFloat317 - (local41 / 2.0F + local6.aFloat317));
				@Pc(109) float local109 = Math.abs(local19.aFloat317 - (local6.aFloat317 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat319 - (local6.aFloat317 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat319 - (local6.aFloat317 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = 1.0F / local135 * local139;
				@Pc(155) float local155 = local143 * (1.0F / local135);
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!fi", name = "at", descriptor = "(III)V", line = 227)
	static void method26211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(5, (long) arg0);
		local4.method21801();
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "(S)Ljava/io/File;", line = 349)
	public static File method26206() {
		return Class564.aFile4;
	}

	@OriginalMember(owner = "client!fi", name = "ag", descriptor = "(B)V", line = 889)
	static void method26212() {
		for (@Pc(4) Class93_Sub1_Sub8 local4 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(); local4 != null; local4 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253()) {
			if (local4.anInt3013 * -2109043087 > 1) {
				local4.anInt3013 = 0;
				Class454.aClass240_85.method25830(local4, ((Class93_Sub1_Sub7) local4.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).aLong155 * 7070093341456026777L);
				local4.aClass18_10.method245();
			}
		}
		Class454.anInt5039 = 0;
		Class454.anInt5042 = 0;
		Class454.aClass22_55.method406();
		Class454.aClass16_34.method219();
		Class454.aClass18_16.method245();
		Class246.method25906(Class701.aClass93_Sub1_Sub7_7);
	}

	@OriginalMember(owner = "client!fi", name = "aiw", descriptor = "(Lclient!yf;I)V", line = 11288)
	static final void method26210(@OriginalArg(0) Class681 arg0) {
		arg0.aClass434_1 = new Class434();
		arg0.aClass434_1.anInt4807 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] * -1924523377;
		arg0.aClass434_1.aClass93_Sub1_Sub18_1 = Class372.aClass58_2.method1097(arg0.aClass434_1.anInt4807 * 526894191);
		arg0.aClass434_1.anIntArray445 = new int[arg0.aClass434_1.aClass93_Sub1_Sub18_1.method22917()];
	}

	@OriginalMember(owner = "client!fi", name = "ams", descriptor = "(Lclient!yf;I)V", line = 11992)
	static final void method26208(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1391521308;
		Class436.method28811();
		Class531.method30435();
		Class650.anInt5796 = arg0.anIntArray519[arg0.anInt5891 * -1497248091] * 1197987391;
		Class520.anInt5220 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] * 1858890871;
		Class148.anInt1395 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2] * 1411931009;
		Class166_Sub34.anInt2296 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] * -1635903829;
		Class93_Sub1_Sub15.anInt3091 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4] * 533077433;
		Class165.anInt2067 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 5] * -1557403439;
		Class93_Sub37.anInt1960 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 6] * 339966705;
		Class239.anInt3825 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 7] * -235123319;
		Class267.anInt3882 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 8] * 223761961;
		Class219.anInt3627 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 9] * 539159983;
		Class364.anInt4575 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 10] * 1605455003;
		Class13.anInt47 = arg0.anIntArray519[-1497248091 * arg0.anInt5891 + 11] * -941975031;
		Class110_Sub7.aClass497_22.method30054(Class93_Sub1_Sub15.anInt3091 * -2011768695);
		Class110_Sub7.aClass497_22.method30054(Class165.anInt2067 * 36532273);
		Class110_Sub7.aClass497_22.method30054(Class93_Sub37.anInt1960 * -923388399);
		Class110_Sub7.aClass497_22.method30054(Class239.anInt3825 * 176568505);
		Class110_Sub7.aClass497_22.method30054(Class267.anInt3882 * -377772519);
		Class110_Sub7.aClass497_22.method30054(Class13.anInt47 * -122481607);
		Class633.aClass497_137.method30054(Class13.anInt47 * -122481607);
		Class211.aClass100_41 = null;
		Class166_Sub34.aClass100_23 = null;
		Class53_Sub1.aClass100_19 = null;
		Class441.aClass100_44 = null;
		Class25.aClass100_39 = null;
		Class92.aClass100_2 = null;
		Class454.aClass100_45 = null;
		Class124_Sub3.aClass100_36 = null;
		Class454.aBoolean774 = true;
	}

	@OriginalMember(owner = "client!fi", name = "axr", descriptor = "(Lclient!yf;B)V", line = 13935)
	static final void method26213(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class322 local18 = (Class322) Class542.aClass32_Sub2_3.method18261(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt4126 * -498063801;
	}

	@OriginalMember(owner = "client!fi", name = "bdx", descriptor = "(Lclient!yf;I)V", line = 14742)
	static final void method26209(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
