package com.jagex;

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
class Class269 implements Interface58 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fn", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!fb;)V", line = 59)
	Class269(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V", line = 61)
	@Override
	public void method26350(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30806();
		@Pc(10) float local10 = local2.method30847();
		@Pc(14) float local14 = local2.method30808();
		@Pc(21) Class472 local21 = Class472.method29574(local6, this.this$0.method26030());
		@Pc(26) float local26 = local21.method29565();
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
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(82) float local82 = Class65.aClass123_Sub1_2.method8962();
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = local115 * local128 / 8192 + (16384 - local128 >> 1);
			}
			local162 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				@Pc(193) int local193 = -(Class24.anInt82 * -20667523) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = (16384 - local115 >> 1) + local115 * local193 / 8192;
			}
			local162 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local38 : (double) local38 * Math.sqrt((double) ((1.0F - local162) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local38 : (double) local38 * Math.sqrt((double) (local162 * 2.0F)));
	}

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method26351(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30806();
		@Pc(10) float local10 = local2.method30847();
		@Pc(14) float local14 = local2.method30808();
		@Pc(21) Class472 local21 = Class472.method29574(local6, this.this$0.method26030());
		@Pc(26) float local26 = local21.method29565();
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
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(82) float local82 = Class65.aClass123_Sub1_2.method8962();
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = local115 * local128 / 8192 + (16384 - local128 >> 1);
			}
			local162 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				@Pc(193) int local193 = -(Class24.anInt82 * -20667523) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = (16384 - local115 >> 1) + local115 * local193 / 8192;
			}
			local162 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local38 : (double) local38 * Math.sqrt((double) ((1.0F - local162) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local38 : (double) local38 * Math.sqrt((double) (local162 * 2.0F)));
	}

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method26352(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30806();
		@Pc(10) float local10 = local2.method30847();
		@Pc(14) float local14 = local2.method30808();
		@Pc(21) Class472 local21 = Class472.method29574(local6, this.this$0.method26030());
		@Pc(26) float local26 = local21.method29565();
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
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(82) float local82 = Class65.aClass123_Sub1_2.method8962();
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = local115 * local128 / 8192 + (16384 - local128 >> 1);
			}
			local162 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				@Pc(193) int local193 = -(Class24.anInt82 * -20667523) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = (16384 - local115 >> 1) + local115 * local193 / 8192;
			}
			local162 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local38 : (double) local38 * Math.sqrt((double) ((1.0F - local162) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local38 : (double) local38 * Math.sqrt((double) (local162 * 2.0F)));
	}

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "(Ljava/lang/CharSequence;B)[B", line = 90)
	public static byte[] method26271(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				local5[local7] = (byte) local14;
			} else if (local14 == 8364) {
				local5[local7] = -128;
			} else if (local14 == 8218) {
				local5[local7] = -126;
			} else if (local14 == 402) {
				local5[local7] = -125;
			} else if (local14 == 8222) {
				local5[local7] = -124;
			} else if (local14 == 8230) {
				local5[local7] = -123;
			} else if (local14 == 8224) {
				local5[local7] = -122;
			} else if (local14 == 8225) {
				local5[local7] = -121;
			} else if (local14 == 710) {
				local5[local7] = -120;
			} else if (local14 == 8240) {
				local5[local7] = -119;
			} else if (local14 == 352) {
				local5[local7] = -118;
			} else if (local14 == 8249) {
				local5[local7] = -117;
			} else if (local14 == 338) {
				local5[local7] = -116;
			} else if (local14 == 381) {
				local5[local7] = -114;
			} else if (local14 == 8216) {
				local5[local7] = -111;
			} else if (local14 == 8217) {
				local5[local7] = -110;
			} else if (local14 == 8220) {
				local5[local7] = -109;
			} else if (local14 == 8221) {
				local5[local7] = -108;
			} else if (local14 == 8226) {
				local5[local7] = -107;
			} else if (local14 == 8211) {
				local5[local7] = -106;
			} else if (local14 == 8212) {
				local5[local7] = -105;
			} else if (local14 == 732) {
				local5[local7] = -104;
			} else if (local14 == 8482) {
				local5[local7] = -103;
			} else if (local14 == 353) {
				local5[local7] = -102;
			} else if (local14 == 8250) {
				local5[local7] = -101;
			} else if (local14 == 339) {
				local5[local7] = -100;
			} else if (local14 == 382) {
				local5[local7] = -98;
			} else if (local14 == 376) {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fn", name = "aq", descriptor = "(I)I", line = 519)
	public static int method26272() {
		Class522.aTwitchEventLiveStreams1 = null;
		return Class166_Sub13.aTwitchTV1.RequestLiveStreams(client.aClass702_4.aString242);
	}

	@OriginalMember(owner = "client!fn", name = "act", descriptor = "(Lclient!yf;B)V", line = 9964)
	static final void method26274(@OriginalArg(0) Class681 arg0) {
		if (Class581.aClass386_2 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
			arg0.aClass386_3 = Class581.aClass386_2;
			arg0.aMap26.put(Class138.aClass138_68, Class27.method589(arg0.aClass386_3));
		}
	}

	@OriginalMember(owner = "client!fn", name = "jy", descriptor = "(IIIIB)V", line = 10067)
	static final void method26273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3562 * -1477010237; local1++) {
			@Pc(10) Rectangle local10 = client.aRectangleArray1[local1];
			if (local10.width + local10.x > arg0 && local10.x < arg0 + arg2 && local10.y + local10.height > arg1 && local10.y < arg3 + arg1) {
				client.aBooleanArray22[local1] = true;
			}
		}
	}
}
