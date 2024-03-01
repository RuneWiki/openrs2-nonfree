package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zr")
public class Class628 {

	@OriginalMember(owner = "client!zr", name = "h", descriptor = "[I")
	int[] anIntArray528;

	@OriginalMember(owner = "client!zr", name = "p", descriptor = "Lclient!zs;")
	Class629 aClass629_4;

	@OriginalMember(owner = "client!zr", name = "a", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!zr", name = "g", descriptor = "I")
	public int anInt5582;

	@OriginalMember(owner = "client!zr", name = "l", descriptor = "Z")
	public boolean aBoolean853 = false;

	@OriginalMember(owner = "client!zr", name = "<init>", descriptor = "()V", line = 13)
	Class628() {
	}

	@OriginalMember(owner = "client!zr", name = "p", descriptor = "(Lclient!ahb;I)V", line = 17)
	void method33810(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33811(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "s", descriptor = "(Lclient!ahb;)V", line = 17)
	void method33815(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33811(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "a", descriptor = "(Lclient!ahb;IB)V", line = 24)
	void method33811(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5581 = arg0.method20375() * -253719409;
		} else if (arg1 == 2) {
			this.anInt5582 = arg0.method20273() * 1018985555;
		} else if (arg1 == 3) {
			this.aBoolean853 = true;
		} else if (arg1 == 4) {
			this.anInt5581 = 253719409;
		}
	}

	@OriginalMember(owner = "client!zr", name = "u", descriptor = "(Lclient!ahb;I)V", line = 24)
	void method33816(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5581 = arg0.method20375() * -253719409;
		} else if (arg1 == 2) {
			this.anInt5582 = arg0.method20273() * 1018985555;
		} else if (arg1 == 3) {
			this.aBoolean853 = true;
		} else if (arg1 == 4) {
			this.anInt5581 = 253719409;
		}
	}

	@OriginalMember(owner = "client!zr", name = "y", descriptor = "(Lclient!ahb;I)V", line = 24)
	void method33817(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5581 = arg0.method20375() * -253719409;
		} else if (arg1 == 2) {
			this.anInt5582 = arg0.method20273() * 1018985555;
		} else if (arg1 == 3) {
			this.aBoolean853 = true;
		} else if (arg1 == 4) {
			this.anInt5581 = 253719409;
		}
	}

