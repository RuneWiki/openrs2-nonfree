package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ey")
class Class238 implements Interface57 {

	@OriginalMember(owner = "client!ey", name = "r", descriptor = "I")
	static int anInt3781;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ey", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!ey", name = "<init>", descriptor = "(Lclient!fw;)V", line = 59)
	Class238(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ey", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V", line = 61)
	@Override
	public void method26203(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(21) Class447 local21 = Class447.method29160(local6, this.this$0.method26269());
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29170();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class11.anInt36 * -891094135 == 3) {
			@Pc(82) float local82 = Class597.aClass107_Sub1_2.method8899();
			if (local21.aFloat277 != 0.0F || local21.aFloat278 != 0.0F) {
				local115 = (int) ((double) (-1.0F * local82) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat277, (double) local21.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local115 > 8192) {
					local115 = 16384 - local115;
				}
				@Pc(128) int local128;
				if (local26 <= 0.0F) {
					local128 = 8192;
				} else if (local26 >= 4096.0F) {
					local128 = 16384;
				} else {
					local128 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local128 >> 1) + local128 * local115 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat277 != 0.0F || local21.aFloat278 != 0.0F) {
				@Pc(193) int local193 = -(Class639.anInt5720 * -890112543) - (int) (Math.atan2((double) local21.aFloat277, (double) local21.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local193 > 8192) {
					local193 = 16384 - local193;
				}
				if (local26 <= 0.0F) {
					local115 = 8192;
				} else if (local26 >= 4096.0F) {
					local115 = 16384;
				} else {
					local115 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = local193 * local115 / 8192 + (16384 - local115 >> 1);
			}
			local73 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local23 : (double) local23 * Math.sqrt((double) ((1.0F - local73) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local23 : (double) local23 * Math.sqrt((double) (local73 * 2.0F)));
	}

	@OriginalMember(owner = "client!ey", name = "c", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method26204(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(21) Class447 local21 = Class447.method29160(local6, this.this$0.method26269());
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29170();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class11.anInt36 * -891094135 == 3) {
			@Pc(82) float local82 = Class597.aClass107_Sub1_2.method8899();
			if (local21.aFloat277 != 0.0F || local21.aFloat278 != 0.0F) {
				local115 = (int) ((double) (-1.0F * local82) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat277, (double) local21.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local115 > 8192) {
					local115 = 16384 - local115;
				}
				@Pc(128) int local128;
				if (local26 <= 0.0F) {
					local128 = 8192;
				} else if (local26 >= 4096.0F) {
					local128 = 16384;
				} else {
					local128 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local128 >> 1) + local128 * local115 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat277 != 0.0F || local21.aFloat278 != 0.0F) {
				@Pc(193) int local193 = -(Class639.anInt5720 * -890112543) - (int) (Math.atan2((double) local21.aFloat277, (double) local21.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local193 > 8192) {
					local193 = 16384 - local193;
				}
				if (local26 <= 0.0F) {
					local115 = 8192;
				} else if (local26 >= 4096.0F) {
					local115 = 16384;
				} else {
					local115 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = local193 * local115 / 8192 + (16384 - local115 >> 1);
			}
			local73 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local23 : (double) local23 * Math.sqrt((double) ((1.0F - local73) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local23 : (double) local23 * Math.sqrt((double) (local73 * 2.0F)));
	}

	@OriginalMember(owner = "client!ey", name = "v", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method26205(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(21) Class447 local21 = Class447.method29160(local6, this.this$0.method26269());
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29170();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class11.anInt36 * -891094135 == 3) {
			@Pc(82) float local82 = Class597.aClass107_Sub1_2.method8899();
			if (local21.aFloat277 != 0.0F || local21.aFloat278 != 0.0F) {
				local115 = (int) ((double) (-1.0F * local82) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat277, (double) local21.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local115 > 8192) {
					local115 = 16384 - local115;
				}
				@Pc(128) int local128;
				if (local26 <= 0.0F) {
					local128 = 8192;
				} else if (local26 >= 4096.0F) {
					local128 = 16384;
				} else {
					local128 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local128 >> 1) + local128 * local115 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat277 != 0.0F || local21.aFloat278 != 0.0F) {
				@Pc(193) int local193 = -(Class639.anInt5720 * -890112543) - (int) (Math.atan2((double) local21.aFloat277, (double) local21.aFloat278) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local193 > 8192) {
					local193 = 16384 - local193;
				}
				if (local26 <= 0.0F) {
					local115 = 8192;
				} else if (local26 >= 4096.0F) {
					local115 = 16384;
				} else {
					local115 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = local193 * local115 / 8192 + (16384 - local115 >> 1);
			}
			local73 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local23 : (double) local23 * Math.sqrt((double) ((1.0F - local73) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local23 : (double) local23 * Math.sqrt((double) (local73 * 2.0F)));
	}

	@OriginalMember(owner = "client!ey", name = "au", descriptor = "(B)V", line = 469)
	public static void method25922() {
		Class574.aClass83_36 = null;
	}

	@OriginalMember(owner = "client!ey", name = "pm", descriptor = "(Lclient!yf;I)V", line = 7286)
	static final void method25923(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class475.method29692(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ey", name = "ln", descriptor = "(II)V", line = 11812)
	static final void method25924(@OriginalArg(0) int arg0) {
		if (Class211.method25607(arg0, null)) {
			Class111.method9219(Class35_Sub11.aClass273Array1[arg0].aClass277Array2, -1);
		}
	}

	@OriginalMember(owner = "client!ey", name = "auh", descriptor = "(Lclient!yf;B)V", line = 12995)
	static final void method25925(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class309.anInt4059 * -270195941;
	}
}
