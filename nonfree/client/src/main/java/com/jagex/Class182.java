package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public class Class182 {

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "[I")
	int[] anIntArray375;

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "Lclient!fu;")
	Class184 aClass184_2;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	int anInt3585;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
	int anInt3586;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	int anInt3587;

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
	int anInt3588;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	int anInt3589;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "[I")
	int[] anIntArray376;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
	int anInt3590;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "[[I")
	int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V", line = 20)
	Class182() {
	}

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "(Lclient!fu;)V", line = 23)
	void method23553(@OriginalArg(0) Class184 arg0) {
		this.aClass184_2 = arg0;
		this.anInt3590 = this.aClass184_2.method23812(16);
		this.anInt3589 = this.aClass184_2.method23812(24);
		this.anInt3587 = this.aClass184_2.method23812(24);
		this.anInt3586 = this.aClass184_2.method23812(24) + 1;
		this.anInt3585 = this.aClass184_2.method23812(6) + 1;
		this.anInt3588 = this.aClass184_2.method23812(8);
		if (this.anIntArray376 == null || this.anIntArray376.length != this.anInt3585) {
			this.anIntArray376 = new int[this.anInt3585];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3585; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass184_2.method23812(3);
			@Pc(77) boolean local77 = this.aClass184_2.method23817() != 0;
			if (local77) {
				local64 = this.aClass184_2.method23812(5);
			}
			this.anIntArray376[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3585 * 8) {
			this.anIntArray375 = new int[this.anInt3585 * 8];
		}
		for (local58 = 0; local58 < this.anInt3585 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray376[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass184_2.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "(Lclient!fu;)V", line = 23)
	void method23554(@OriginalArg(0) Class184 arg0) {
		this.aClass184_2 = arg0;
		this.anInt3590 = this.aClass184_2.method23812(16);
		this.anInt3589 = this.aClass184_2.method23812(24);
		this.anInt3587 = this.aClass184_2.method23812(24);
		this.anInt3586 = this.aClass184_2.method23812(24) + 1;
		this.anInt3585 = this.aClass184_2.method23812(6) + 1;
		this.anInt3588 = this.aClass184_2.method23812(8);
		if (this.anIntArray376 == null || this.anIntArray376.length != this.anInt3585) {
			this.anIntArray376 = new int[this.anInt3585];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3585; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass184_2.method23812(3);
			@Pc(77) boolean local77 = this.aClass184_2.method23817() != 0;
			if (local77) {
				local64 = this.aClass184_2.method23812(5);
			}
			this.anIntArray376[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3585 * 8) {
			this.anIntArray375 = new int[this.anInt3585 * 8];
		}
		for (local58 = 0; local58 < this.anInt3585 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray376[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass184_2.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "(Lclient!fu;)V", line = 23)
	void method23555(@OriginalArg(0) Class184 arg0) {
		this.aClass184_2 = arg0;
		this.anInt3590 = this.aClass184_2.method23812(16);
		this.anInt3589 = this.aClass184_2.method23812(24);
		this.anInt3587 = this.aClass184_2.method23812(24);
		this.anInt3586 = this.aClass184_2.method23812(24) + 1;
		this.anInt3585 = this.aClass184_2.method23812(6) + 1;
		this.anInt3588 = this.aClass184_2.method23812(8);
		if (this.anIntArray376 == null || this.anIntArray376.length != this.anInt3585) {
			this.anIntArray376 = new int[this.anInt3585];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3585; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass184_2.method23812(3);
			@Pc(77) boolean local77 = this.aClass184_2.method23817() != 0;
			if (local77) {
				local64 = this.aClass184_2.method23812(5);
			}
			this.anIntArray376[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3585 * 8) {
			this.anIntArray375 = new int[this.anInt3585 * 8];
		}
		for (local58 = 0; local58 < this.anInt3585 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray376[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass184_2.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "(Lclient!fu;)V", line = 23)
	void method23557(@OriginalArg(0) Class184 arg0) {
		this.aClass184_2 = arg0;
		this.anInt3590 = this.aClass184_2.method23812(16);
		this.anInt3589 = this.aClass184_2.method23812(24);
		this.anInt3587 = this.aClass184_2.method23812(24);
		this.anInt3586 = this.aClass184_2.method23812(24) + 1;
		this.anInt3585 = this.aClass184_2.method23812(6) + 1;
		this.anInt3588 = this.aClass184_2.method23812(8);
		if (this.anIntArray376 == null || this.anIntArray376.length != this.anInt3585) {
			this.anIntArray376 = new int[this.anInt3585];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3585; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass184_2.method23812(3);
			@Pc(77) boolean local77 = this.aClass184_2.method23817() != 0;
			if (local77) {
				local64 = this.aClass184_2.method23812(5);
			}
			this.anIntArray376[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3585 * 8) {
			this.anIntArray375 = new int[this.anInt3585 * 8];
		}
		for (local58 = 0; local58 < this.anInt3585 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray376[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass184_2.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "(Lclient!fu;)V", line = 23)
	void method23558(@OriginalArg(0) Class184 arg0) {
		this.aClass184_2 = arg0;
		this.anInt3590 = this.aClass184_2.method23812(16);
		this.anInt3589 = this.aClass184_2.method23812(24);
		this.anInt3587 = this.aClass184_2.method23812(24);
		this.anInt3586 = this.aClass184_2.method23812(24) + 1;
		this.anInt3585 = this.aClass184_2.method23812(6) + 1;
		this.anInt3588 = this.aClass184_2.method23812(8);
		if (this.anIntArray376 == null || this.anIntArray376.length != this.anInt3585) {
			this.anIntArray376 = new int[this.anInt3585];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3585; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass184_2.method23812(3);
			@Pc(77) boolean local77 = this.aClass184_2.method23817() != 0;
			if (local77) {
				local64 = this.aClass184_2.method23812(5);
			}
			this.anIntArray376[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3585 * 8) {
			this.anIntArray375 = new int[this.anInt3585 * 8];
		}
		for (local58 = 0; local58 < this.anInt3585 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray376[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass184_2.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "([I)V", line = 49)
	void method23551(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "([I)V", line = 49)
	void method23556(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "([I)V", line = 49)
	void method23559(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "([I)V", line = 49)
	void method23560(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "([Lclient!fb;I[Z)[Lclient!fb;", line = 56)
	Class167[] method23552(@OriginalArg(0) Class167[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray97[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass184_2.aClass171Array2[this.anInt3588].anInt3459;
		local13 = this.anInt3587 - this.anInt3589;
		@Pc(46) int local46 = local13 / this.anInt3586;
		@Pc(69) int local69;
		if (this.anIntArrayArray44 != null && this.anIntArrayArray44.length == local2 && this.anIntArrayArray44[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method23556(this.anIntArrayArray44[local69]);
			}
		} else {
			this.anIntArrayArray44 = new int[local2][local46];
		}
		for (local69 = 0; local69 < 8; local69++) {
			@Pc(87) int local87 = 0;
			while (local87 < local46) {
				@Pc(94) int local94;
				@Pc(111) int local111;
				@Pc(115) int local115;
				if (local69 == 0) {
					for (local94 = 0; local94 < local2; local94++) {
						if (!arg2[local94]) {
							local111 = this.aClass184_2.aClass171Array2[this.anInt3588].method23370(this.aClass184_2);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray44[local94][local87 + local115] = local111 % this.anInt3585;
								}
								local111 /= this.anInt3585;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray44[local111][local87];
							@Pc(173) int local173 = this.anIntArray375[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3589 + local87 * this.anInt3586;
								@Pc(189) Class171 local189 = this.aClass184_2.aClass171Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3590 == 0) {
									local198 = this.anInt3586 / local189.anInt3459;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method23364(this.aClass184_2);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt3459; local210++) {
											arg0[local111].aFloatArray97[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3590 == 1 || this.anInt3590 == 2) {
									local198 = 0;
									while (local198 < this.anInt3586) {
										@Pc(256) float[] local256 = local189.method23364(this.aClass184_2);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt3459; local258++) {
											arg0[local111].aFloatArray97[local183 + local198] += local256[local258];
											local198++;
										}
									}
								}
							}
						}
					}
					local87++;
					if (local87 >= local46) {
						break;
					}
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "([Lclient!fb;I[Z)[Lclient!fb;", line = 56)
	Class167[] method23561(@OriginalArg(0) Class167[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray97[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass184_2.aClass171Array2[this.anInt3588].anInt3459;
		local13 = this.anInt3587 - this.anInt3589;
		@Pc(46) int local46 = local13 / this.anInt3586;
		@Pc(69) int local69;
		if (this.anIntArrayArray44 != null && this.anIntArrayArray44.length == local2 && this.anIntArrayArray44[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method23556(this.anIntArrayArray44[local69]);
			}
		} else {
			this.anIntArrayArray44 = new int[local2][local46];
		}
		for (local69 = 0; local69 < 8; local69++) {
			@Pc(87) int local87 = 0;
			while (local87 < local46) {
				@Pc(94) int local94;
				@Pc(111) int local111;
				@Pc(115) int local115;
				if (local69 == 0) {
					for (local94 = 0; local94 < local2; local94++) {
						if (!arg2[local94]) {
							local111 = this.aClass184_2.aClass171Array2[this.anInt3588].method23370(this.aClass184_2);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray44[local94][local87 + local115] = local111 % this.anInt3585;
								}
								local111 /= this.anInt3585;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray44[local111][local87];
							@Pc(173) int local173 = this.anIntArray375[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3589 + local87 * this.anInt3586;
								@Pc(189) Class171 local189 = this.aClass184_2.aClass171Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3590 == 0) {
									local198 = this.anInt3586 / local189.anInt3459;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method23364(this.aClass184_2);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt3459; local210++) {
											arg0[local111].aFloatArray97[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3590 == 1 || this.anInt3590 == 2) {
									local198 = 0;
									while (local198 < this.anInt3586) {
										@Pc(256) float[] local256 = local189.method23364(this.aClass184_2);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt3459; local258++) {
											arg0[local111].aFloatArray97[local183 + local198] += local256[local258];
											local198++;
										}
									}
								}
							}
						}
					}
					local87++;
					if (local87 >= local46) {
						break;
					}
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "([Lclient!fb;I[Z)[Lclient!fb;", line = 56)
	Class167[] method23562(@OriginalArg(0) Class167[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray97[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass184_2.aClass171Array2[this.anInt3588].anInt3459;
		local13 = this.anInt3587 - this.anInt3589;
		@Pc(46) int local46 = local13 / this.anInt3586;
		@Pc(69) int local69;
		if (this.anIntArrayArray44 != null && this.anIntArrayArray44.length == local2 && this.anIntArrayArray44[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method23556(this.anIntArrayArray44[local69]);
			}
		} else {
			this.anIntArrayArray44 = new int[local2][local46];
		}
		for (local69 = 0; local69 < 8; local69++) {
			@Pc(87) int local87 = 0;
			while (local87 < local46) {
				@Pc(94) int local94;
				@Pc(111) int local111;
				@Pc(115) int local115;
				if (local69 == 0) {
					for (local94 = 0; local94 < local2; local94++) {
						if (!arg2[local94]) {
							local111 = this.aClass184_2.aClass171Array2[this.anInt3588].method23370(this.aClass184_2);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray44[local94][local87 + local115] = local111 % this.anInt3585;
								}
								local111 /= this.anInt3585;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray44[local111][local87];
							@Pc(173) int local173 = this.anIntArray375[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3589 + local87 * this.anInt3586;
								@Pc(189) Class171 local189 = this.aClass184_2.aClass171Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3590 == 0) {
									local198 = this.anInt3586 / local189.anInt3459;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method23364(this.aClass184_2);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt3459; local210++) {
											arg0[local111].aFloatArray97[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3590 == 1 || this.anInt3590 == 2) {
									local198 = 0;
									while (local198 < this.anInt3586) {
										@Pc(256) float[] local256 = local189.method23364(this.aClass184_2);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt3459; local258++) {
											arg0[local111].aFloatArray97[local183 + local198] += local256[local258];
											local198++;
										}
									}
								}
							}
						}
					}
					local87++;
					if (local87 >= local46) {
						break;
					}
				}
			}
		}
		return arg0;
	}
}
