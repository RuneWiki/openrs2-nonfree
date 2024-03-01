package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public class Class171 {

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	int anInt3459;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
	int[] anIntArray358;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	int anInt3461;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
	int[] anIntArray359;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "[[F")
	float[][] aFloatArrayArray23;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "[I")
	int[] anIntArray360;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
	int anInt3462 = 0;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
	int anInt3460 = 0;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 17)
	Class171() {
	}

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "(II)I", line = 20)
	static int method23363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(44) int local44;
			if (local14 == 1) {
				local44 = local16 * local12;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "(II)I", line = 20)
	static int method23368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(44) int local44;
			if (local14 == 1) {
				local44 = local16 * local12;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "(II)I", line = 20)
	static int method23371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(44) int local44;
			if (local14 == 1) {
				local44 = local16 * local12;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "(II)I", line = 20)
	static int method23377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			@Pc(12) int local12 = local10;
			@Pc(14) int local14 = arg1;
			@Pc(16) int local16 = 1;
			while (local14 > 1) {
				if ((local14 & 0x1) != 0) {
					local16 *= local12;
				}
				local12 *= local12;
				local14 >>= 0x1;
			}
			@Pc(44) int local44;
			if (local14 == 1) {
				local44 = local16 * local12;
			} else {
				local44 = local16;
			}
			if (local44 <= arg0) {
				return local10;
			}
			local10--;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!fu;)V", line = 45)
	void method23365(@OriginalArg(0) Class184 arg0) {
		arg0.method23812(this.anInt3462 * 8 + this.anInt3460);
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(Lclient!fu;)V", line = 49)
	void method23366(@OriginalArg(0) Class184 arg0) {
		@Pc(2) int local2 = arg0.method23815();
		@Pc(5) int local5 = arg0.method23814();
		arg0.method23812(24);
		this.anInt3459 = arg0.method23812(16);
		this.anInt3461 = arg0.method23812(24);
		if (this.anIntArray358 == null || this.anIntArray358.length != this.anInt3461) {
			this.anIntArray358 = new int[this.anInt3461];
		}
		@Pc(40) boolean local40 = arg0.method23817() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method23812(5) + 1;
			while (local44 < this.anInt3461) {
				@Pc(63) int local63 = arg0.method23812(Class356.method26652(this.anInt3461 - local44));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray358[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method23817() != 0;
			for (local50 = 0; local50 < this.anInt3461; local50++) {
				if (local86 && arg0.method23817() == 0) {
					this.anIntArray358[local50] = 0;
				} else {
					this.anIntArray358[local50] = arg0.method23812(5) + 1;
				}
			}
		}
		this.method23367();
		local44 = arg0.method23812(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method23813(arg0.method23812(32));
			@Pc(134) float local134 = arg0.method23813(arg0.method23812(32));
			local65 = arg0.method23812(4) + 1;
			@Pc(147) boolean local147 = arg0.method23817() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method23368(this.anInt3461, this.anInt3459);
			} else {
				local156 = this.anInt3461 * this.anInt3459;
			}
			this.anIntArray359 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray359[local169] = arg0.method23812(local65);
			}
			this.aFloatArrayArray23 = new float[this.anInt3461][this.anInt3459];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray359[local213] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt3459;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray359[local201] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt3460 = arg0.method23815() - local2;
		this.anInt3462 = arg0.method23814() - local5;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Lclient!fu;)V", line = 49)
	void method23374(@OriginalArg(0) Class184 arg0) {
		@Pc(2) int local2 = arg0.method23815();
		@Pc(5) int local5 = arg0.method23814();
		arg0.method23812(24);
		this.anInt3459 = arg0.method23812(16);
		this.anInt3461 = arg0.method23812(24);
		if (this.anIntArray358 == null || this.anIntArray358.length != this.anInt3461) {
			this.anIntArray358 = new int[this.anInt3461];
		}
		@Pc(40) boolean local40 = arg0.method23817() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method23812(5) + 1;
			while (local44 < this.anInt3461) {
				@Pc(63) int local63 = arg0.method23812(Class356.method26652(this.anInt3461 - local44));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray358[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method23817() != 0;
			for (local50 = 0; local50 < this.anInt3461; local50++) {
				if (local86 && arg0.method23817() == 0) {
					this.anIntArray358[local50] = 0;
				} else {
					this.anIntArray358[local50] = arg0.method23812(5) + 1;
				}
			}
		}
		this.method23367();
		local44 = arg0.method23812(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method23813(arg0.method23812(32));
			@Pc(134) float local134 = arg0.method23813(arg0.method23812(32));
			local65 = arg0.method23812(4) + 1;
			@Pc(147) boolean local147 = arg0.method23817() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method23368(this.anInt3461, this.anInt3459);
			} else {
				local156 = this.anInt3461 * this.anInt3459;
			}
			this.anIntArray359 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray359[local169] = arg0.method23812(local65);
			}
			this.aFloatArrayArray23 = new float[this.anInt3461][this.anInt3459];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray359[local213] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt3459;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray359[local201] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt3460 = arg0.method23815() - local2;
		this.anInt3462 = arg0.method23814() - local5;
	}

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "(Lclient!fu;)V", line = 49)
	void method23375(@OriginalArg(0) Class184 arg0) {
		@Pc(2) int local2 = arg0.method23815();
		@Pc(5) int local5 = arg0.method23814();
		arg0.method23812(24);
		this.anInt3459 = arg0.method23812(16);
		this.anInt3461 = arg0.method23812(24);
		if (this.anIntArray358 == null || this.anIntArray358.length != this.anInt3461) {
			this.anIntArray358 = new int[this.anInt3461];
		}
		@Pc(40) boolean local40 = arg0.method23817() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method23812(5) + 1;
			while (local44 < this.anInt3461) {
				@Pc(63) int local63 = arg0.method23812(Class356.method26652(this.anInt3461 - local44));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray358[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method23817() != 0;
			for (local50 = 0; local50 < this.anInt3461; local50++) {
				if (local86 && arg0.method23817() == 0) {
					this.anIntArray358[local50] = 0;
				} else {
					this.anIntArray358[local50] = arg0.method23812(5) + 1;
				}
			}
		}
		this.method23367();
		local44 = arg0.method23812(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method23813(arg0.method23812(32));
			@Pc(134) float local134 = arg0.method23813(arg0.method23812(32));
			local65 = arg0.method23812(4) + 1;
			@Pc(147) boolean local147 = arg0.method23817() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method23368(this.anInt3461, this.anInt3459);
			} else {
				local156 = this.anInt3461 * this.anInt3459;
			}
			this.anIntArray359 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray359[local169] = arg0.method23812(local65);
			}
			this.aFloatArrayArray23 = new float[this.anInt3461][this.anInt3459];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray359[local213] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt3459;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray359[local201] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt3460 = arg0.method23815() - local2;
		this.anInt3462 = arg0.method23814() - local5;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lclient!fu;)V", line = 49)
	void method23379(@OriginalArg(0) Class184 arg0) {
		@Pc(2) int local2 = arg0.method23815();
		@Pc(5) int local5 = arg0.method23814();
		arg0.method23812(24);
		this.anInt3459 = arg0.method23812(16);
		this.anInt3461 = arg0.method23812(24);
		if (this.anIntArray358 == null || this.anIntArray358.length != this.anInt3461) {
			this.anIntArray358 = new int[this.anInt3461];
		}
		@Pc(40) boolean local40 = arg0.method23817() != 0;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(65) int local65;
		if (local40) {
			local44 = 0;
			local50 = arg0.method23812(5) + 1;
			while (local44 < this.anInt3461) {
				@Pc(63) int local63 = arg0.method23812(Class356.method26652(this.anInt3461 - local44));
				for (local65 = 0; local65 < local63; local65++) {
					this.anIntArray358[local44++] = local50;
				}
				local50++;
			}
		} else {
			@Pc(86) boolean local86 = arg0.method23817() != 0;
			for (local50 = 0; local50 < this.anInt3461; local50++) {
				if (local86 && arg0.method23817() == 0) {
					this.anIntArray358[local50] = 0;
				} else {
					this.anIntArray358[local50] = arg0.method23812(5) + 1;
				}
			}
		}
		this.method23367();
		local44 = arg0.method23812(4);
		if (local44 > 0) {
			@Pc(128) float local128 = arg0.method23813(arg0.method23812(32));
			@Pc(134) float local134 = arg0.method23813(arg0.method23812(32));
			local65 = arg0.method23812(4) + 1;
			@Pc(147) boolean local147 = arg0.method23817() != 0;
			@Pc(156) int local156;
			if (local44 == 1) {
				local156 = method23368(this.anInt3461, this.anInt3459);
			} else {
				local156 = this.anInt3461 * this.anInt3459;
			}
			this.anIntArray359 = new int[local156];
			@Pc(169) int local169;
			for (local169 = 0; local169 < local156; local169++) {
				this.anIntArray359[local169] = arg0.method23812(local65);
			}
			this.aFloatArrayArray23 = new float[this.anInt3461][this.anInt3459];
			@Pc(199) float local199;
			@Pc(201) int local201;
			@Pc(203) int local203;
			if (local44 == 1) {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = 1;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(213) int local213 = local169 / local201 % local156;
						@Pc(225) float local225 = (float) this.anIntArray359[local213] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local225;
						if (local147) {
							local199 = local225;
						}
						local201 *= local156;
					}
				}
			} else {
				for (local169 = 0; local169 < this.anInt3461; local169++) {
					local199 = 0.0F;
					local201 = local169 * this.anInt3459;
					for (local203 = 0; local203 < this.anInt3459; local203++) {
						@Pc(276) float local276 = (float) this.anIntArray359[local201] * local134 + local128 + local199;
						this.aFloatArrayArray23[local169][local203] = local276;
						if (local147) {
							local199 = local276;
						}
						local201++;
					}
				}
			}
		}
		this.anInt3460 = arg0.method23815() - local2;
		this.anInt3462 = arg0.method23814() - local5;
	}

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "()V", line = 118)
	void method23367() {
		@Pc(3) int[] local3 = new int[this.anInt3461];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt3461; local8++) {
			local17 = this.anIntArray358[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray360 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt3461; local8++) {
			local17 = this.anIntArray358[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray360[local30] == 0) {
							this.anIntArray360[local30] = local122;
						}
						local30 = this.anIntArray360[local30];
					}
					if (local30 >= this.anIntArray360.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray360.length * 2];
						for (local69 = 0; local69 < this.anIntArray360.length; local69++) {
							local184[local69] = this.anIntArray360[local69];
						}
						this.anIntArray360 = local184;
					}
				}
				this.anIntArray360[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "()V", line = 118)
	void method23376() {
		@Pc(3) int[] local3 = new int[this.anInt3461];
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8;
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(69) int local69;
		for (local8 = 0; local8 < this.anInt3461; local8++) {
			local17 = this.anIntArray358[local8];
			if (local17 != 0) {
				local26 = 0x1 << 32 - local17;
				local30 = local6[local17];
				local3[local8] = local30;
				@Pc(60) int local60;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (local53 = local17 - 1; local53 >= 1; local53--) {
						local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (local53 = local17 + 1; local53 <= 32; local53++) {
					local60 = local6[local53];
					if (local60 == local30) {
						local6[local53] = local44;
					}
				}
			}
		}
		this.anIntArray360 = new int[8];
		@Pc(122) int local122 = 0;
		for (local8 = 0; local8 < this.anInt3461; local8++) {
			local17 = this.anIntArray358[local8];
			if (local17 != 0) {
				local26 = local3[local8];
				local30 = 0;
				for (local44 = 0; local44 < local17; local44++) {
					local53 = Integer.MIN_VALUE >>> local44;
					if ((local26 & local53) == 0) {
						local30++;
					} else {
						if (this.anIntArray360[local30] == 0) {
							this.anIntArray360[local30] = local122;
						}
						local30 = this.anIntArray360[local30];
					}
					if (local30 >= this.anIntArray360.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray360.length * 2];
						for (local69 = 0; local69 < this.anIntArray360.length; local69++) {
							local184[local69] = this.anIntArray360[local69];
						}
						this.anIntArray360 = local184;
					}
				}
				this.anIntArray360[local30] = ~local8;
				if (local30 >= local122) {
					local122 = local30 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "(Lclient!fu;)I", line = 184)
	int method23369(@OriginalArg(0) Class184 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray360[local1] >= 0; local1 = arg0.method23817() == 0 ? local1 + 1 : this.anIntArray360[local1]) {
		}
		return ~this.anIntArray360[local1];
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "(Lclient!fu;)I", line = 184)
	int method23370(@OriginalArg(0) Class184 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray360[local1] >= 0; local1 = arg0.method23817() == 0 ? local1 + 1 : this.anIntArray360[local1]) {
		}
		return ~this.anIntArray360[local1];
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(Lclient!fu;)I", line = 184)
	int method23378(@OriginalArg(0) Class184 arg0) {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray360[local1] >= 0; local1 = arg0.method23817() == 0 ? local1 + 1 : this.anIntArray360[local1]) {
		}
		return ~this.anIntArray360[local1];
	}

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "(Lclient!fu;)[F", line = 190)
	float[] method23364(@OriginalArg(0) Class184 arg0) {
		return this.aFloatArrayArray23[this.method23370(arg0)];
	}

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "(Lclient!fu;)[F", line = 190)
	float[] method23372(@OriginalArg(0) Class184 arg0) {
		return this.aFloatArrayArray23[this.method23370(arg0)];
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(Lclient!fu;)[F", line = 190)
	float[] method23373(@OriginalArg(0) Class184 arg0) {
		return this.aFloatArrayArray23[this.method23370(arg0)];
	}

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "(Lclient!fu;)[F", line = 190)
	float[] method23380(@OriginalArg(0) Class184 arg0) {
		return this.aFloatArrayArray23[this.method23370(arg0)];
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "(Lclient!fu;)[F", line = 190)
	float[] method23381(@OriginalArg(0) Class184 arg0) {
		return this.aFloatArrayArray23[this.method23370(arg0)];
	}
}
