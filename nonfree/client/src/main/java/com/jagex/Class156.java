package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
class Class156 implements Interface41 {

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "Z")
	public static boolean aBoolean622;

	// $FF: synthetic field
	@OriginalMember(owner = "client!eq", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "(Lclient!agq;B)Lclient!agq;", line = 27)
	public static Class3_Sub32 method23183(@OriginalArg(0) Class3_Sub32 arg0) {
		@Pc(2) Class3_Sub32[] local2 = Class3_Sub32.aClass3_Sub32Array1;
		synchronized (Class3_Sub32.aClass3_Sub32Array1) {
			if (Class3_Sub32.anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0);
			} else {
				Class3_Sub32.aClass3_Sub32Array1[(Class3_Sub32.anInt1341 -= -676345611) * 2037424989].method11705(arg0);
				return Class3_Sub32.aClass3_Sub32Array1[Class3_Sub32.anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(J)I", line = 84)
	public static int method23185(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "(I)Ljava/lang/String;", line = 146)
	public static String method23184() {
		return Class603.aString246;
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!ft;)V", line = 204)
	Class156(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 206)
	@Override
	public void method23176(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method25861();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat259 > local6.aFloat259 - local41 / 2.0F && local19.aFloat259 < local6.aFloat259 + local41 / 2.0F && local19.aFloat261 > local6.aFloat261 - local47 / 2.0F && local19.aFloat261 < local6.aFloat261 + local47 / 2.0F) {
				@Pc(98) float local98 = Math.abs(local19.aFloat259 - (local41 / 2.0F + local6.aFloat259));
				@Pc(109) float local109 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local47 / 2.0F));
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

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V", line = 206)
	@Override
	public void method23178(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method25861();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat259 > local6.aFloat259 - local41 / 2.0F && local19.aFloat259 < local6.aFloat259 + local41 / 2.0F && local19.aFloat261 > local6.aFloat261 - local47 / 2.0F && local19.aFloat261 < local6.aFloat261 + local47 / 2.0F) {
				@Pc(98) float local98 = Math.abs(local19.aFloat259 - (local41 / 2.0F + local6.aFloat259));
				@Pc(109) float local109 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local47 / 2.0F));
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

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 206)
	@Override
	public void method23175(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method25861();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat259 > local6.aFloat259 - local41 / 2.0F && local19.aFloat259 < local6.aFloat259 + local41 / 2.0F && local19.aFloat261 > local6.aFloat261 - local47 / 2.0F && local19.aFloat261 < local6.aFloat261 + local47 / 2.0F) {
				@Pc(98) float local98 = Math.abs(local19.aFloat259 - (local41 / 2.0F + local6.aFloat259));
				@Pc(109) float local109 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local47 / 2.0F));
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

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 206)
	@Override
	public void method23177(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(19) Class320 local19 = this.this$0.method23567();
		@Pc(23) Class320 local23 = Class320.method25928(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method25861();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat259 > local6.aFloat259 - local41 / 2.0F && local19.aFloat259 < local6.aFloat259 + local41 / 2.0F && local19.aFloat261 > local6.aFloat261 - local47 / 2.0F && local19.aFloat261 < local6.aFloat261 + local47 / 2.0F) {
				@Pc(98) float local98 = Math.abs(local19.aFloat259 - (local41 / 2.0F + local6.aFloat259));
				@Pc(109) float local109 = Math.abs(local19.aFloat259 - (local6.aFloat259 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat261 - (local6.aFloat259 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat261 - (local6.aFloat259 - local47 / 2.0F));
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

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)V", line = 227)
	static void method23182() {
		Class3_Sub8.aClass161_3.method23224();
	}

	@OriginalMember(owner = "client!eq", name = "ar", descriptor = "(Lclient!aml;I)[I", line = 1162)
	static int[] method23180(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		@Pc(1) int[] local1 = null;
		if (Class623.method33771(arg0.anInt2664 * 296027207)) {
			local1 = Class44_Sub3.aClass596_1.method33435((int) (arg0.aLong154 * -8018265419264301651L)).anIntArray514;
		} else if (arg0.anInt2665 * -771870111 != -1) {
			local1 = Class44_Sub3.aClass596_1.method33435(arg0.anInt2665 * -771870111).anIntArray514;
		} else if (Class314.method25830(arg0.anInt2664 * 296027207)) {
			@Pc(52) Class3_Sub29 local52 = (Class3_Sub29) client.aClass581_21.method33217((long) (arg0.aLong154 * -8018265419264301651L));
			if (local52 != null) {
				@Pc(58) Class26_Sub1_Sub1_Sub1_Sub1 local58 = (Class26_Sub1_Sub1_Sub1_Sub1) local52.anObject2;
				@Pc(61) Class571 local61 = local58.aClass571_1;
				if (local61.anIntArray508 != null) {
					local61 = local61.method33044(Class424.aClass165_1, Class424.aClass165_1);
				}
				if (local61 != null) {
					local1 = local61.anIntArray505;
				}
			}
		} else if (Class70_Sub1_Sub2.method14741(arg0.anInt2664 * 296027207)) {
			@Pc(99) Class467 local99 = client.aClass370_1.method26954().method28510((int) (arg0.aLong154 * -8018265419264301651L >>> 32 & 0x7FFFFFFFL));
			if (local99.anIntArray464 != null) {
				local99 = local99.method28716(Class424.aClass165_1, Class424.aClass165_1);
			}
			if (local99 != null) {
				local1 = local99.anIntArray467;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eq", name = "lv", descriptor = "([Lclient!fo;IB)V", line = 11182)
	static final void method23181(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class178 local9 = arg0[local1];
			if (local9 != null && local9.anInt3500 * 610124465 == arg1 && !client.method22374(local9)) {
				if (local9.anInt3492 * -107621169 == 0) {
					method23181(arg0, local9.anInt3570 * 954808515);
					if (local9.aClass178Array6 != null) {
						method23181(local9.aClass178Array6, local9.anInt3570 * 954808515);
					}
					@Pc(57) Class3_Sub42 local57 = (Class3_Sub42) client.aClass581_22.method33217((long) (local9.anInt3570 * 954808515));
					if (local57 != null) {
						Class469.method28757(local57.anInt2796 * 1705574607);
					}
				}
				if (local9.anInt3492 * -107621169 == 6 && local9.anInt3572 * 381674943 != -1) {
					if (local9.aClass71_6 == null) {
						local9.aClass71_6 = new Class71_Sub2();
						local9.aClass71_6.method20038(local9.anInt3572 * 381674943);
					}
					if (local9.aClass71_6.method20042(client.anInt3124 * -1814914105) && local9.aClass71_6.method20039()) {
						local9.aClass71_6.method20041();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "aue", descriptor = "(Lclient!vs;I)V", line = 12639)
	static final void method23179(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = ((Class26_Sub1) arg0.anInterface43_1).method21479();
	}
}
