package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!ajn")
public class Class77_Sub15 extends Class77 {

	@OriginalMember(owner = "client!ajn", name = "s", descriptor = "I")
	int anInt1484 = 0;

	@OriginalMember(owner = "client!ajn", name = "r", descriptor = "I")
	int anInt1481 = 0;

	@OriginalMember(owner = "client!ajn", name = "g", descriptor = "I")
	int anInt1486 = 0;

	@OriginalMember(owner = "client!ajn", name = "l", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_27;

	@OriginalMember(owner = "client!ajn", name = "w", descriptor = "Lclient!ajv;")
	final Class77_Sub22 aClass77_Sub22_2;

	@OriginalMember(owner = "client!ajn", name = "y", descriptor = "Lclient!aek;")
	final Class88_Sub2 aClass88_Sub2_2;

	@OriginalMember(owner = "client!ajn", name = "t", descriptor = "I")
	int anInt1485;

	@OriginalMember(owner = "client!ajn", name = "q", descriptor = "I")
	int anInt1487;

	@OriginalMember(owner = "client!ajn", name = "x", descriptor = "I")
	int anInt1482;

	@OriginalMember(owner = "client!ajn", name = "d", descriptor = "I")
	int anInt1483;

	@OriginalMember(owner = "client!ajn", name = "i", descriptor = "[[F")
	float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!ajn", name = "k", descriptor = "[[F")
	float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!ajn", name = "u", descriptor = "[[F")
	float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!ajn", name = "e", descriptor = "Lclient!aak;")
	Class12 aClass12_11;

	@OriginalMember(owner = "client!ajn", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!ajn", name = "j", descriptor = "Lclient!kp;")
	Interface36 anInterface36_11;

	@OriginalMember(owner = "client!ajn", name = "z", descriptor = "Lclient!lc;")
	Interface38 anInterface38_2;

	@OriginalMember(owner = "client!ajn", name = "<init>", descriptor = "(Lclient!aed;Lclient!aek;Lclient!ajv;[I)V", line = 30)
	Class77_Sub15(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class77_Sub22 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass86_Sub1_27 = arg0;
		this.aClass77_Sub22_2 = arg2;
		this.aClass88_Sub2_2 = arg1;
		@Pc(31) int local31 = this.aClass77_Sub22_2.method13555() - (arg1.anInt608 * 127780559 >> 1);
		this.anInt1485 = this.aClass77_Sub22_2.method13544() - local31 >> arg1.anInt609 * -1495101509;
		this.anInt1487 = this.aClass77_Sub22_2.method13544() + local31 >> arg1.anInt609 * -1495101509;
		this.anInt1482 = this.aClass77_Sub22_2.method13552() - local31 >> arg1.anInt609 * -1495101509;
		this.anInt1483 = this.aClass77_Sub22_2.method13552() + local31 >> arg1.anInt609 * -1495101509;
		@Pc(91) int local91 = this.anInt1487 - this.anInt1485 + 1;
		@Pc(99) int local99 = this.anInt1483 - this.anInt1482 + 1;
		this.aFloatArrayArray16 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray18 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray17 = new float[local91 + 1][local99 + 1];
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(149) int local149;
		@Pc(157) int local157;
		@Pc(184) int local184;
		@Pc(200) int local200;
		for (local128 = 0; local128 <= local99; local128++) {
			local136 = local128 + this.anInt1482;
			if (local136 > 0 && local136 < this.aClass88_Sub2_2.anInt606 * -1466328823 - 1) {
				for (local149 = 0; local149 <= local91; local149++) {
					local157 = local149 + this.anInt1485;
					if (local157 > 0 && local157 < this.aClass88_Sub2_2.anInt607 * -1924295585 - 1) {
						local184 = arg1.method5500(local157 + 1, local136) - arg1.method5500(local157 - 1, local136);
						local200 = arg1.method5500(local157, local136 + 1) - arg1.method5500(local157, local136 - 1);
						@Pc(215) float local215 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + 65536 + local200 * local200)));
						this.aFloatArrayArray16[local149][local128] = (float) local184 * local215;
						this.aFloatArrayArray18[local149][local128] = -256.0F * local215;
						this.aFloatArrayArray17[local149][local128] = (float) local200 * local215;
					}
				}
			}
		}
		local128 = 0;
		for (local136 = this.anInt1482; local136 <= this.anInt1483; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt606 * -1466328823) {
				for (local149 = this.anInt1485; local149 <= this.anInt1487; local149++) {
					if (local149 >= 0 && local149 < arg1.anInt607 * -1924295585) {
						local157 = arg3[local128];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray8[local149][local136];
						if (local291 != null && local157 != 0) {
							if (local157 == 1) {
								for (local200 = 0; local200 < local291.length; local200 += 3) {
									if (local291[local200] != -1 && local291[local200 + 1] != -1 && local291[local200 + 2] != -1) {
										this.anInt1481 += 3;
									}
								}
							} else {
								this.anInt1481 += 3;
							}
						}
					}
					local128++;
				}
			} else {
				local128 += this.anInt1487 - this.anInt1485;
			}
		}
		if (this.anInt1481 > 0) {
			this.aClass12_11 = new Class12(Class199.method25492(this.anInt1481));
			this.aByteBuffer5 = this.aClass86_Sub1_27.aByteBuffer7;
			this.aByteBuffer5.clear();
			this.aByteBuffer5.position(this.aClass86_Sub1_27.anInt2838 >> 1);
			this.aByteBuffer5.slice();
			this.aByteBuffer5.position(0);
			this.aByteBuffer5.limit(this.aClass86_Sub1_27.anInt2838 >> 1);
			local136 = 0;
			local128 = 0;
			for (local149 = this.anInt1482; local149 <= this.anInt1483; local149++) {
				if (local149 >= 0 && local149 < arg1.anInt606 * -1466328823) {
					local157 = 0;
					for (local184 = this.anInt1485; local184 <= this.anInt1487; local184++) {
						if (local184 >= 0 && local184 < arg1.anInt607 * -1924295585) {
							local200 = arg3[local128];
							@Pc(447) int[] local447 = arg1.anIntArrayArrayArray8[local184][local149];
							if (local447 != null && local200 != 0) {
								if (local200 == 1) {
									@Pc(461) int[] local461 = arg1.anIntArrayArrayArray7[local184][local149];
									@Pc(468) int[] local468 = arg1.anIntArrayArrayArray9[local184][local149];
									@Pc(470) int local470 = 0;
									label110: while (true) {
										while (true) {
											if (local470 >= local447.length) {
												break label110;
											}
											if (local447[local470] == -1 || local447[local470 + 1] == -1 || local447[local470 + 2] == -1) {
												local470 += 3;
											} else {
												this.method13419(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
												this.method13419(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
												this.method13419(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
											}
										}
									}
								} else if (local200 == 3) {
									this.method13419(local157, local136, local184, local149, 0, 0);
									this.method13419(local157, local136, local184, local149, arg1.anInt608 * 127780559, 0);
									this.method13419(local157, local136, local184, local149, 0, arg1.anInt608 * 127780559);
								} else if (local200 == 2) {
									this.method13419(local157, local136, local184, local149, arg1.anInt608 * 127780559, 0);
									this.method13419(local157, local136, local184, local149, arg1.anInt608 * 127780559, arg1.anInt608 * 127780559);
									this.method13419(local157, local136, local184, local149, 0, 0);
								} else if (local200 == 5) {
									this.method13419(local157, local136, local184, local149, arg1.anInt608 * 127780559, arg1.anInt608 * 127780559);
									this.method13419(local157, local136, local184, local149, 0, arg1.anInt608 * 127780559);
									this.method13419(local157, local136, local184, local149, arg1.anInt608 * 127780559, 0);
								} else if (local200 == 4) {
									this.method13419(local157, local136, local184, local149, 0, arg1.anInt608 * 127780559);
									this.method13419(local157, local136, local184, local149, 0, 0);
									this.method13419(local157, local136, local184, local149, arg1.anInt608 * 127780559, arg1.anInt608 * 127780559);
								}
							}
						}
						local128++;
						local157++;
					}
				} else {
					local128 += this.anInt1487 - this.anInt1485;
				}
				local136++;
			}
			this.method13418();
		} else {
			this.anInterface36_11 = null;
			this.anInterface38_2 = null;
		}
		this.aClass12_11 = null;
		this.aFloatArrayArray17 = null;
		this.aFloatArrayArray18 = null;
		this.aFloatArrayArray16 = null;
	}

	@OriginalMember(owner = "client!ajn", name = "q", descriptor = "()V", line = 158)
	void method13414() {
		this.anInterface38_2 = this.aClass86_Sub1_27.method20772(false);
		this.anInterface38_2.method28728(this.anInt1486);
		this.anInterface36_11 = this.aClass86_Sub1_27.method20656(false);
		this.anInterface36_11.method28760(this.anInt1484 * 16, 16);
		this.anInterface36_11.method28755(0, this.anInt1484 * 16, this.aClass86_Sub1_27.aLong121);
		this.anInterface38_2.method28755(0, this.anInt1486 * 2, this.aClass86_Sub1_27.aLong121 + (long) (this.aClass86_Sub1_27.anInt2838 >> 1));
	}

	@OriginalMember(owner = "client!ajn", name = "y", descriptor = "()V", line = 158)
	void method13415() {
		this.anInterface38_2 = this.aClass86_Sub1_27.method20772(false);
		this.anInterface38_2.method28728(this.anInt1486);
		this.anInterface36_11 = this.aClass86_Sub1_27.method20656(false);
		this.anInterface36_11.method28760(this.anInt1484 * 16, 16);
		this.anInterface36_11.method28755(0, this.anInt1484 * 16, this.aClass86_Sub1_27.aLong121);
		this.anInterface38_2.method28755(0, this.anInt1486 * 2, this.aClass86_Sub1_27.aLong121 + (long) (this.aClass86_Sub1_27.anInt2838 >> 1));
	}

	@OriginalMember(owner = "client!ajn", name = "w", descriptor = "()V", line = 158)
	void method13416() {
		this.anInterface38_2 = this.aClass86_Sub1_27.method20772(false);
		this.anInterface38_2.method28728(this.anInt1486);
		this.anInterface36_11 = this.aClass86_Sub1_27.method20656(false);
		this.anInterface36_11.method28760(this.anInt1484 * 16, 16);
		this.anInterface36_11.method28755(0, this.anInt1484 * 16, this.aClass86_Sub1_27.aLong121);
		this.anInterface38_2.method28755(0, this.anInt1486 * 2, this.aClass86_Sub1_27.aLong121 + (long) (this.aClass86_Sub1_27.anInt2838 >> 1));
	}

	@OriginalMember(owner = "client!ajn", name = "t", descriptor = "()V", line = 158)
	void method13417() {
		this.anInterface38_2 = this.aClass86_Sub1_27.method20772(false);
		this.anInterface38_2.method28728(this.anInt1486);
		this.anInterface36_11 = this.aClass86_Sub1_27.method20656(false);
		this.anInterface36_11.method28760(this.anInt1484 * 16, 16);
		this.anInterface36_11.method28755(0, this.anInt1484 * 16, this.aClass86_Sub1_27.aLong121);
		this.anInterface38_2.method28755(0, this.anInt1486 * 2, this.aClass86_Sub1_27.aLong121 + (long) (this.aClass86_Sub1_27.anInt2838 >> 1));
	}

	@OriginalMember(owner = "client!ajn", name = "p", descriptor = "()V", line = 158)
	void method13418() {
		this.anInterface38_2 = this.aClass86_Sub1_27.method20772(false);
		this.anInterface38_2.method28728(this.anInt1486);
		this.anInterface36_11 = this.aClass86_Sub1_27.method20656(false);
		this.anInterface36_11.method28760(this.anInt1484 * 16, 16);
		this.anInterface36_11.method28755(0, this.anInt1484 * 16, this.aClass86_Sub1_27.aLong121);
		this.anInterface38_2.method28755(0, this.anInt1486 * 2, this.aClass86_Sub1_27.aLong121 + (long) (this.aClass86_Sub1_27.anInt2838 >> 1));
	}

	@OriginalMember(owner = "client!ajn", name = "c", descriptor = "(IIIIII)V", line = 167)
	void method13419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass88_Sub2_2.anInt609 * -1495101509);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass88_Sub2_2.anInt609 * -1495101509);
		@Pc(28) int local28 = this.aClass88_Sub2_2.method5493(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class77 local53 = this.aClass12_11.method173(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass86_Sub1_27.anUnsafe4;
				local59.putShort(this.aClass86_Sub1_27.aLong121 + (long) (this.aClass86_Sub1_27.anInt2838 >> 1) + (long) (this.anInt1486 * 2), ((Class77_Sub17) local53).aShort101);
				this.anInt1486++;
				return;
			}
		}
		@Pc(91) short local91 = (short) this.anInt1484;
		if (local1 != -1L) {
			this.aClass12_11.method184(new Class77_Sub17(local91), local1);
		}
		@Pc(114) float local114;
		@Pc(121) float local121;
		@Pc(128) float local128;
		@Pc(261) float local261;
		@Pc(271) float local271;
		@Pc(278) float local278;
		@Pc(285) float local285;
		@Pc(292) float local292;
		@Pc(301) float local301;
		@Pc(310) float local310;
		@Pc(319) float local319;
		if (arg4 == 0 && arg5 == 0) {
			local114 = this.aFloatArrayArray16[arg0][arg1];
			local121 = this.aFloatArrayArray18[arg0][arg1];
			local128 = this.aFloatArrayArray17[arg0][arg1];
		} else if (arg4 == this.aClass88_Sub2_2.anInt608 * 127780559 && arg5 == 0) {
			local114 = this.aFloatArrayArray16[arg0 + 1][arg1];
			local121 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local128 = this.aFloatArrayArray17[arg0 + 1][arg1];
		} else if (arg4 == this.aClass88_Sub2_2.anInt608 * 127780559 && arg5 == this.aClass88_Sub2_2.anInt608 * 127780559) {
			local114 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
			local121 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
			local128 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass88_Sub2_2.anInt608 * 127780559) {
			local114 = this.aFloatArrayArray16[arg0][arg1 + 1];
			local121 = this.aFloatArrayArray18[arg0][arg1 + 1];
			local128 = this.aFloatArrayArray17[arg0][arg1 + 1];
		} else {
			local261 = (float) arg4 / (float) (this.aClass88_Sub2_2.anInt608 * 127780559);
			local271 = (float) arg5 / (float) (this.aClass88_Sub2_2.anInt608 * 127780559);
			local278 = this.aFloatArrayArray16[arg0][arg1];
			local285 = this.aFloatArrayArray18[arg0][arg1];
			local292 = this.aFloatArrayArray17[arg0][arg1];
			local301 = this.aFloatArrayArray16[arg0 + 1][arg1];
			local310 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local319 = this.aFloatArrayArray17[arg0 + 1][arg1];
			@Pc(334) float local334 = local278 + (this.aFloatArrayArray16[arg0][arg1 + 1] - local278) * local261;
			@Pc(349) float local349 = local285 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local285) * local261;
			@Pc(364) float local364 = local292 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local292) * local261;
			@Pc(381) float local381 = local301 + (this.aFloatArrayArray16[arg0 + 1][arg1 + 1] - local301) * local261;
			@Pc(398) float local398 = local310 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local310) * local261;
			@Pc(415) float local415 = local319 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local319) * local261;
			local114 = local334 + (local381 - local334) * local271;
			local121 = local349 + (local398 - local349) * local271;
			local128 = local364 + (local415 - local364) * local271;
		}
		local261 = this.aClass77_Sub22_2.method13544() - local11;
		local271 = this.aClass77_Sub22_2.method13550() - local28;
		local278 = this.aClass77_Sub22_2.method13552() - local21;
		local285 = (float) Math.sqrt((double) (local261 * local261 + local271 * local271 + local278 * local278));
		local292 = 1.0F / local285;
		local261 *= local292;
		local271 *= local292;
		local278 *= local292;
		local301 = local285 / (float) this.aClass77_Sub22_2.method13555();
		local310 = 1.0F - local301 * local301;
		if (local310 < 0.0F) {
			local310 = 0.0F;
		}
		local319 = local261 * local114 + local271 * local121 + local278 * local128;
		if (local319 < 0.0F) {
			local319 = 0.0F;
		}
		@Pc(538) float local538 = local319 * local310 * 2.0F;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(549) int local549 = this.aClass77_Sub22_2.method13557();
		@Pc(559) int local559 = (int) (local538 * (float) (local549 >> 16 & 0xFF));
		if (local559 > 255) {
			local559 = 255;
		}
		@Pc(574) int local574 = (int) (local538 * (float) (local549 >> 8 & 0xFF));
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(587) int local587 = (int) (local538 * (float) (local549 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(596) Unsafe local596 = this.aClass86_Sub1_27.anUnsafe4;
		local596.putFloat(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16), (float) local11);
		local596.putFloat(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 4L, (float) local28);
		local596.putFloat(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 8L, (float) local21);
		if (this.aClass86_Sub1_27.anInt2847 == 0) {
			local596.putByte(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 12L, (byte) local587);
			local596.putByte(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 14L, (byte) local559);
		} else {
			local596.putByte(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 12L, (byte) local559);
			local596.putByte(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 14L, (byte) local587);
		}
		local596.putByte(this.aClass86_Sub1_27.aLong121 + (long) (this.anInt1484 * 16) + 15L, (byte) -1);
		this.anInt1484++;
		local596.putShort(this.aClass86_Sub1_27.aLong121 + (long) (this.aClass86_Sub1_27.anInt2838 >> 1) + (long) (this.anInt1486 * 2), local91);
		this.anInt1486++;
	}

	@OriginalMember(owner = "client!ajn", name = "v", descriptor = "(Lclient!jo;III[[ZZ)V", line = 268)
	void method13420(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface38_2 == null || (this.anInt1485 > arg1 + arg3 || (this.anInt1487 < arg1 - arg3 || (this.anInt1482 > arg2 + arg3 || this.anInt1483 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1485; local36 <= this.anInt1487; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1482; local54 <= this.anInt1483; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method13421(arg0, this.anInterface38_2, this.anInt1486 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass86_Sub1_27.aByteBuffer7;
		local104.clear();
		@Pc(110) int local110 = this.anInt1482;
		while (true) {
			if (local110 > this.anInt1483) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface38 local212 = this.aClass86_Sub1_27.method20454(local110 / 2);
				local212.method28755(0, local110, this.aClass86_Sub1_27.aLong121);
				this.method13421(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass88_Sub2_2.anInt607 * -1924295585 + this.anInt1485;
				for (@Pc(139) int local139 = this.anInt1485; local139 <= this.anInt1487; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass88_Sub2_2.aShortArrayArray2[local136];
						if (local174 != null) {
							for (@Pc(178) int local178 = 0; local178 < local174.length; local178++) {
								local104.putShort(local174[local178]);
								local36++;
							}
						}
					}
					local136++;
				}
			}
			local110++;
		}
	}

	@OriginalMember(owner = "client!ajn", name = "l", descriptor = "(Lclient!jo;Lclient!lc;I)V", line = 315)
	void method13421(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Interface38 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1089 = 0;
		arg0.anInt1087 = this.anInt1484;
		arg0.anInt1090 = 0;
		arg0.anInt1091 = this.anInt1486 / 3;
		arg0.anInterface37_18 = this.aClass86_Sub1_27.anInterface37_23;
		@Pc(25) float local25 = this.aClass77_Sub22_2.method13561();
		arg0.aClass447_37.method29133(local25, local25, local25);
		this.aClass86_Sub1_27.method20670(0, this.anInterface36_11);
		this.aClass86_Sub1_27.method20658(this.aClass86_Sub1_27.aClass113_22);
		this.aClass86_Sub1_27.method20659(this.anInterface38_2);
		arg0.method9103(0);
	}

	@OriginalMember(owner = "client!ajn", name = "x", descriptor = "(Lclient!jo;Lclient!lc;I)V", line = 315)
	void method13422(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Interface38 arg1) {
		arg0.anInt1089 = 0;
		arg0.anInt1087 = this.anInt1484;
		arg0.anInt1090 = 0;
		arg0.anInt1091 = this.anInt1486 / 3;
		arg0.anInterface37_18 = this.aClass86_Sub1_27.anInterface37_23;
		@Pc(25) float local25 = this.aClass77_Sub22_2.method13561();
		arg0.aClass447_37.method29133(local25, local25, local25);
		this.aClass86_Sub1_27.method20670(0, this.anInterface36_11);
		this.aClass86_Sub1_27.method20658(this.aClass86_Sub1_27.aClass113_22);
		this.aClass86_Sub1_27.method20659(this.anInterface38_2);
		arg0.method9103(0);
	}

	@OriginalMember(owner = "client!ajn", name = "d", descriptor = "(Lclient!jo;Lclient!lc;I)V", line = 315)
	void method13423(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Interface38 arg1) {
		arg0.anInt1089 = 0;
		arg0.anInt1087 = this.anInt1484;
		arg0.anInt1090 = 0;
		arg0.anInt1091 = this.anInt1486 / 3;
		arg0.anInterface37_18 = this.aClass86_Sub1_27.anInterface37_23;
		@Pc(25) float local25 = this.aClass77_Sub22_2.method13561();
		arg0.aClass447_37.method29133(local25, local25, local25);
		this.aClass86_Sub1_27.method20670(0, this.anInterface36_11);
		this.aClass86_Sub1_27.method20658(this.aClass86_Sub1_27.aClass113_22);
		this.aClass86_Sub1_27.method20659(this.anInterface38_2);
		arg0.method9103(0);
	}
}
