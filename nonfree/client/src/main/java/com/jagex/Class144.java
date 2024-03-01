package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
class Class144 implements Interface41 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ed", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ft;)V", line = 59)
	Class144(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method23176(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(162) float local162;
		@Pc(115) int local115;
		if (Class72.anInt2086 * 81180077 == 3) {
			@Pc(82) float local82 = Class80.aClass23_Sub1_1.method5836();
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				@Pc(193) int local193 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local38 : (double) local38 * Math.sqrt((double) ((1.0F - local162) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local38 : (double) local38 * Math.sqrt((double) (local162 * 2.0F)));
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method23175(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(162) float local162;
		@Pc(115) int local115;
		if (Class72.anInt2086 * 81180077 == 3) {
			@Pc(82) float local82 = Class80.aClass23_Sub1_1.method5836();
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				@Pc(193) int local193 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local38 : (double) local38 * Math.sqrt((double) ((1.0F - local162) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local38 : (double) local38 * Math.sqrt((double) (local162 * 2.0F)));
	}

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V", line = 61)
	@Override
	public void method23178(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(162) float local162;
		@Pc(115) int local115;
		if (Class72.anInt2086 * 81180077 == 3) {
			@Pc(82) float local82 = Class80.aClass23_Sub1_1.method5836();
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				@Pc(193) int local193 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local38 : (double) local38 * Math.sqrt((double) ((1.0F - local162) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local38 : (double) local38 * Math.sqrt((double) (local162 * 2.0F)));
	}

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method23177(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(162) float local162;
		@Pc(115) int local115;
		if (Class72.anInt2086 * 81180077 == 3) {
			@Pc(82) float local82 = Class80.aClass23_Sub1_1.method5836();
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat259 != 0.0F || local21.aFloat261 != 0.0F) {
				@Pc(193) int local193 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - (int) (Math.atan2((double) local21.aFloat259, (double) local21.aFloat261) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
			local162 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local38 : (double) local38 * Math.sqrt((double) ((1.0F - local162) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local38 : (double) local38 * Math.sqrt((double) (local162 * 2.0F)));
	}

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "(CI)Z", line = 182)
	public static boolean method23067(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ed", name = "di", descriptor = "(II)V", line = 798)
	public static void method23068(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			Class58_Sub1.anInt1439 = Class58_Sub1.anInt1433 * 956783367;
		} else {
			Class58_Sub1.anInt1439 = arg0 * 883464619;
		}
	}

	@OriginalMember(owner = "client!ed", name = "ee", descriptor = "(Lclient!vs;I)V", line = 4777)
	static final void method23065(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class494.method29315(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ed", name = "uo", descriptor = "(Lclient!vs;B)V", line = 7846)
	static final void method23066(@OriginalArg(0) Class536 arg0) {
		@Pc(13) Class3_Sub32 local13 = (Class3_Sub32) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13.anInt1342 * 452765999;
	}

	@OriginalMember(owner = "client!ed", name = "alx", descriptor = "(Lclient!vs;I)V", line = 11113)
	static final void method23069(@OriginalArg(0) Class536 arg0) {
		Class60.method14616();
	}

	@OriginalMember(owner = "client!ed", name = "apb", descriptor = "(Lclient!vs;I)V", line = 11703)
	static final void method23070(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		client.aShort152 = (short) arg0.anIntArray496[arg0.anInt5319 * 960738381];
		if (client.aShort152 <= 0) {
			client.aShort152 = 1;
		}
		client.aShort153 = (short) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (client.aShort153 <= 0) {
			client.aShort153 = 32767;
		} else if (client.aShort153 < client.aShort152) {
			client.aShort153 = client.aShort152;
		}
		client.aShort154 = (short) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		if (client.aShort154 <= 0) {
			client.aShort154 = 1;
		}
		client.aShort148 = (short) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		if (client.aShort148 <= 0) {
			client.aShort148 = 32767;
		} else if (client.aShort148 < client.aShort154) {
			client.aShort148 = client.aShort154;
		}
	}
}
