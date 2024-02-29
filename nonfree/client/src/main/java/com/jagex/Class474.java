package com.jagex;

import java.awt.Point;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public class Class474 {

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
	static final int anInt5001 = 16;

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
	static final int anInt5002 = 2;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
	public static final int anInt5003 = 4;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
	public static final int anInt5004 = 2;

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
	public static final int anInt5005 = 8;

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
	static final int anInt5006 = 2;

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "Lclient!anb;")
	static Class35_Sub2 aClass35_Sub2_4;

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(III)V", line = 12)
	public Class474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArrayArrayArray13 = new byte[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "()V", line = 17)
	public void method29657() {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray13.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray13[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray13[0][0].length; local17++) {
					this.aByteArrayArrayArray13[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "(I)V", line = 17)
	public void method29658() {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray13.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray13[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray13[0][0].length; local17++) {
					this.aByteArrayArrayArray13[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "()V", line = 17)
	public void method29659() {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray13.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray13[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray13[0][0].length; local17++) {
					this.aByteArrayArrayArray13[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(III)Z", line = 27)
	public boolean method29660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[3].length && arg1 < this.aByteArrayArrayArray13[3][arg0].length) {
			return (this.aByteArrayArrayArray13[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "(II)Z", line = 27)
	public boolean method29661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[3].length && arg1 < this.aByteArrayArrayArray13[3][arg0].length) {
			return (this.aByteArrayArrayArray13[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "(II)Z", line = 27)
	public boolean method29662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[3].length && arg1 < this.aByteArrayArrayArray13[3][arg0].length) {
			return (this.aByteArrayArrayArray13[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(Ljava/lang/String;ZZI)V", line = 28)
	public static void method29663(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class413.method28592(arg0, arg1, "openjs", arg2);
	}

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "(II)Z", line = 32)
	public boolean method29664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[1].length && arg1 < this.aByteArrayArrayArray13[1][arg0].length) {
			return (this.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "(IIB)Z", line = 32)
	public boolean method29665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[1].length && arg1 < this.aByteArrayArrayArray13[1][arg0].length) {
			return (this.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(II)Z", line = 32)
	public boolean method29666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[1].length && arg1 < this.aByteArrayArrayArray13[1][arg0].length) {
			return (this.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "(II)Z", line = 32)
	public boolean method29667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[1].length && arg1 < this.aByteArrayArrayArray13[1][arg0].length) {
			return (this.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(II)Z", line = 32)
	public boolean method29668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[1].length && arg1 < this.aByteArrayArrayArray13[1][arg0].length) {
			return (this.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "(II)Z", line = 32)
	public boolean method29669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[1].length && arg1 < this.aByteArrayArrayArray13[1][arg0].length) {
			return (this.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "(II)Z", line = 32)
	public boolean method29670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray13[1].length && arg1 < this.aByteArrayArrayArray13[1][arg0].length) {
			return (this.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "(IIIII)Z", line = 38)
	public boolean method29671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray13[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray13[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method29673(arg1, arg2, arg3) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "([I[IIII)V", line = 43)
	public static void method29672(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method29672(arg0, arg1, arg2, local10 - 1);
		method29672(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "(IIIB)I", line = 45)
	int method29673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray13[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "(III)I", line = 45)
	int method29674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray13[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "(III)I", line = 45)
	int method29675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray13[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "(B)V", line = 75)
	static void method29676() {
		@Pc(2) Queue local2 = Class640.aQueue3;
		synchronized (Class640.aQueue3) {
			@Pc(9) Point local9;
			if (Class470.aCanvas6.isShowing()) {
				local9 = Class470.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class77_Sub42_Sub1 local16 = (Class77_Sub42_Sub1) Class640.aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class470.aCanvas6.isShowing() && Class77_Sub36.aBoolean351) {
						local16.method22386(local9);
						if (!local16.method22385() && local16.method22716() < Class149_Sub4.anInt2368 * 1771907305 && local16.method22717() < Class19.anInt108 * -1091172141 && local16.method22716() >= 0 && local16.method22717() >= 0) {
							@Pc(68) int local68 = local16.method22715();
							if (local16.method22715() == -1) {
								Class640.aClass147_Sub1_1.method15614(local16);
							} else if (Class412.method28581(local68)) {
								Class640.aClass147_Sub1_1.method15559(local16);
							}
						}
					} else {
						local16.method22720();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", line = 127)
	static final String method29677(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ps", name = "ju", descriptor = "(B)V", line = 9626)
	static final void method29678() {
		@Pc(2) Class77_Sub39_Sub1 local2 = client.aClass82_2.aClass77_Sub39_Sub1_1;
		for (@Pc(4) int local4 = 0; local4 < client.anInt3410 * 1422306081; local4++) {
			@Pc(13) int local13 = client.anIntArray341[local4];
			@Pc(21) Class104_Sub1_Sub1_Sub1_Sub1 local21 = (Class104_Sub1_Sub1_Sub1_Sub1) ((Class77_Sub6) client.aClass12_22.method173((long) local13)).anObject5;
			local2.method22483();
			@Pc(29) int local29 = local2.method22478();
			if ((local29 & 0x8) != 0) {
				local29 += local2.method22478() << 8;
			}
			if ((local29 & 0x800) != 0) {
				local29 += local2.method22478() << 16;
			}
			if ((local29 & 0x20000) != 0) {
				local29 += local2.method22478() << 24;
			}
			if ((local29 & 0x80) != 0) {
				local21.method19839(local2.method22523(), 0, 0);
			}
			@Pc(106) int local106;
			@Pc(108) int local108;
			@Pc(115) int local115;
			@Pc(122) Class489 local122;
			@Pc(128) Class438 local128;
			if ((local29 & 0x80000) != 0) {
				local2.anInt3089 += 1520029430;
				local106 = local2.aByteArray53[(local2.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
				for (local108 = 0; local108 < local106; local108++) {
					local115 = local2.method22478();
					local122 = (Class489) Class457.method29479(Class489.method30004(), local115);
					local128 = Class539.aClass80_Sub1_Sub2_6.method1952(local2, local122);
					local21.anInterface3_5.method128(local128.anInt4927 * -608978823, local128.anObject19);
				}
			}
			if ((local29 & 0x100) != 0) {
				local21.anInt2879 = local2.method22603() * -1191215595;
				local21.anInt2881 = local2.method22600() * 668624251;
				local21.anInt2884 = local2.method22601() * 97139519;
				local21.anInt2899 = local2.method22481() * 554036703;
				local21.anInt2886 = local2.method22601() * 16838697;
				local21.anInt2887 = local2.method22600() * -2088816671;
				local21.anInt2888 = (local2.method22621() + client.anInt3414) * 395292927;
				local21.anInt2889 = (local2.method22617() + client.anInt3414) * 1497408113;
				local21.anInt2890 = local2.method22617() * -914359499;
				local21.anInt2900 = 990207207;
				local21.anInt2877 = 0;
				local21.anInt2879 += local21.anIntArray274[0] * -1191215595;
				local21.anInt2881 += local21.anIntArray275[0] * 668624251;
				local21.anInt2884 += local21.anIntArray274[0] * 97139519;
				local21.anInt2899 += local21.anIntArray275[0] * 554036703;
				local21.anInt2886 += local21.aByte100 * 16838697;
				local21.anInt2887 += local21.aByte100 * -2088816671;
			}
			if ((local29 & 0x40) != 0) {
				local21.anInt2755 = local2.method22617() * -433401485;
				local21.anInt2756 = local2.method22483() * 140700719;
			}
			@Pc(319) int local319;
			@Pc(361) int local361;
			@Pc(410) int local410;
			@Pc(315) int local315;
			@Pc(334) int local334;
			if ((local29 & 0x10) != 0) {
				local106 = local2.method22598();
				if (local106 > 0) {
					for (local108 = 0; local108 < local106; local108++) {
						local315 = -1;
						@Pc(317) boolean local317 = true;
						local319 = -1;
						local115 = local2.method22537();
						if (local115 == 32767) {
							local115 = local2.method22537();
							local334 = local2.method22537();
							local315 = local2.method22537();
							local319 = local2.method22537();
						} else if (local115 == 32766) {
							local115 = -1;
							local334 = local2.method22478();
						} else {
							local334 = local2.method22537();
						}
						local361 = local2.method22537();
						local21.method21088(local115, local334, local315, local319, client.anInt3414, local361);
					}
				}
				local108 = local2.method22598();
				if (local108 > 0) {
					for (local115 = 0; local115 < local108; local115++) {
						local315 = local2.method22537();
						local334 = local2.method22537();
						if (local334 == 32767) {
							local21.method21091(local315);
						} else {
							local319 = local2.method22537();
							local361 = local2.method22591();
							local410 = local334 > 0 ? local2.method22478() : local361;
							local21.method21089(local315, client.anInt3414, local334, local319, local361, local410);
						}
					}
				}
			}
			@Pc(480) int[] local480;
			if ((local29 & 0x1000) != 0) {
				local106 = local21.aClass333_1.anIntArray435.length;
				local108 = 0;
				if (local21.aClass333_1.aShortArray117 != null) {
					local108 = local21.aClass333_1.aShortArray117.length;
				}
				local115 = 0;
				if (local21.aClass333_1.aShortArray119 != null) {
					local115 = local21.aClass333_1.aShortArray119.length;
				}
				local315 = local2.method22591();
				if ((local315 & 0x1) == 1) {
					local21.aClass328_1 = null;
				} else {
					local2.anInt3089 += 1520029430;
					local480 = null;
					@Pc(482) float[] local482 = null;
					@Pc(485) int[][] local485 = null;
					@Pc(488) int[][] local488 = null;
					@Pc(541) int local541;
					if ((local315 & 0x2) == 2) {
						local480 = new int[local106];
						if ((local315 & 0x10) == 16) {
							local482 = new float[local106];
							local485 = new int[local106][3];
							local488 = new int[local106][3];
						}
						for (@Pc(514) int local514 = 0; local514 < local106; local514++) {
							local480[local514] = local2.method22549();
							if ((local315 & 0x10) == 16 && local480[local514] != -1) {
								local482[local514] = local2.method22517();
								for (local541 = 0; local541 < 3; local541++) {
									local485[local514][local541] = local2.method22487();
								}
								for (local541 = 0; local541 < 3; local541++) {
									local488[local514][local541] = local2.method22625();
								}
							}
						}
					}
					@Pc(573) short[] local573 = null;
					if ((local315 & 0x4) == 4) {
						local573 = new short[local108];
						for (local541 = 0; local541 < local108; local541++) {
							local573[local541] = (short) local2.method22621();
						}
					}
					@Pc(597) short[] local597 = null;
					if ((local315 & 0x8) == 8) {
						local597 = new short[local115];
						for (@Pc(607) int local607 = 0; local607 < local115; local607++) {
							local597[local607] = (short) local2.method22621();
						}
					}
					@Pc(630) long local630 = (long) ((Class104_Sub1_Sub1_Sub1_Sub1.anInt2757 += 1863082793) * -1602557671 - 1);
					local21.aClass328_1 = new Class328(local630, local480, local482, local485, local488, local573, local597);
				}
			}
			if ((local29 & 0x2) != 0) {
				local21.anInt2880 = local2.method22621() * 776069067;
				if (local21.anInt2880 * 1409535459 == 65535) {
					local21.anInt2880 = -776069067;
				}
			}
			@Pc(675) int[] local675;
			@Pc(678) int[] local678;
			if ((local29 & 0x8000) != 0) {
				local106 = local2.method22598();
				local675 = new int[local106];
				local678 = new int[local106];
				for (local315 = 0; local315 < local106; local315++) {
					local334 = local2.method22617();
					if ((local334 & 0xC000) == 49152) {
						local319 = local2.method22621();
						local675[local315] = local334 << 16 | local319;
					} else {
						local675[local315] = local334;
					}
					local678[local315] = local2.method22483();
				}
				local21.method21073(local675, local678);
			}
			if ((local29 & 0x1) != 0) {
				@Pc(730) int[] local730 = new int[4];
				for (local108 = 0; local108 < 4; local108++) {
					local730[local108] = local2.method22549();
				}
				local108 = local2.method22591();
				Class96_Sub5.method7145(local21, local730, local108, true);
			}
			if ((local29 & 0x200) != 0) {
				local106 = local2.method22591();
				local675 = new int[local106];
				local678 = new int[local106];
				@Pc(770) int[] local770 = new int[local106];
				for (local334 = 0; local334 < local106; local334++) {
					local319 = local2.method22549();
					local675[local334] = local319;
					local678[local334] = local2.method22591();
					local770[local334] = local2.method22617();
				}
				Class638.method32719(local21, local675, local678, local770);
			}
			if ((local29 & 0x200000) != 0) {
				local21.anInterface3_5.method132();
				local2.anInt3089 += 1520029430;
				local106 = local2.aByteArray53[(local2.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
				for (local108 = 0; local108 < local106; local108++) {
					local115 = local2.method22598();
					local122 = (Class489) Class457.method29479(Class489.method30004(), local115);
					local128 = Class539.aClass80_Sub1_Sub2_6.method1952(local2, local122);
					local21.anInterface3_5.method128(local128.anInt4927 * -608978823, local128.anObject19);
				}
			}
			@Pc(916) boolean local916;
			if ((local29 & 0x20) != 0) {
				local106 = local2.method22617();
				local108 = local2.method22648();
				if (local106 == 65535) {
					local106 = -1;
				}
				local115 = local2.method22589();
				local315 = local115 & 0x7;
				local334 = local115 >> 3 & 0xF;
				if (local334 == 15) {
					local334 = -1;
				}
				local916 = (local115 >> 7 & 0x1) == 1;
				local21.method21080(local106, local108, local315, local334, local916, 0);
			}
			if ((local29 & 0x1000000) != 0) {
				local21.aByte73 = local2.method22600();
				local21.aByte74 = local2.method22481();
				local21.aByte75 = local2.method22481();
				local21.aByte76 = (byte) local2.method22589();
				local21.anInt2891 = (client.anInt3414 + local2.method22621()) * 1446706933;
				local21.anInt2892 = (client.anInt3414 + local2.method22483()) * -1565168329;
			}
			if ((local29 & 0x20000000) != 0) {
				local21.aBoolean481 = local2.method22591() == 1;
			}
			if ((local29 & 0x4000000) != 0) {
				local106 = local2.method22483();
				local108 = local2.method22653();
				if (local106 == 65535) {
					local106 = -1;
				}
				local115 = local2.method22589();
				local315 = local115 & 0x7;
				local334 = local115 >> 3 & 0xF;
				if (local334 == 15) {
					local334 = -1;
				}
				local916 = (local115 >> 7 & 0x1) == 1;
				local21.method21080(local106, local108, local315, local334, local916, 4);
			}
			if ((local29 & 0x10000) != 0) {
				local106 = local2.aByteArray53[(local2.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
				for (local108 = 0; local108 < local106; local108++) {
					local115 = local2.method22589();
					local315 = local2.method22500();
					local334 = local2.method22633();
					local21.method19836(local115, local315, local334);
				}
			}
			if ((local29 & 0x400) != 0) {
				local21.anInt2761 = local2.method22621() * -523484721;
				if (local21.anInt2761 * 1265837359 == 65535) {
					local21.anInt2761 = 523484721;
				}
			}
			if ((local29 & 0x2000000) != 0) {
				local106 = local2.method22483();
				local108 = local2.method22500();
				if (local106 == 65535) {
					local106 = -1;
				}
				local115 = local2.method22589();
				local315 = local115 & 0x7;
				local334 = local115 >> 3 & 0xF;
				if (local334 == 15) {
					local334 = -1;
				}
				local916 = (local115 >> 7 & 0x1) == 1;
				local21.method21080(local106, local108, local315, local334, local916, 2);
			}
			if ((local29 & 0x800000) != 0) {
				local106 = local2.method22478();
				local675 = new int[8];
				@Pc(1176) short[] local1176 = new short[8];
				for (local315 = 0; local315 < 8; local315++) {
					if ((local106 & 0x1 << local315) == 0) {
						local675[local315] = -1;
						local1176[local315] = -1;
					} else {
						local675[local315] = local2.method22549();
						local1176[local315] = (short) local2.method22541();
					}
				}
				local21.aClass323_1 = new Class323(local675, local1176);
			}
			if ((local29 & 0x100000) != 0) {
				local21.aString67 = local2.method22523();
				if ("".equals(local21.aString67) || local21.aString67.equals(local21.aClass333_1.aString202)) {
					local21.aString67 = local21.aClass333_1.aString202;
				}
			}
			if ((local29 & 0x2000) != 0) {
				local106 = local2.method22617();
				local108 = local2.method22653();
				if (local106 == 65535) {
					local106 = -1;
				}
				local115 = local2.method22478();
				local315 = local115 & 0x7;
				local334 = local115 >> 3 & 0xF;
				if (local334 == 15) {
					local334 = -1;
				}
				local916 = (local115 >> 7 & 0x1) == 1;
				local21.method21080(local106, local108, local315, local334, local916, 1);
			}
			if ((local29 & 0x400000) != 0) {
				local21.anInt2754 = local2.method22612() * -1105335343;
				if (local21.anInt2754 * 1691897137 == 65535) {
					local21.anInt2754 = local21.aClass333_1.anInt4105 * -423106977;
				}
			}
			if ((local29 & 0x4) != 0) {
				if (local21.aClass333_1.method27652()) {
					Class689.method36313(local21);
				}
				local21.method19813((Class333) Class578.aClass35_Sub3_1.method18319(local2.method22549()), (local29 & 0x100000) == 0, (local29 & 0x400000) == 0, true);
				local21.method21092(local21.aClass333_1.anInt4117 * -1821838479);
				local21.anInt2897 = (local21.aClass333_1.anInt4112 * -1373680215 << 3) * 1883849079;
				if (local21.aClass333_1.method27652()) {
					Class458.method29495(local21.aByte100, local21.anIntArray274[0], local21.anIntArray275[0], 0, null, local21, null);
				}
			}
			if ((local29 & 0x40000) != 0) {
				local106 = local21.aClass333_1.anIntArray436.length;
				local108 = 0;
				if (local21.aClass333_1.aShortArray117 != null) {
					local108 = local21.aClass333_1.aShortArray117.length;
				}
				@Pc(1429) byte local1429 = 0;
				if (local21.aClass333_1.aShortArray119 != null) {
					local108 = local21.aClass333_1.aShortArray119.length;
				}
				local315 = local2.method22478();
				if ((local315 & 0x1) != 1) {
					local2.anInt3089 += 1520029430;
					local480 = null;
					if ((local315 & 0x2) == 2) {
						local480 = new int[local106];
						for (local319 = 0; local319 < local106; local319++) {
							local480[local319] = local2.method22549();
						}
					}
					@Pc(1480) short[] local1480 = null;
					if ((local315 & 0x4) == 4) {
						local1480 = new short[local108];
						for (local361 = 0; local361 < local108; local361++) {
							local1480[local361] = (short) local2.method22617();
						}
					}
					@Pc(1504) short[] local1504 = null;
					if ((local315 & 0x8) == 8) {
						local1504 = new short[local1429];
						for (local410 = 0; local410 < local1429; local410++) {
							local1504[local410] = (short) local2.method22483();
						}
					}
					@Pc(1537) long local1537 = (long) ((Class104_Sub1_Sub1_Sub1_Sub1.anInt2758 += 751626731) * -353962301 - 1);
					new Class328(local1537, local480, null, null, null, local1480, local1504);
				}
			}
			if ((local29 & 0x10000000) != 0) {
				local21.anInt2764 = local2.method22478() * 1164120609;
			}
			if ((local29 & 0x8000000) != 0) {
				local106 = local2.method22483();
				local108 = local2.method22645();
				if (local106 == 65535) {
					local106 = -1;
				}
				local115 = local2.method22478();
				local315 = local115 & 0x7;
				local334 = local115 >> 3 & 0xF;
				if (local334 == 15) {
					local334 = -1;
				}
				local916 = (local115 >> 7 & 0x1) == 1;
				local21.method21080(local106, local108, local315, local334, local916, 3);
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "auz", descriptor = "(Lclient!yf;I)V", line = 13066)
	static final void method29679(@OriginalArg(0) Class665 arg0) {
	}

	@OriginalMember(owner = "client!ps", name = "awy", descriptor = "(Lclient!yf;I)V", line = 13228)
	static final void method29680(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
