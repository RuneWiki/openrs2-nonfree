package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!aga")
public class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
	int anInt1252 = 0;

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
	int anInt1255 = 0;

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
	int anInt1250 = 0;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_26;

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "Lclient!afz;")
	final Class3_Sub15 aClass3_Sub15_2;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "Lclient!abs;")
	final Class17_Sub3 aClass17_Sub3_1;

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
	int anInt1251;

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "I")
	int anInt1256;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
	int anInt1253;

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
	int anInt1254;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "[[F")
	float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "[[F")
	float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "Lclient!xn;")
	Class581 aClass581_8;

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "Lclient!if;")
	Interface21 anInterface21_10;

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "Lclient!jw;")
	Interface30 anInterface30_2;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!abv;Lclient!abs;Lclient!afz;[I)V", line = 30)
	Class3_Sub16(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class17_Sub3 arg1, @OriginalArg(2) Class3_Sub15 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass21_Sub3_26 = arg0;
		this.aClass3_Sub15_2 = arg2;
		this.aClass17_Sub3_1 = arg1;
		@Pc(31) int local31 = this.aClass3_Sub15_2.method11291() - (arg1.anInt338 * 76934957 >> 1);
		this.anInt1251 = this.aClass3_Sub15_2.method11280() - local31 >> arg1.anInt336 * 1371852633;
		this.anInt1256 = this.aClass3_Sub15_2.method11280() + local31 >> arg1.anInt336 * 1371852633;
		this.anInt1253 = this.aClass3_Sub15_2.method11282() - local31 >> arg1.anInt336 * 1371852633;
		this.anInt1254 = this.aClass3_Sub15_2.method11282() + local31 >> arg1.anInt336 * 1371852633;
		@Pc(91) int local91 = this.anInt1256 - this.anInt1251 + 1;
		@Pc(99) int local99 = this.anInt1254 - this.anInt1253 + 1;
		this.aFloatArrayArray18 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray17 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray16 = new float[local91 + 1][local99 + 1];
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(149) int local149;
		@Pc(157) int local157;
		@Pc(184) int local184;
		@Pc(200) int local200;
		for (local128 = 0; local128 <= local99; local128++) {
			local136 = local128 + this.anInt1253;
			if (local136 > 0 && local136 < this.aClass17_Sub3_1.anInt337 * -207323189 - 1) {
				for (local149 = 0; local149 <= local91; local149++) {
					local157 = local149 + this.anInt1251;
					if (local157 > 0 && local157 < this.aClass17_Sub3_1.anInt339 * -1007974723 - 1) {
						local184 = arg1.method3548(local157 + 1, local136) - arg1.method3548(local157 - 1, local136);
						local200 = arg1.method3548(local157, local136 + 1) - arg1.method3548(local157, local136 - 1);
						@Pc(215) float local215 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + 65536 + local200 * local200)));
						this.aFloatArrayArray18[local149][local128] = (float) local184 * local215;
						this.aFloatArrayArray17[local149][local128] = -256.0F * local215;
						this.aFloatArrayArray16[local149][local128] = (float) local200 * local215;
					}
				}
			}
		}
		local128 = 0;
		for (local136 = this.anInt1253; local136 <= this.anInt1254; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt337 * -207323189) {
				for (local149 = this.anInt1251; local149 <= this.anInt1256; local149++) {
					if (local149 >= 0 && local149 < arg1.anInt339 * -1007974723) {
						local157 = arg3[local128];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray7[local149][local136];
						if (local291 != null && local157 != 0) {
							if (local157 == 1) {
								for (local200 = 0; local200 < local291.length; local200 += 3) {
									if (local291[local200] != -1 && local291[local200 + 1] != -1 && local291[local200 + 2] != -1) {
										this.anInt1255 += 3;
									}
								}
							} else {
								this.anInt1255 += 3;
							}
						}
					}
					local128++;
				}
			} else {
				local128 += this.anInt1256 - this.anInt1251;
			}
		}
		if (this.anInt1255 > 0) {
			this.aClass581_8 = new Class581(Class302.method25670(this.anInt1255));
			this.aByteBuffer2 = this.aClass21_Sub3_26.aByteBuffer4;
			this.aByteBuffer2.clear();
			this.aByteBuffer2.position(2097152);
			this.aByteBuffer2.slice();
			this.aByteBuffer2.position(0);
			this.aByteBuffer2.limit(2097152);
			local136 = 0;
			local128 = 0;
			for (local149 = this.anInt1253; local149 <= this.anInt1254; local149++) {
				if (local149 >= 0 && local149 < arg1.anInt337 * -207323189) {
					local157 = 0;
					for (local184 = this.anInt1251; local184 <= this.anInt1256; local184++) {
						if (local184 >= 0 && local184 < arg1.anInt339 * -1007974723) {
							local200 = arg3[local128];
							@Pc(439) int[] local439 = arg1.anIntArrayArrayArray7[local184][local149];
							if (local439 != null && local200 != 0) {
								if (local200 == 1) {
									@Pc(453) int[] local453 = arg1.anIntArrayArrayArray9[local184][local149];
									@Pc(460) int[] local460 = arg1.anIntArrayArrayArray12[local184][local149];
									@Pc(462) int local462 = 0;
									label110: while (true) {
										while (true) {
											if (local462 >= local439.length) {
												break label110;
											}
											if (local439[local462] == -1 || local439[local462 + 1] == -1 || local439[local462 + 2] == -1) {
												local462 += 3;
											} else {
												this.method11314(local157, local136, local184, local149, local453[local462], local460[local462]);
												local462++;
												this.method11314(local157, local136, local184, local149, local453[local462], local460[local462]);
												local462++;
												this.method11314(local157, local136, local184, local149, local453[local462], local460[local462]);
												local462++;
											}
										}
									}
								} else if (local200 == 3) {
									this.method11314(local157, local136, local184, local149, 0, 0);
									this.method11314(local157, local136, local184, local149, arg1.anInt338 * 76934957, 0);
									this.method11314(local157, local136, local184, local149, 0, arg1.anInt338 * 76934957);
								} else if (local200 == 2) {
									this.method11314(local157, local136, local184, local149, arg1.anInt338 * 76934957, 0);
									this.method11314(local157, local136, local184, local149, arg1.anInt338 * 76934957, arg1.anInt338 * 76934957);
									this.method11314(local157, local136, local184, local149, 0, 0);
								} else if (local200 == 5) {
									this.method11314(local157, local136, local184, local149, arg1.anInt338 * 76934957, arg1.anInt338 * 76934957);
									this.method11314(local157, local136, local184, local149, 0, arg1.anInt338 * 76934957);
									this.method11314(local157, local136, local184, local149, arg1.anInt338 * 76934957, 0);
								} else if (local200 == 4) {
									this.method11314(local157, local136, local184, local149, 0, arg1.anInt338 * 76934957);
									this.method11314(local157, local136, local184, local149, 0, 0);
									this.method11314(local157, local136, local184, local149, arg1.anInt338 * 76934957, arg1.anInt338 * 76934957);
								}
							}
						}
						local128++;
						local157++;
					}
				} else {
					local128 += this.anInt1256 - this.anInt1251;
				}
				local136++;
			}
			this.method11313();
		} else {
			this.anInterface21_10 = null;
			this.anInterface30_2 = null;
		}
		this.aClass581_8 = null;
		this.aFloatArrayArray16 = null;
		this.aFloatArrayArray17 = null;
		this.aFloatArrayArray18 = null;
	}

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "()V", line = 158)
	void method11313() {
		this.anInterface30_2 = this.aClass21_Sub3_26.method17648(false);
		this.anInterface30_2.method25720(this.anInt1250);
		this.anInterface21_10 = this.aClass21_Sub3_26.method17542(false);
		this.anInterface21_10.method25687(this.anInt1252 * 16, 16);
		this.anInterface21_10.method25705(0, this.anInt1252 * 16, this.aClass21_Sub3_26.aLong101);
		this.anInterface30_2.method25705(0, this.anInt1250 * 2, this.aClass21_Sub3_26.aLong101 + 2097152L);
	}

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "()V", line = 158)
	void method11318() {
		this.anInterface30_2 = this.aClass21_Sub3_26.method17648(false);
		this.anInterface30_2.method25720(this.anInt1250);
		this.anInterface21_10 = this.aClass21_Sub3_26.method17542(false);
		this.anInterface21_10.method25687(this.anInt1252 * 16, 16);
		this.anInterface21_10.method25705(0, this.anInt1252 * 16, this.aClass21_Sub3_26.aLong101);
		this.anInterface30_2.method25705(0, this.anInt1250 * 2, this.aClass21_Sub3_26.aLong101 + 2097152L);
	}

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "()V", line = 158)
	void method11319() {
		this.anInterface30_2 = this.aClass21_Sub3_26.method17648(false);
		this.anInterface30_2.method25720(this.anInt1250);
		this.anInterface21_10 = this.aClass21_Sub3_26.method17542(false);
		this.anInterface21_10.method25687(this.anInt1252 * 16, 16);
		this.anInterface21_10.method25705(0, this.anInt1252 * 16, this.aClass21_Sub3_26.aLong101);
		this.anInterface30_2.method25705(0, this.anInt1250 * 2, this.aClass21_Sub3_26.aLong101 + 2097152L);
	}

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "()V", line = 158)
	void method11320() {
		this.anInterface30_2 = this.aClass21_Sub3_26.method17648(false);
		this.anInterface30_2.method25720(this.anInt1250);
		this.anInterface21_10 = this.aClass21_Sub3_26.method17542(false);
		this.anInterface21_10.method25687(this.anInt1252 * 16, 16);
		this.anInterface21_10.method25705(0, this.anInt1252 * 16, this.aClass21_Sub3_26.aLong101);
		this.anInterface30_2.method25705(0, this.anInt1250 * 2, this.aClass21_Sub3_26.aLong101 + 2097152L);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIII)V", line = 167)
	void method11314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub3_1.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class3 local53 = this.aClass581_8.method33217(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass21_Sub3_26.anUnsafe3;
				local59.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), ((Class3_Sub34) local53).aShort63);
				this.anInt1250++;
				return;
			}
		}
		@Pc(86) short local86 = (short) this.anInt1252;
		if (local1 != -1L) {
			this.aClass581_8.method33241(new Class3_Sub34(local86), local1);
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(256) float local256;
		@Pc(266) float local266;
		@Pc(273) float local273;
		@Pc(280) float local280;
		@Pc(287) float local287;
		@Pc(296) float local296;
		@Pc(305) float local305;
		@Pc(314) float local314;
		if (arg4 == 0 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0][arg1];
			local116 = this.aFloatArrayArray17[arg0][arg1];
			local123 = this.aFloatArrayArray16[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0][arg1 + 1];
		} else {
			local256 = (float) arg4 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local266 = (float) arg5 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local273 = this.aFloatArrayArray18[arg0][arg1];
			local280 = this.aFloatArrayArray17[arg0][arg1];
			local287 = this.aFloatArrayArray16[arg0][arg1];
			local296 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local305 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local314 = this.aFloatArrayArray16[arg0 + 1][arg1];
			@Pc(329) float local329 = local273 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local273) * local256;
			@Pc(344) float local344 = local280 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local280) * local256;
			@Pc(359) float local359 = local287 + (this.aFloatArrayArray16[arg0][arg1 + 1] - local287) * local256;
			@Pc(376) float local376 = local296 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local296) * local256;
			@Pc(393) float local393 = local305 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local305) * local256;
			@Pc(410) float local410 = local314 + (this.aFloatArrayArray16[arg0 + 1][arg1 + 1] - local314) * local256;
			local109 = local329 + (local376 - local329) * local266;
			local116 = local344 + (local393 - local344) * local266;
			local123 = local359 + (local410 - local359) * local266;
		}
		local256 = this.aClass3_Sub15_2.method11280() - local11;
		local266 = this.aClass3_Sub15_2.method11281() - local28;
		local273 = this.aClass3_Sub15_2.method11282() - local21;
		local280 = (float) Math.sqrt((double) (local256 * local256 + local266 * local266 + local273 * local273));
		local287 = 1.0F / local280;
		local256 *= local287;
		local266 *= local287;
		local273 *= local287;
		local296 = local280 / (float) this.aClass3_Sub15_2.method11291();
		local305 = 1.0F - local296 * local296;
		if (local305 < 0.0F) {
			local305 = 0.0F;
		}
		local314 = local256 * local109 + local266 * local116 + local273 * local123;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(533) float local533 = local314 * local305 * 2.0F;
		if (local533 > 1.0F) {
			local533 = 1.0F;
		}
		@Pc(544) int local544 = this.aClass3_Sub15_2.method11279();
		@Pc(554) int local554 = (int) (local533 * (float) (local544 >> 16 & 0xFF));
		if (local554 > 255) {
			local554 = 255;
		}
		@Pc(569) int local569 = (int) (local533 * (float) (local544 >> 8 & 0xFF));
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(582) int local582 = (int) (local533 * (float) (local544 & 0xFF));
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(591) Unsafe local591 = this.aClass21_Sub3_26.anUnsafe3;
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16), (float) local11);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 4L, (float) local28);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 8L, (float) local21);
		if (this.aClass21_Sub3_26.anInt2502 == 0) {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local582);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local554);
		} else {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local554);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local582);
		}
		local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 15L, (byte) -1);
		this.anInt1252++;
		local591.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), local86);
		this.anInt1250++;
	}

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "(IIIIII)V", line = 167)
	void method11315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub3_1.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class3 local53 = this.aClass581_8.method33217(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass21_Sub3_26.anUnsafe3;
				local59.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), ((Class3_Sub34) local53).aShort63);
				this.anInt1250++;
				return;
			}
		}
		@Pc(86) short local86 = (short) this.anInt1252;
		if (local1 != -1L) {
			this.aClass581_8.method33241(new Class3_Sub34(local86), local1);
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(256) float local256;
		@Pc(266) float local266;
		@Pc(273) float local273;
		@Pc(280) float local280;
		@Pc(287) float local287;
		@Pc(296) float local296;
		@Pc(305) float local305;
		@Pc(314) float local314;
		if (arg4 == 0 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0][arg1];
			local116 = this.aFloatArrayArray17[arg0][arg1];
			local123 = this.aFloatArrayArray16[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0][arg1 + 1];
		} else {
			local256 = (float) arg4 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local266 = (float) arg5 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local273 = this.aFloatArrayArray18[arg0][arg1];
			local280 = this.aFloatArrayArray17[arg0][arg1];
			local287 = this.aFloatArrayArray16[arg0][arg1];
			local296 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local305 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local314 = this.aFloatArrayArray16[arg0 + 1][arg1];
			@Pc(329) float local329 = local273 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local273) * local256;
			@Pc(344) float local344 = local280 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local280) * local256;
			@Pc(359) float local359 = local287 + (this.aFloatArrayArray16[arg0][arg1 + 1] - local287) * local256;
			@Pc(376) float local376 = local296 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local296) * local256;
			@Pc(393) float local393 = local305 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local305) * local256;
			@Pc(410) float local410 = local314 + (this.aFloatArrayArray16[arg0 + 1][arg1 + 1] - local314) * local256;
			local109 = local329 + (local376 - local329) * local266;
			local116 = local344 + (local393 - local344) * local266;
			local123 = local359 + (local410 - local359) * local266;
		}
		local256 = this.aClass3_Sub15_2.method11280() - local11;
		local266 = this.aClass3_Sub15_2.method11281() - local28;
		local273 = this.aClass3_Sub15_2.method11282() - local21;
		local280 = (float) Math.sqrt((double) (local256 * local256 + local266 * local266 + local273 * local273));
		local287 = 1.0F / local280;
		local256 *= local287;
		local266 *= local287;
		local273 *= local287;
		local296 = local280 / (float) this.aClass3_Sub15_2.method11291();
		local305 = 1.0F - local296 * local296;
		if (local305 < 0.0F) {
			local305 = 0.0F;
		}
		local314 = local256 * local109 + local266 * local116 + local273 * local123;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(533) float local533 = local314 * local305 * 2.0F;
		if (local533 > 1.0F) {
			local533 = 1.0F;
		}
		@Pc(544) int local544 = this.aClass3_Sub15_2.method11279();
		@Pc(554) int local554 = (int) (local533 * (float) (local544 >> 16 & 0xFF));
		if (local554 > 255) {
			local554 = 255;
		}
		@Pc(569) int local569 = (int) (local533 * (float) (local544 >> 8 & 0xFF));
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(582) int local582 = (int) (local533 * (float) (local544 & 0xFF));
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(591) Unsafe local591 = this.aClass21_Sub3_26.anUnsafe3;
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16), (float) local11);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 4L, (float) local28);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 8L, (float) local21);
		if (this.aClass21_Sub3_26.anInt2502 == 0) {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local582);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local554);
		} else {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local554);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local582);
		}
		local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 15L, (byte) -1);
		this.anInt1252++;
		local591.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), local86);
		this.anInt1250++;
	}

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "(IIIIII)V", line = 167)
	void method11321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub3_1.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class3 local53 = this.aClass581_8.method33217(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass21_Sub3_26.anUnsafe3;
				local59.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), ((Class3_Sub34) local53).aShort63);
				this.anInt1250++;
				return;
			}
		}
		@Pc(86) short local86 = (short) this.anInt1252;
		if (local1 != -1L) {
			this.aClass581_8.method33241(new Class3_Sub34(local86), local1);
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(256) float local256;
		@Pc(266) float local266;
		@Pc(273) float local273;
		@Pc(280) float local280;
		@Pc(287) float local287;
		@Pc(296) float local296;
		@Pc(305) float local305;
		@Pc(314) float local314;
		if (arg4 == 0 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0][arg1];
			local116 = this.aFloatArrayArray17[arg0][arg1];
			local123 = this.aFloatArrayArray16[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0][arg1 + 1];
		} else {
			local256 = (float) arg4 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local266 = (float) arg5 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local273 = this.aFloatArrayArray18[arg0][arg1];
			local280 = this.aFloatArrayArray17[arg0][arg1];
			local287 = this.aFloatArrayArray16[arg0][arg1];
			local296 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local305 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local314 = this.aFloatArrayArray16[arg0 + 1][arg1];
			@Pc(329) float local329 = local273 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local273) * local256;
			@Pc(344) float local344 = local280 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local280) * local256;
			@Pc(359) float local359 = local287 + (this.aFloatArrayArray16[arg0][arg1 + 1] - local287) * local256;
			@Pc(376) float local376 = local296 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local296) * local256;
			@Pc(393) float local393 = local305 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local305) * local256;
			@Pc(410) float local410 = local314 + (this.aFloatArrayArray16[arg0 + 1][arg1 + 1] - local314) * local256;
			local109 = local329 + (local376 - local329) * local266;
			local116 = local344 + (local393 - local344) * local266;
			local123 = local359 + (local410 - local359) * local266;
		}
		local256 = this.aClass3_Sub15_2.method11280() - local11;
		local266 = this.aClass3_Sub15_2.method11281() - local28;
		local273 = this.aClass3_Sub15_2.method11282() - local21;
		local280 = (float) Math.sqrt((double) (local256 * local256 + local266 * local266 + local273 * local273));
		local287 = 1.0F / local280;
		local256 *= local287;
		local266 *= local287;
		local273 *= local287;
		local296 = local280 / (float) this.aClass3_Sub15_2.method11291();
		local305 = 1.0F - local296 * local296;
		if (local305 < 0.0F) {
			local305 = 0.0F;
		}
		local314 = local256 * local109 + local266 * local116 + local273 * local123;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(533) float local533 = local314 * local305 * 2.0F;
		if (local533 > 1.0F) {
			local533 = 1.0F;
		}
		@Pc(544) int local544 = this.aClass3_Sub15_2.method11279();
		@Pc(554) int local554 = (int) (local533 * (float) (local544 >> 16 & 0xFF));
		if (local554 > 255) {
			local554 = 255;
		}
		@Pc(569) int local569 = (int) (local533 * (float) (local544 >> 8 & 0xFF));
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(582) int local582 = (int) (local533 * (float) (local544 & 0xFF));
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(591) Unsafe local591 = this.aClass21_Sub3_26.anUnsafe3;
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16), (float) local11);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 4L, (float) local28);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 8L, (float) local21);
		if (this.aClass21_Sub3_26.anInt2502 == 0) {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local582);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local554);
		} else {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local554);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local582);
		}
		local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 15L, (byte) -1);
		this.anInt1252++;
		local591.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), local86);
		this.anInt1250++;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(IIIIII)V", line = 167)
	void method11322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub3_1.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub3_1.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class3 local53 = this.aClass581_8.method33217(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass21_Sub3_26.anUnsafe3;
				local59.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), ((Class3_Sub34) local53).aShort63);
				this.anInt1250++;
				return;
			}
		}
		@Pc(86) short local86 = (short) this.anInt1252;
		if (local1 != -1L) {
			this.aClass581_8.method33241(new Class3_Sub34(local86), local1);
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(256) float local256;
		@Pc(266) float local266;
		@Pc(273) float local273;
		@Pc(280) float local280;
		@Pc(287) float local287;
		@Pc(296) float local296;
		@Pc(305) float local305;
		@Pc(314) float local314;
		if (arg4 == 0 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0][arg1];
			local116 = this.aFloatArrayArray17[arg0][arg1];
			local123 = this.aFloatArrayArray16[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == 0) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub3_1.anInt338 * 76934957 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub3_1.anInt338 * 76934957) {
			local109 = this.aFloatArrayArray18[arg0][arg1 + 1];
			local116 = this.aFloatArrayArray17[arg0][arg1 + 1];
			local123 = this.aFloatArrayArray16[arg0][arg1 + 1];
		} else {
			local256 = (float) arg4 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local266 = (float) arg5 / (float) (this.aClass17_Sub3_1.anInt338 * 76934957);
			local273 = this.aFloatArrayArray18[arg0][arg1];
			local280 = this.aFloatArrayArray17[arg0][arg1];
			local287 = this.aFloatArrayArray16[arg0][arg1];
			local296 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local305 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local314 = this.aFloatArrayArray16[arg0 + 1][arg1];
			@Pc(329) float local329 = local273 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local273) * local256;
			@Pc(344) float local344 = local280 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local280) * local256;
			@Pc(359) float local359 = local287 + (this.aFloatArrayArray16[arg0][arg1 + 1] - local287) * local256;
			@Pc(376) float local376 = local296 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local296) * local256;
			@Pc(393) float local393 = local305 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local305) * local256;
			@Pc(410) float local410 = local314 + (this.aFloatArrayArray16[arg0 + 1][arg1 + 1] - local314) * local256;
			local109 = local329 + (local376 - local329) * local266;
			local116 = local344 + (local393 - local344) * local266;
			local123 = local359 + (local410 - local359) * local266;
		}
		local256 = this.aClass3_Sub15_2.method11280() - local11;
		local266 = this.aClass3_Sub15_2.method11281() - local28;
		local273 = this.aClass3_Sub15_2.method11282() - local21;
		local280 = (float) Math.sqrt((double) (local256 * local256 + local266 * local266 + local273 * local273));
		local287 = 1.0F / local280;
		local256 *= local287;
		local266 *= local287;
		local273 *= local287;
		local296 = local280 / (float) this.aClass3_Sub15_2.method11291();
		local305 = 1.0F - local296 * local296;
		if (local305 < 0.0F) {
			local305 = 0.0F;
		}
		local314 = local256 * local109 + local266 * local116 + local273 * local123;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(533) float local533 = local314 * local305 * 2.0F;
		if (local533 > 1.0F) {
			local533 = 1.0F;
		}
		@Pc(544) int local544 = this.aClass3_Sub15_2.method11279();
		@Pc(554) int local554 = (int) (local533 * (float) (local544 >> 16 & 0xFF));
		if (local554 > 255) {
			local554 = 255;
		}
		@Pc(569) int local569 = (int) (local533 * (float) (local544 >> 8 & 0xFF));
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(582) int local582 = (int) (local533 * (float) (local544 & 0xFF));
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(591) Unsafe local591 = this.aClass21_Sub3_26.anUnsafe3;
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16), (float) local11);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 4L, (float) local28);
		local591.putFloat(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 8L, (float) local21);
		if (this.aClass21_Sub3_26.anInt2502 == 0) {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local582);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local554);
		} else {
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 12L, (byte) local554);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 13L, (byte) local569);
			local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 14L, (byte) local582);
		}
		local591.putByte(this.aClass21_Sub3_26.aLong101 + (long) (this.anInt1252 * 16) + 15L, (byte) -1);
		this.anInt1252++;
		local591.putShort(this.aClass21_Sub3_26.aLong101 + 2097152L + (long) (this.anInt1250 * 2), local86);
		this.anInt1250++;
	}

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "(Lclient!hn;III[[ZZ)V", line = 268)
	void method11316(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface30_2 == null || (this.anInt1251 > arg1 + arg3 || (this.anInt1256 < arg1 - arg3 || (this.anInt1253 > arg2 + arg3 || this.anInt1254 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1251; local36 <= this.anInt1256; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1253; local54 <= this.anInt1254; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method11317(arg0, this.anInterface30_2, this.anInt1250 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass21_Sub3_26.aByteBuffer4;
		local104.clear();
		@Pc(110) int local110 = this.anInt1253;
		while (true) {
			if (local110 > this.anInt1254) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface30 local212 = this.aClass21_Sub3_26.method17464(local110 / 2);
				local212.method25705(0, local110, this.aClass21_Sub3_26.aLong101);
				this.method11317(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass17_Sub3_1.anInt339 * -1007974723 + this.anInt1251;
				for (@Pc(139) int local139 = this.anInt1251; local139 <= this.anInt1256; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass17_Sub3_1.aShortArrayArray2[local136];
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

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(Lclient!hn;III[[ZZ)V", line = 268)
	void method11323(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface30_2 == null || (this.anInt1251 > arg1 + arg3 || (this.anInt1256 < arg1 - arg3 || (this.anInt1253 > arg2 + arg3 || this.anInt1254 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1251; local36 <= this.anInt1256; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1253; local54 <= this.anInt1254; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method11317(arg0, this.anInterface30_2, this.anInt1250 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass21_Sub3_26.aByteBuffer4;
		local104.clear();
		@Pc(110) int local110 = this.anInt1253;
		while (true) {
			if (local110 > this.anInt1254) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface30 local212 = this.aClass21_Sub3_26.method17464(local110 / 2);
				local212.method25705(0, local110, this.aClass21_Sub3_26.aLong101);
				this.method11317(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass17_Sub3_1.anInt339 * -1007974723 + this.anInt1251;
				for (@Pc(139) int local139 = this.anInt1251; local139 <= this.anInt1256; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass17_Sub3_1.aShortArrayArray2[local136];
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

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "(Lclient!hn;III[[ZZ)V", line = 268)
	void method11324(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface30_2 == null || (this.anInt1251 > arg1 + arg3 || (this.anInt1256 < arg1 - arg3 || (this.anInt1253 > arg2 + arg3 || this.anInt1254 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1251; local36 <= this.anInt1256; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1253; local54 <= this.anInt1254; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method11317(arg0, this.anInterface30_2, this.anInt1250 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass21_Sub3_26.aByteBuffer4;
		local104.clear();
		@Pc(110) int local110 = this.anInt1253;
		while (true) {
			if (local110 > this.anInt1254) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface30 local212 = this.aClass21_Sub3_26.method17464(local110 / 2);
				local212.method25705(0, local110, this.aClass21_Sub3_26.aLong101);
				this.method11317(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass17_Sub3_1.anInt339 * -1007974723 + this.anInt1251;
				for (@Pc(139) int local139 = this.anInt1251; local139 <= this.anInt1256; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass17_Sub3_1.aShortArrayArray2[local136];
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

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "(Lclient!hn;Lclient!jw;I)V", line = 315)
	void method11317(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt842 = 0;
		arg0.anInt841 = this.anInt1252;
		arg0.anInt843 = 0;
		arg0.anInt844 = this.anInt1250 / 3;
		arg0.anInterface20_14 = this.aClass21_Sub3_26.anInterface20_23;
		@Pc(25) float local25 = this.aClass3_Sub15_2.method11300();
		arg0.aClass320_37.method25863(local25, local25, local25);
		this.aClass21_Sub3_26.method17544(0, this.anInterface21_10);
		this.aClass21_Sub3_26.method17738(this.aClass21_Sub3_26.aClass37_22);
		this.aClass21_Sub3_26.method17545(this.anInterface30_2);
		arg0.method7784(0);
	}

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "(Lclient!hn;Lclient!jw;I)V", line = 315)
	void method11325(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1) {
		arg0.anInt842 = 0;
		arg0.anInt841 = this.anInt1252;
		arg0.anInt843 = 0;
		arg0.anInt844 = this.anInt1250 / 3;
		arg0.anInterface20_14 = this.aClass21_Sub3_26.anInterface20_23;
		@Pc(25) float local25 = this.aClass3_Sub15_2.method11300();
		arg0.aClass320_37.method25863(local25, local25, local25);
		this.aClass21_Sub3_26.method17544(0, this.anInterface21_10);
		this.aClass21_Sub3_26.method17738(this.aClass21_Sub3_26.aClass37_22);
		this.aClass21_Sub3_26.method17545(this.anInterface30_2);
		arg0.method7784(0);
	}

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "(Lclient!hn;Lclient!jw;I)V", line = 315)
	void method11326(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1) {
		arg0.anInt842 = 0;
		arg0.anInt841 = this.anInt1252;
		arg0.anInt843 = 0;
		arg0.anInt844 = this.anInt1250 / 3;
		arg0.anInterface20_14 = this.aClass21_Sub3_26.anInterface20_23;
		@Pc(25) float local25 = this.aClass3_Sub15_2.method11300();
		arg0.aClass320_37.method25863(local25, local25, local25);
		this.aClass21_Sub3_26.method17544(0, this.anInterface21_10);
		this.aClass21_Sub3_26.method17738(this.aClass21_Sub3_26.aClass37_22);
		this.aClass21_Sub3_26.method17545(this.anInterface30_2);
		arg0.method7784(0);
	}

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "(Lclient!hn;Lclient!jw;I)V", line = 315)
	void method11327(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1) {
		arg0.anInt842 = 0;
		arg0.anInt841 = this.anInt1252;
		arg0.anInt843 = 0;
		arg0.anInt844 = this.anInt1250 / 3;
		arg0.anInterface20_14 = this.aClass21_Sub3_26.anInterface20_23;
		@Pc(25) float local25 = this.aClass3_Sub15_2.method11300();
		arg0.aClass320_37.method25863(local25, local25, local25);
		this.aClass21_Sub3_26.method17544(0, this.anInterface21_10);
		this.aClass21_Sub3_26.method17738(this.aClass21_Sub3_26.aClass37_22);
		this.aClass21_Sub3_26.method17545(this.anInterface30_2);
		arg0.method7784(0);
	}
}
