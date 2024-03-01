package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public class Class440 {

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "Z")
	public static boolean aBoolean765 = false;

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	public int anInt4929;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "[I")
	public int[] anIntArray441;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
	public int[] anIntArray442;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!rn;")
	Class436 aClass436_3;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "Lclient!rd;")
	public Class427 aClass427_1;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "Lclient!xn;")
	Class581 aClass581_32;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "[I")
	public int[] anIntArray443;

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "[I")
	public int[] anIntArray444;

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
	public int anInt4931 = 0;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	public int anInt4930 = 2109337741;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public int anInt4932 = -743923257;

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
	public int anInt4933 = -37260209;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
	public int anInt4936 = -1971108035;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
	public int anInt4934 = -679723085;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public int anInt4935 = -1578342219;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
	public int anInt4937 = 1184372661;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
	public int anInt4928 = 750467414;

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "Z")
	public boolean aBoolean764 = false;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Z")
	public boolean aBoolean766 = false;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
	public int anInt4938 = -179147271;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZI)I", line = 33)
	public static int method28240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray179.length) {
			return local4.anIntArray179[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 36)
	Class440() {
	}

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "(Lclient!ahb;B)V", line = 40)
	void method28220(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28235(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "(Lclient!ahb;)V", line = 40)
	void method28225(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28235(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "(Lclient!ahb;)V", line = 40)
	void method28227(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28235(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "(Lclient!ahb;)V", line = 40)
	void method28232(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28235(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(Lclient!ahb;I)V", line = 47)
	void method28229(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method20271();
			this.anIntArray440 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray440[local12] = arg0.method20271();
			}
			this.anIntArray441 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray441[local12] = arg0.method20271();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray441[local12] += arg0.method20271() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4930 = arg0.method20271() * -2109337741;
		} else if (arg1 == 5) {
			this.anInt4932 = arg0.method20269() * 1569202267;
		} else if (arg1 == 6) {
			this.anInt4933 = arg0.method20271() * 37260209;
		} else if (arg1 == 7) {
			this.anInt4936 = arg0.method20271() * 1971108035;
		} else if (arg1 == 8) {
			this.anInt4934 = arg0.method20269() * -1351754639;
		} else if (arg1 == 9) {
			this.anInt4935 = arg0.method20269() * 1578342219;
		} else if (arg1 == 10) {
			this.anInt4937 = arg0.method20269() * -1184372661;
		} else if (arg1 == 11) {
			this.anInt4928 = arg0.method20269() * 375233707;
		} else if (arg1 == 12) {
			local6 = arg0.method20269();
			this.anIntArray442 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray442[local12] = arg0.method20271();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray442[local12] += arg0.method20271() << 16;
			}
		} else {
			@Pc(238) int local238;
			if (arg1 == 13) {
				local6 = arg0.method20271();
				this.anIntArrayArray54 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(219) int local219 = arg0.method20269();
					if (local219 > 0) {
						this.anIntArrayArray54[local12] = new int[local219];
						this.anIntArrayArray54[local12][0] = arg0.method20273();
						for (local238 = 1; local238 < local219; local238++) {
							this.anIntArrayArray54[local12][local238] = arg0.method20271();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean764 = true;
			} else if (arg1 == 15) {
				this.aBoolean766 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19) {
					if (this.anIntArray443 == null) {
						this.anIntArray443 = new int[this.anIntArrayArray54.length];
						for (local6 = 0; local6 < this.anIntArrayArray54.length; local6++) {
							this.anIntArray443[local6] = 255;
						}
					}
					this.anIntArray443[arg0.method20269()] = arg0.method20269();
				} else if (arg1 == 20) {
					if (this.anIntArray444 == null || this.anIntArray445 == null) {
						this.anIntArray444 = new int[this.anIntArrayArray54.length];
						this.anIntArray445 = new int[this.anIntArrayArray54.length];
						for (local6 = 0; local6 < this.anIntArrayArray54.length; local6++) {
							this.anIntArray444[local6] = 256;
							this.anIntArray445[local6] = 256;
						}
					}
					local6 = arg0.method20269();
					this.anIntArray444[local6] = arg0.method20271();
					this.anIntArray445[local6] = arg0.method20271();
				} else if (arg1 == 22) {
					this.anInt4938 = arg0.method20269() * 179147271;
				} else if (arg1 == 23) {
					arg0.method20271();
				} else if (arg1 == 24) {
					local6 = arg0.method20271();
					this.aClass427_1 = this.aClass436_3.aClass429_2.method27928(local6);
				} else if (arg1 == 249) {
					local6 = arg0.method20269();
					if (this.aClass581_32 == null) {
						local12 = Class302.method25670(local6);
						this.aClass581_32 = new Class581(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(443) boolean local443 = arg0.method20269() == 1;
						local238 = arg0.method20273();
						@Pc(456) Class3 local456;
						if (local443) {
							local456 = new Class3_Sub29(arg0.method20283());
						} else {
							local456 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_32.method33241(local456, (long) local238);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Lclient!ahb;I)V", line = 47)
	void method28233(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method20271();
			this.anIntArray440 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray440[local12] = arg0.method20271();
			}
			this.anIntArray441 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray441[local12] = arg0.method20271();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray441[local12] += arg0.method20271() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4930 = arg0.method20271() * -2109337741;
		} else if (arg1 == 5) {
			this.anInt4932 = arg0.method20269() * 1569202267;
		} else if (arg1 == 6) {
			this.anInt4933 = arg0.method20271() * 37260209;
		} else if (arg1 == 7) {
			this.anInt4936 = arg0.method20271() * 1971108035;
		} else if (arg1 == 8) {
			this.anInt4934 = arg0.method20269() * -1351754639;
		} else if (arg1 == 9) {
			this.anInt4935 = arg0.method20269() * 1578342219;
		} else if (arg1 == 10) {
			this.anInt4937 = arg0.method20269() * -1184372661;
		} else if (arg1 == 11) {
			this.anInt4928 = arg0.method20269() * 375233707;
		} else if (arg1 == 12) {
			local6 = arg0.method20269();
			this.anIntArray442 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray442[local12] = arg0.method20271();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray442[local12] += arg0.method20271() << 16;
			}
		} else {
			@Pc(238) int local238;
			if (arg1 == 13) {
				local6 = arg0.method20271();
				this.anIntArrayArray54 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(219) int local219 = arg0.method20269();
					if (local219 > 0) {
						this.anIntArrayArray54[local12] = new int[local219];
						this.anIntArrayArray54[local12][0] = arg0.method20273();
						for (local238 = 1; local238 < local219; local238++) {
							this.anIntArrayArray54[local12][local238] = arg0.method20271();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean764 = true;
			} else if (arg1 == 15) {
				this.aBoolean766 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19) {
					if (this.anIntArray443 == null) {
						this.anIntArray443 = new int[this.anIntArrayArray54.length];
						for (local6 = 0; local6 < this.anIntArrayArray54.length; local6++) {
							this.anIntArray443[local6] = 255;
						}
					}
					this.anIntArray443[arg0.method20269()] = arg0.method20269();
				} else if (arg1 == 20) {
					if (this.anIntArray444 == null || this.anIntArray445 == null) {
						this.anIntArray444 = new int[this.anIntArrayArray54.length];
						this.anIntArray445 = new int[this.anIntArrayArray54.length];
						for (local6 = 0; local6 < this.anIntArrayArray54.length; local6++) {
							this.anIntArray444[local6] = 256;
							this.anIntArray445[local6] = 256;
						}
					}
					local6 = arg0.method20269();
					this.anIntArray444[local6] = arg0.method20271();
					this.anIntArray445[local6] = arg0.method20271();
				} else if (arg1 == 22) {
					this.anInt4938 = arg0.method20269() * 179147271;
				} else if (arg1 == 23) {
					arg0.method20271();
				} else if (arg1 == 24) {
					local6 = arg0.method20271();
					this.aClass427_1 = this.aClass436_3.aClass429_2.method27928(local6);
				} else if (arg1 == 249) {
					local6 = arg0.method20269();
					if (this.aClass581_32 == null) {
						local12 = Class302.method25670(local6);
						this.aClass581_32 = new Class581(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(443) boolean local443 = arg0.method20269() == 1;
						local238 = arg0.method20273();
						@Pc(456) Class3 local456;
						if (local443) {
							local456 = new Class3_Sub29(arg0.method20283());
						} else {
							local456 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_32.method33241(local456, (long) local238);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ahb;II)V", line = 47)
	void method28235(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method20271();
			this.anIntArray440 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray440[local12] = arg0.method20271();
			}
			this.anIntArray441 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray441[local12] = arg0.method20271();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray441[local12] += arg0.method20271() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4930 = arg0.method20271() * -2109337741;
		} else if (arg1 == 5) {
			this.anInt4932 = arg0.method20269() * 1569202267;
		} else if (arg1 == 6) {
			this.anInt4933 = arg0.method20271() * 37260209;
		} else if (arg1 == 7) {
			this.anInt4936 = arg0.method20271() * 1971108035;
		} else if (arg1 == 8) {
			this.anInt4934 = arg0.method20269() * -1351754639;
		} else if (arg1 == 9) {
			this.anInt4935 = arg0.method20269() * 1578342219;
		} else if (arg1 == 10) {
			this.anInt4937 = arg0.method20269() * -1184372661;
		} else if (arg1 == 11) {
			this.anInt4928 = arg0.method20269() * 375233707;
		} else if (arg1 == 12) {
			local6 = arg0.method20269();
			this.anIntArray442 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray442[local12] = arg0.method20271();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray442[local12] += arg0.method20271() << 16;
			}
		} else {
			@Pc(238) int local238;
			if (arg1 == 13) {
				local6 = arg0.method20271();
				this.anIntArrayArray54 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(219) int local219 = arg0.method20269();
					if (local219 > 0) {
						this.anIntArrayArray54[local12] = new int[local219];
						this.anIntArrayArray54[local12][0] = arg0.method20273();
						for (local238 = 1; local238 < local219; local238++) {
							this.anIntArrayArray54[local12][local238] = arg0.method20271();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean764 = true;
			} else if (arg1 == 15) {
				this.aBoolean766 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19) {
					if (this.anIntArray443 == null) {
						this.anIntArray443 = new int[this.anIntArrayArray54.length];
						for (local6 = 0; local6 < this.anIntArrayArray54.length; local6++) {
							this.anIntArray443[local6] = 255;
						}
					}
					this.anIntArray443[arg0.method20269()] = arg0.method20269();
				} else if (arg1 == 20) {
					if (this.anIntArray444 == null || this.anIntArray445 == null) {
						this.anIntArray444 = new int[this.anIntArrayArray54.length];
						this.anIntArray445 = new int[this.anIntArrayArray54.length];
						for (local6 = 0; local6 < this.anIntArrayArray54.length; local6++) {
							this.anIntArray444[local6] = 256;
							this.anIntArray445[local6] = 256;
						}
					}
					local6 = arg0.method20269();
					this.anIntArray444[local6] = arg0.method20271();
					this.anIntArray445[local6] = arg0.method20271();
				} else if (arg1 == 22) {
					this.anInt4938 = arg0.method20269() * 179147271;
				} else if (arg1 == 23) {
					arg0.method20271();
				} else if (arg1 == 24) {
					local6 = arg0.method20271();
					this.aClass427_1 = this.aClass436_3.aClass429_2.method27928(local6);
				} else if (arg1 == 249) {
					local6 = arg0.method20269();
					if (this.aClass581_32 == null) {
						local12 = Class302.method25670(local6);
						this.aClass581_32 = new Class581(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(443) boolean local443 = arg0.method20269() == 1;
						local238 = arg0.method20273();
						@Pc(456) Class3 local456;
						if (local443) {
							local456 = new Class3_Sub29(arg0.method20283());
						} else {
							local456 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_32.method33241(local456, (long) local238);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)V", line = 134)
	void method28221() {
		if (this.anInt4935 * 394312291 == -1) {
			if (this.aClass427_1 == null || this.aClass427_1.aBooleanArray31 == null) {
				this.anInt4935 = 0;
			} else {
				this.anInt4935 = -1138282858;
			}
		}
		if (this.anInt4937 * 988717411 == -1) {
			if (this.aClass427_1 == null || this.aClass427_1.aBooleanArray31 == null) {
				this.anInt4937 = 0;
			} else {
				this.anInt4937 = 1926221974;
			}
		}
		if (this.anIntArray440 != null) {
			this.anInt4931 = 0;
			for (@Pc(48) int local48 = 0; local48 < this.anIntArray440.length; local48++) {
				this.anInt4931 += this.anIntArray440[local48] * 1251600575;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "()V", line = 134)
	void method28230() {
		if (this.anInt4935 * 394312291 == -1) {
			if (this.aClass427_1 == null || this.aClass427_1.aBooleanArray31 == null) {
				this.anInt4935 = 0;
			} else {
				this.anInt4935 = -1138282858;
			}
		}
		if (this.anInt4937 * 988717411 == -1) {
			if (this.aClass427_1 == null || this.aClass427_1.aBooleanArray31 == null) {
				this.anInt4937 = 0;
			} else {
				this.anInt4937 = 1926221974;
			}
		}
		if (this.anIntArray440 != null) {
			this.anInt4931 = 0;
			for (@Pc(48) int local48 = 0; local48 < this.anIntArray440.length; local48++) {
				this.anInt4931 += this.anIntArray440[local48] * 1251600575;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "()Z", line = 149)
	public boolean method28219() {
		if (this.anIntArray441 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(10) int[] local10 = this.anIntArray441;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) int local20 = local10[local12];
			if (this.aClass436_3.method28014(local20 >>> 16) == null) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "()Z", line = 149)
	public boolean method28222() {
		if (this.anIntArray441 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(10) int[] local10 = this.anIntArray441;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) int local20 = local10[local12];
			if (this.aClass436_3.method28014(local20 >>> 16) == null) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "(I)Z", line = 149)
	public boolean method28236() {
		if (this.anIntArray441 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(10) int[] local10 = this.anIntArray441;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) int local20 = local10[local12];
			if (this.aClass436_3.method28014(local20 >>> 16) == null) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(III)I", line = 164)
	public int method28223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub21 local12 = (Class3_Sub21) this.aClass581_32.method33217((long) arg0);
			return local12 == null ? arg1 : local12.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(II)I", line = 164)
	public int method28226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub21 local12 = (Class3_Sub21) this.aClass581_32.method33217((long) arg0);
			return local12 == null ? arg1 : local12.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "(II)I", line = 164)
	public int method28234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub21 local12 = (Class3_Sub21) this.aClass581_32.method33217((long) arg0);
			return local12 == null ? arg1 : local12.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 171)
	public String method28224(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub29 local12 = (Class3_Sub29) this.aClass581_32.method33217((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject2;
		}
	}

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 171)
	public String method28228(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub29 local12 = (Class3_Sub29) this.aClass581_32.method33217((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject2;
		}
	}

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 171)
	public String method28231(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub29 local12 = (Class3_Sub29) this.aClass581_32.method33217((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject2;
		}
	}

	@OriginalMember(owner = "client!rs", name = "rp", descriptor = "(Lclient!vs;I)V", line = 7160)
	static final void method28237(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class460.method28578(local11, arg0);
	}

	@OriginalMember(owner = "client!rs", name = "wo", descriptor = "(Lclient!vs;I)V", line = 8091)
	static final void method28239(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class3_Sub10.aClass61_1.method12736() ? 1 : 0;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class3_Sub10.aClass61_1.method12737() ? 1 : 0;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class3_Sub10.aClass61_1.method12738() ? 1 : 0;
	}

	@OriginalMember(owner = "client!rs", name = "aij", descriptor = "(Lclient!vs;B)V", line = 10622)
	static final void method28238(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 < 0) {
			local12 = 0;
		}
		client.anInt3089 = (local12 + client.anInt3088 * 873705613) * -1379671259;
	}
}
