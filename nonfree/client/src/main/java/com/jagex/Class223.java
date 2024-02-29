package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
class Class223 implements Interface57 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!eg", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "(IIII)I", line = 37)
	public static int method25767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class239.method25926(arg2 - arg1 + 1);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!fw;)V", line = 114)
	Class223(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V", line = 116)
	@Override
	public void method26203(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(19) Class447 local19 = this.this$0.method26269();
		@Pc(23) Class447 local23 = Class447.method29160(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29170();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat277 > local6.aFloat277 - local45 / 2.0F && local19.aFloat277 < local6.aFloat277 + local45 / 2.0F && local19.aFloat278 > local6.aFloat278 - local51 / 2.0F && local19.aFloat278 < local6.aFloat278 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat277 - (local6.aFloat277 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat277 - (local6.aFloat277 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat278 - (local51 / 2.0F + local6.aFloat277));
				@Pc(135) float local135 = Math.abs(local19.aFloat278 - (local6.aFloat277 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = 1.0F / local139 * local143;
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat277 != 0.0F || local23.aFloat278 != 0.0F) {
				@Pc(227) int local227;
				if (Class11.anInt36 * -891094135 == 3) {
					local102 = Class597.aClass107_Sub1_2.method8899();
					if (local23.aFloat277 != 0.0F || local23.aFloat278 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat277, (double) local23.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local227 * local240 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class639.anInt5720 * -890112543) - (int) (Math.atan2((double) local23.aFloat277, (double) local23.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local227 * local295 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 116)
	@Override
	public void method26204(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(19) Class447 local19 = this.this$0.method26269();
		@Pc(23) Class447 local23 = Class447.method29160(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29170();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat277 > local6.aFloat277 - local45 / 2.0F && local19.aFloat277 < local6.aFloat277 + local45 / 2.0F && local19.aFloat278 > local6.aFloat278 - local51 / 2.0F && local19.aFloat278 < local6.aFloat278 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat277 - (local6.aFloat277 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat277 - (local6.aFloat277 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat278 - (local51 / 2.0F + local6.aFloat277));
				@Pc(135) float local135 = Math.abs(local19.aFloat278 - (local6.aFloat277 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = 1.0F / local139 * local143;
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat277 != 0.0F || local23.aFloat278 != 0.0F) {
				@Pc(227) int local227;
				if (Class11.anInt36 * -891094135 == 3) {
					local102 = Class597.aClass107_Sub1_2.method8899();
					if (local23.aFloat277 != 0.0F || local23.aFloat278 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat277, (double) local23.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local227 * local240 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class639.anInt5720 * -890112543) - (int) (Math.atan2((double) local23.aFloat277, (double) local23.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local227 * local295 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 116)
	@Override
	public void method26205(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(19) Class447 local19 = this.this$0.method26269();
		@Pc(23) Class447 local23 = Class447.method29160(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29170();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat277 > local6.aFloat277 - local45 / 2.0F && local19.aFloat277 < local6.aFloat277 + local45 / 2.0F && local19.aFloat278 > local6.aFloat278 - local51 / 2.0F && local19.aFloat278 < local6.aFloat278 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat277 - (local6.aFloat277 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat277 - (local6.aFloat277 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat278 - (local51 / 2.0F + local6.aFloat277));
				@Pc(135) float local135 = Math.abs(local19.aFloat278 - (local6.aFloat277 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = 1.0F / local139 * local143;
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat277 != 0.0F || local23.aFloat278 != 0.0F) {
				@Pc(227) int local227;
				if (Class11.anInt36 * -891094135 == 3) {
					local102 = Class597.aClass107_Sub1_2.method8899();
					if (local23.aFloat277 != 0.0F || local23.aFloat278 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat277, (double) local23.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local227 * local240 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class639.anInt5720 * -890112543) - (int) (Math.atan2((double) local23.aFloat277, (double) local23.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local227 * local295 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 173)
	public static void method25768() {
		if (!Class574.aBoolean807) {
			return;
		}
		@Pc(4) int local4 = Class529.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class529.aTwitchTV1 = null;
			Class574.aBoolean807 = false;
		}
	}

	@OriginalMember(owner = "client!eg", name = "co", descriptor = "(Lclient!yf;S)V", line = 4965)
	static final void method25769(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class628.method32576(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "fu", descriptor = "(Lclient!yf;I)V", line = 5483)
	static final void method25770(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class276.method26570(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "mi", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6803)
	static final void method25771(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray19 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!eg", name = "qi", descriptor = "(Lclient!yf;I)V", line = 7460)
	static final void method25772(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local11.aString178;
	}
}