	@OriginalMember(owner = "client!zr", name = "b", descriptor = "(Lclient!ahb;I)V", line = 24)
	void method33823(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5581 = arg0.method20375() * -253719409;
		} else if (arg1 == 2) {
			this.anInt5582 = arg0.method20273() * 1018985555;
		} else if (arg1 == 3) {
			this.aBoolean853 = true;
		} else if (arg1 == 4) {
			this.anInt5581 = 253719409;
		}
	}

	@OriginalMember(owner = "client!zr", name = "c", descriptor = "(Lclient!de;IZ)Lclient!co;", line = 32)
	public Class6 method33819(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt5581 * -508620177 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2463 * -427632027 << 19);
		@Pc(29) Class6 local29 = (Class6) this.aClass629_4.aClass161_76.method23219(local22);
		if (local29 == null) {
			this.method33822(arg0, arg1, arg2, local22);
			return (Class6) this.aClass629_4.aClass161_76.method23219(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!zr", name = "z", descriptor = "(Lclient!de;IZ)Lclient!co;", line = 32)
	public Class6 method33820(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt5581 * -508620177 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2463 * -427632027 << 19);
		@Pc(29) Class6 local29 = (Class6) this.aClass629_4.aClass161_76.method23219(local22);
		if (local29 == null) {
			this.method33822(arg0, arg1, arg2, local22);
			return (Class6) this.aClass629_4.aClass161_76.method23219(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!zr", name = "g", descriptor = "(Lclient!de;IZI)Lclient!co;", line = 32)
	public Class6 method33828(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt5581 * -508620177 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2463 * -427632027 << 19);
		@Pc(29) Class6 local29 = (Class6) this.aClass629_4.aClass161_76.method23219(local22);
		if (local29 == null) {
			this.method33822(arg0, arg1, arg2, local22);
			return (Class6) this.aClass629_4.aClass161_76.method23219(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!zr", name = "e", descriptor = "(Lclient!de;IZ)[I", line = 40)
	public int[] method33808(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray528 == null) {
			@Pc(29) long local29 = (long) (this.anInt5581 * -508620177 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2463 * -427632027 << 19);
			this.method33822(arg0, arg1, arg2, local29);
			return this.anIntArray528;
		} else {
			return this.anIntArray528;
		}
	}

	@OriginalMember(owner = "client!zr", name = "n", descriptor = "(Lclient!de;IZ)[I", line = 40)
	public int[] method33809(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray528 == null) {
			@Pc(29) long local29 = (long) (this.anInt5581 * -508620177 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2463 * -427632027 << 19);
			this.method33822(arg0, arg1, arg2, local29);
			return this.anIntArray528;
		} else {
			return this.anIntArray528;
		}
	}

	@OriginalMember(owner = "client!zr", name = "l", descriptor = "(Lclient!de;IZI)[I", line = 40)
	public int[] method33812(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray528 == null) {
			@Pc(29) long local29 = (long) (this.anInt5581 * -508620177 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2463 * -427632027 << 19);
			this.method33822(arg0, arg1, arg2, local29);
			return this.anIntArray528;
		} else {
			return this.anIntArray528;
		}
	}

	@OriginalMember(owner = "client!zr", name = "j", descriptor = "(Lclient!de;IZ)[I", line = 40)
	public int[] method33821(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray528 == null) {
			@Pc(29) long local29 = (long) (this.anInt5581 * -508620177 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2463 * -427632027 << 19);
			this.method33822(arg0, arg1, arg2, local29);
			return this.anIntArray528;
		} else {
			return this.anIntArray528;
		}
	}

	@OriginalMember(owner = "client!zr", name = "r", descriptor = "(Lclient!de;IZJ)V", line = 47)
	void method33818(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177)) {
			return;
		}
		@Pc(20) Class15 local20 = Class137.method22938(this.aClass629_4.aClass359_119, this.anInt5581 * -508620177, 0);
		if (local20 != null) {
			local20.method3439();
			if (arg2) {
				local20.method3450();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method3447();
			}
			this.anIntArray528 = local20.method3448(false);
			if (this.anInt5582 * -1966397477 != 0) {
				local30 = this.anInt5582 * -1966397477 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt5582 * -1966397477 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt5582 * -1966397477 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray528.length; local74++) {
					@Pc(88) int local88 = this.anIntArray528[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(106) int local106 = local30 * -16777216 * (this.anIntArray528[local74] & 0xFF0000);
						@Pc(117) int local117 = (this.anIntArray528[local74] & 0xFF00) * local65 * 16711680;
						@Pc(128) int local128 = local72 * 65280 * (this.anIntArray528[local74] & 0xFF);
						@Pc(136) int local136 = (local106 | local117 | local128) >>> 8;
						if (local88 == 255) {
							this.anIntArray528[local74] = local136;
						} else {
							@Pc(150) int local150 = this.anIntArray528[local74];
							this.anIntArray528[local74] = local88 << 24 | (local92 * (local136 & 0xFF00) + local88 * (local150 & 0xFF00) & 0xFF0000) + (local88 * (local150 & 0xFF00FF) + (local136 & 0xFF00FF) * local92 & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(194) Class6 local194 = arg0.method17089(local20, true);
		if (local194 != null) {
			this.aClass629_4.aClass161_76.method23222(local194, arg3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "h", descriptor = "(Lclient!de;IZJ)V", line = 47)
	void method33822(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177)) {
			return;
		}
		@Pc(20) Class15 local20 = Class137.method22938(this.aClass629_4.aClass359_119, this.anInt5581 * -508620177, 0);
		if (local20 != null) {
			local20.method3439();
			if (arg2) {
				local20.method3450();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method3447();
			}
			this.anIntArray528 = local20.method3448(false);
			if (this.anInt5582 * -1966397477 != 0) {
				local30 = this.anInt5582 * -1966397477 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt5582 * -1966397477 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt5582 * -1966397477 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray528.length; local74++) {
					@Pc(88) int local88 = this.anIntArray528[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(106) int local106 = local30 * -16777216 * (this.anIntArray528[local74] & 0xFF0000);
						@Pc(117) int local117 = (this.anIntArray528[local74] & 0xFF00) * local65 * 16711680;
						@Pc(128) int local128 = local72 * 65280 * (this.anIntArray528[local74] & 0xFF);
						@Pc(136) int local136 = (local106 | local117 | local128) >>> 8;
						if (local88 == 255) {
							this.anIntArray528[local74] = local136;
						} else {
							@Pc(150) int local150 = this.anIntArray528[local74];
							this.anIntArray528[local74] = local88 << 24 | (local92 * (local136 & 0xFF00) + local88 * (local150 & 0xFF00) & 0xFF0000) + (local88 * (local150 & 0xFF00FF) + (local136 & 0xFF00FF) * local92 & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(194) Class6 local194 = arg0.method17089(local20, true);
		if (local194 != null) {
			this.aClass629_4.aClass161_76.method23222(local194, arg3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "d", descriptor = "(Lclient!de;IZJ)V", line = 47)
	void method33824(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177)) {
			return;
		}
		@Pc(20) Class15 local20 = Class137.method22938(this.aClass629_4.aClass359_119, this.anInt5581 * -508620177, 0);
		if (local20 != null) {
			local20.method3439();
			if (arg2) {
				local20.method3450();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method3447();
			}
			this.anIntArray528 = local20.method3448(false);
			if (this.anInt5582 * -1966397477 != 0) {
				local30 = this.anInt5582 * -1966397477 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt5582 * -1966397477 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt5582 * -1966397477 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray528.length; local74++) {
					@Pc(88) int local88 = this.anIntArray528[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(106) int local106 = local30 * -16777216 * (this.anIntArray528[local74] & 0xFF0000);
						@Pc(117) int local117 = (this.anIntArray528[local74] & 0xFF00) * local65 * 16711680;
						@Pc(128) int local128 = local72 * 65280 * (this.anIntArray528[local74] & 0xFF);
						@Pc(136) int local136 = (local106 | local117 | local128) >>> 8;
						if (local88 == 255) {
							this.anIntArray528[local74] = local136;
						} else {
							@Pc(150) int local150 = this.anIntArray528[local74];
							this.anIntArray528[local74] = local88 << 24 | (local92 * (local136 & 0xFF00) + local88 * (local150 & 0xFF00) & 0xFF0000) + (local88 * (local150 & 0xFF00FF) + (local136 & 0xFF00FF) * local92 & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(194) Class6 local194 = arg0.method17089(local20, true);
		if (local194 != null) {
			this.aClass629_4.aClass161_76.method23222(local194, arg3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "q", descriptor = "(Lclient!de;IZJ)V", line = 47)
	void method33825(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177)) {
			return;
		}
		@Pc(20) Class15 local20 = Class137.method22938(this.aClass629_4.aClass359_119, this.anInt5581 * -508620177, 0);
		if (local20 != null) {
			local20.method3439();
			if (arg2) {
				local20.method3450();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method3447();
			}
			this.anIntArray528 = local20.method3448(false);
			if (this.anInt5582 * -1966397477 != 0) {
				local30 = this.anInt5582 * -1966397477 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt5582 * -1966397477 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt5582 * -1966397477 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray528.length; local74++) {
					@Pc(88) int local88 = this.anIntArray528[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(106) int local106 = local30 * -16777216 * (this.anIntArray528[local74] & 0xFF0000);
						@Pc(117) int local117 = (this.anIntArray528[local74] & 0xFF00) * local65 * 16711680;
						@Pc(128) int local128 = local72 * 65280 * (this.anIntArray528[local74] & 0xFF);
						@Pc(136) int local136 = (local106 | local117 | local128) >>> 8;
						if (local88 == 255) {
							this.anIntArray528[local74] = local136;
						} else {
							@Pc(150) int local150 = this.anIntArray528[local74];
							this.anIntArray528[local74] = local88 << 24 | (local92 * (local136 & 0xFF00) + local88 * (local150 & 0xFF00) & 0xFF0000) + (local88 * (local150 & 0xFF00FF) + (local136 & 0xFF00FF) * local92 & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(194) Class6 local194 = arg0.method17089(local20, true);
		if (local194 != null) {
			this.aClass629_4.aClass161_76.method23222(local194, arg3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "m", descriptor = "(Lclient!de;IZJ)V", line = 47)
	void method33826(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177)) {
			return;
		}
		@Pc(20) Class15 local20 = Class137.method22938(this.aClass629_4.aClass359_119, this.anInt5581 * -508620177, 0);
		if (local20 != null) {
			local20.method3439();
			if (arg2) {
				local20.method3450();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method3447();
			}
			this.anIntArray528 = local20.method3448(false);
			if (this.anInt5582 * -1966397477 != 0) {
				local30 = this.anInt5582 * -1966397477 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt5582 * -1966397477 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt5582 * -1966397477 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray528.length; local74++) {
					@Pc(88) int local88 = this.anIntArray528[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(106) int local106 = local30 * -16777216 * (this.anIntArray528[local74] & 0xFF0000);
						@Pc(117) int local117 = (this.anIntArray528[local74] & 0xFF00) * local65 * 16711680;
						@Pc(128) int local128 = local72 * 65280 * (this.anIntArray528[local74] & 0xFF);
						@Pc(136) int local136 = (local106 | local117 | local128) >>> 8;
						if (local88 == 255) {
							this.anIntArray528[local74] = local136;
						} else {
							@Pc(150) int local150 = this.anIntArray528[local74];
							this.anIntArray528[local74] = local88 << 24 | (local92 * (local136 & 0xFF00) + local88 * (local150 & 0xFF00) & 0xFF0000) + (local88 * (local150 & 0xFF00FF) + (local136 & 0xFF00FF) * local92 & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(194) Class6 local194 = arg0.method17089(local20, true);
		if (local194 != null) {
			this.aClass629_4.aClass161_76.method23222(local194, arg3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "v", descriptor = "(Lclient!de;IZJ)V", line = 47)
	void method33827(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177)) {
			return;
		}
		@Pc(20) Class15 local20 = Class137.method22938(this.aClass629_4.aClass359_119, this.anInt5581 * -508620177, 0);
		if (local20 != null) {
			local20.method3439();
			if (arg2) {
				local20.method3450();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method3447();
			}
			this.anIntArray528 = local20.method3448(false);
			if (this.anInt5582 * -1966397477 != 0) {
				local30 = this.anInt5582 * -1966397477 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt5582 * -1966397477 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt5582 * -1966397477 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray528.length; local74++) {
					@Pc(88) int local88 = this.anIntArray528[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(106) int local106 = local30 * -16777216 * (this.anIntArray528[local74] & 0xFF0000);
						@Pc(117) int local117 = (this.anIntArray528[local74] & 0xFF00) * local65 * 16711680;
						@Pc(128) int local128 = local72 * 65280 * (this.anIntArray528[local74] & 0xFF);
						@Pc(136) int local136 = (local106 | local117 | local128) >>> 8;
						if (local88 == 255) {
							this.anIntArray528[local74] = local136;
						} else {
							@Pc(150) int local150 = this.anIntArray528[local74];
							this.anIntArray528[local74] = local88 << 24 | (local92 * (local136 & 0xFF00) + local88 * (local150 & 0xFF00) & 0xFF0000) + (local88 * (local150 & 0xFF00FF) + (local136 & 0xFF00FF) * local92 & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(194) Class6 local194 = arg0.method17089(local20, true);
		if (local194 != null) {
			this.aClass629_4.aClass161_76.method23222(local194, arg3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "t", descriptor = "(Lclient!de;IZJ)V", line = 47)
	void method33830(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177)) {
			return;
		}
		@Pc(20) Class15 local20 = Class137.method22938(this.aClass629_4.aClass359_119, this.anInt5581 * -508620177, 0);
		if (local20 != null) {
			local20.method3439();
			if (arg2) {
				local20.method3450();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method3447();
			}
			this.anIntArray528 = local20.method3448(false);
			if (this.anInt5582 * -1966397477 != 0) {
				local30 = this.anInt5582 * -1966397477 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt5582 * -1966397477 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt5582 * -1966397477 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray528.length; local74++) {
					@Pc(88) int local88 = this.anIntArray528[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(106) int local106 = local30 * -16777216 * (this.anIntArray528[local74] & 0xFF0000);
						@Pc(117) int local117 = (this.anIntArray528[local74] & 0xFF00) * local65 * 16711680;
						@Pc(128) int local128 = local72 * 65280 * (this.anIntArray528[local74] & 0xFF);
						@Pc(136) int local136 = (local106 | local117 | local128) >>> 8;
						if (local88 == 255) {
							this.anIntArray528[local74] = local136;
						} else {
							@Pc(150) int local150 = this.anIntArray528[local74];
							this.anIntArray528[local74] = local88 << 24 | (local92 * (local136 & 0xFF00) + local88 * (local150 & 0xFF00) & 0xFF0000) + (local88 * (local150 & 0xFF00FF) + (local136 & 0xFF00FF) * local92 & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(194) Class6 local194 = arg0.method17089(local20, true);
		if (local194 != null) {
			this.aClass629_4.aClass161_76.method23222(local194, arg3);
		}
	}

	@OriginalMember(owner = "client!zr", name = "o", descriptor = "()Z", line = 81)
	public boolean method33813() {
		return this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177);
	}

	@OriginalMember(owner = "client!zr", name = "x", descriptor = "(I)Z", line = 81)
	public boolean method33814() {
		return this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177);
	}

	@OriginalMember(owner = "client!zr", name = "w", descriptor = "()Z", line = 81)
	public boolean method33829() {
		return this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177);
	}

	@OriginalMember(owner = "client!zr", name = "i", descriptor = "()Z", line = 81)
	public boolean method33831() {
		return this.aClass629_4.aClass359_119.method26674(this.anInt5581 * -508620177);
	}

	@OriginalMember(owner = "client!zr", name = "ap", descriptor = "(Lclient!vs;I)V", line = 4103)
	static final void method33832(@OriginalArg(0) Class536 arg0) {
		@Pc(9) int local9 = arg0.anIntArray497[arg0.anInt5318 * -2140198955] >> 16;
		@Pc(19) int local19 = arg0.anIntArray497[arg0.anInt5318 * -2140198955] & 0xFFFF;
		@Pc(32) int local32 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local32 < 0 || local32 > 5000) {
			throw new RuntimeException();
		}
		arg0.anIntArray495[local9] = local32;
		@Pc(48) byte local48 = -1;
		if (local19 == 105) {
			local48 = 0;
		}
		for (@Pc(55) int local55 = 0; local55 < local32; local55++) {
			arg0.anIntArrayArray62[local9][local55] = local48;
		}
	}

	@OriginalMember(owner = "client!zr", name = "ga", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5229)
	static final void method33833(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean645 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class178.method23519(arg0.anInt3570 * 954808515);
		}
	}
}
