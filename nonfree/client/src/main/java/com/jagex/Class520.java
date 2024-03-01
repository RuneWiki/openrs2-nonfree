package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public class Class520 {

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	static final int anInt5289 = 8224;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!vd;")
	Class523 aClass523_15;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	int anInt5287;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	int anInt5288;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "[S")
	short[] aShortArray121;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "[S")
	short[] aShortArray122;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "[S")
	short[] aShortArray123;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "[S")
	short[] aShortArray124;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[B")
	byte[] aByteArray97;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[B")
	byte[] aByteArray98;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public int anInt5294 = -453547717;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	int anInt5290 = -1310164352;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	int anInt5286 = 1325131904;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	int anInt5291 = 0;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	int anInt5292 = 0;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	int anInt5293 = 0;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Z")
	public boolean aBoolean820 = false;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "B")
	byte aByte170 = 0;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	int anInt5295 = -242691911;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 34)
	Class520() {
	}

	@OriginalMember(owner = "client!va", name = "u", descriptor = "(Lclient!ahb;)V", line = 38)
	void method29746(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method29747(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!va", name = "p", descriptor = "(Lclient!ahb;S)V", line = 38)
	void method29760(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method29747(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ahb;II)V", line = 45)
	void method29747(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5288 = arg0.method20375() * -1541619761;
		} else if (arg1 == 2) {
			this.anInt5294 = arg0.method20375() * 453547717;
		} else if (arg1 == 4) {
			this.anInt5290 = arg0.method20271() * -312225547;
		} else if (arg1 == 5) {
			this.anInt5286 = arg0.method20271() * 1251866577;
		} else if (arg1 == 6) {
			this.anInt5291 = arg0.method20271() * -130972863;
		} else if (arg1 == 7) {
			this.anInt5292 = arg0.method20269() * -1254507;
		} else if (arg1 == 8) {
			this.anInt5293 = arg0.method20269() * 1745072109;
		} else if (arg1 == 10) {
			this.aBoolean820 = true;
		} else if (arg1 == 9) {
			this.aByte170 = 3;
			this.anInt5295 = -1261516576;
		} else if (arg1 == 15) {
			this.aByte170 = 3;
			this.anInt5295 = arg0.method20271() * 242691911;
		} else if (arg1 == 16) {
			this.aByte170 = 3;
			this.anInt5295 = arg0.method20275() * 242691911;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.method20269();
				this.aShortArray122 = new short[local128];
				this.aShortArray121 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray122[local138] = (short) arg0.method20271();
					this.aShortArray121[local138] = (short) arg0.method20271();
				}
			} else if (arg1 == 41) {
				local128 = arg0.method20269();
				this.aShortArray124 = new short[local128];
				this.aShortArray123 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray124[local138] = (short) arg0.method20271();
					this.aShortArray123[local138] = (short) arg0.method20271();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.method20271();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray98 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray98[local226] = local224++;
						} else {
							this.aByteArray98[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.method20271();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray97 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray97[local226] = local224++;
						} else {
							this.aByteArray97[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "y", descriptor = "(Lclient!ahb;I)V", line = 45)
	void method29753(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5288 = arg0.method20375() * -1541619761;
		} else if (arg1 == 2) {
			this.anInt5294 = arg0.method20375() * 453547717;
		} else if (arg1 == 4) {
			this.anInt5290 = arg0.method20271() * -312225547;
		} else if (arg1 == 5) {
			this.anInt5286 = arg0.method20271() * 1251866577;
		} else if (arg1 == 6) {
			this.anInt5291 = arg0.method20271() * -130972863;
		} else if (arg1 == 7) {
			this.anInt5292 = arg0.method20269() * -1254507;
		} else if (arg1 == 8) {
			this.anInt5293 = arg0.method20269() * 1745072109;
		} else if (arg1 == 10) {
			this.aBoolean820 = true;
		} else if (arg1 == 9) {
			this.aByte170 = 3;
			this.anInt5295 = -1261516576;
		} else if (arg1 == 15) {
			this.aByte170 = 3;
			this.anInt5295 = arg0.method20271() * 242691911;
		} else if (arg1 == 16) {
			this.aByte170 = 3;
			this.anInt5295 = arg0.method20275() * 242691911;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.method20269();
				this.aShortArray122 = new short[local128];
				this.aShortArray121 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray122[local138] = (short) arg0.method20271();
					this.aShortArray121[local138] = (short) arg0.method20271();
				}
			} else if (arg1 == 41) {
				local128 = arg0.method20269();
				this.aShortArray124 = new short[local128];
				this.aShortArray123 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray124[local138] = (short) arg0.method20271();
					this.aShortArray123[local138] = (short) arg0.method20271();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.method20271();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray98 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray98[local226] = local224++;
						} else {
							this.aByteArray98[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.method20271();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray97 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray97[local226] = local224++;
						} else {
							this.aByteArray97[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Lclient!ahb;I)V", line = 45)
	void method29755(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5288 = arg0.method20375() * -1541619761;
		} else if (arg1 == 2) {
			this.anInt5294 = arg0.method20375() * 453547717;
		} else if (arg1 == 4) {
			this.anInt5290 = arg0.method20271() * -312225547;
		} else if (arg1 == 5) {
			this.anInt5286 = arg0.method20271() * 1251866577;
		} else if (arg1 == 6) {
			this.anInt5291 = arg0.method20271() * -130972863;
		} else if (arg1 == 7) {
			this.anInt5292 = arg0.method20269() * -1254507;
		} else if (arg1 == 8) {
			this.anInt5293 = arg0.method20269() * 1745072109;
		} else if (arg1 == 10) {
			this.aBoolean820 = true;
		} else if (arg1 == 9) {
			this.aByte170 = 3;
			this.anInt5295 = -1261516576;
		} else if (arg1 == 15) {
			this.aByte170 = 3;
			this.anInt5295 = arg0.method20271() * 242691911;
		} else if (arg1 == 16) {
			this.aByte170 = 3;
			this.anInt5295 = arg0.method20275() * 242691911;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.method20269();
				this.aShortArray122 = new short[local128];
				this.aShortArray121 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray122[local138] = (short) arg0.method20271();
					this.aShortArray121[local138] = (short) arg0.method20271();
				}
			} else if (arg1 == 41) {
				local128 = arg0.method20269();
				this.aShortArray124 = new short[local128];
				this.aShortArray123 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray124[local138] = (short) arg0.method20271();
					this.aShortArray123[local138] = (short) arg0.method20271();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.method20271();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray98 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray98[local226] = local224++;
						} else {
							this.aByteArray98[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.method20271();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray97 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray97[local226] = local224++;
						} else {
							this.aByteArray97[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(Lclient!de;ILclient!wi;BI)Lclient!dh;", line = 120)
	public final Class20 method29748(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) byte arg3) {
		return this.method29751(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(Lclient!de;ILclient!wi;B)Lclient!dh;", line = 120)
	public final Class20 method29756(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) byte arg3) {
		return this.method29751(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!va", name = "l", descriptor = "(Lclient!de;IIIIILclient!wi;BI)Lclient!dh;", line = 124)
	public final Class20 method29749(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class71 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte170 == 3 ? this.method29751(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method29751(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!va", name = "z", descriptor = "(Lclient!de;IIIIILclient!wi;B)Lclient!dh;", line = 124)
	public final Class20 method29757(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class71 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte170 == 3 ? this.method29751(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method29751(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!va", name = "j", descriptor = "(Lclient!de;IIIIILclient!wi;B)Lclient!dh;", line = 124)
	public final Class20 method29763(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class71 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte170 == 3 ? this.method29751(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method29751(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!va", name = "h", descriptor = "(Lclient!de;IILclient!ci;Lclient!ci;IIILclient!wi;BB)Lclient!dh;", line = 129)
	public final Class20 method29750(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) Class17 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class71 arg8, @OriginalArg(9) byte arg9) {
		return this.method29751(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@OriginalMember(owner = "client!va", name = "n", descriptor = "(Lclient!de;IILclient!ci;Lclient!ci;IIILclient!wi;B)Lclient!dh;", line = 129)
	public final Class20 method29758(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) Class17 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class71 arg8, @OriginalArg(9) byte arg9) {
		return this.method29751(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(Lclient!de;IILclient!ci;Lclient!ci;IIILclient!wi;B)Lclient!dh;", line = 129)
	public final Class20 method29759(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) Class17 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class71 arg8, @OriginalArg(9) byte arg9) {
		return this.method29751(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@OriginalMember(owner = "client!va", name = "x", descriptor = "(Lclient!de;IZLclient!ci;Lclient!ci;IIIIIIILclient!wi;BI)Lclient!dh;", line = 133)
	final Class20 method29751(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) Class17 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class71 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(10) boolean local10 = arg2 & this.aByte170 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method20035();
		}
		if (this.anInt5286 * -876625615 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5290 * -404858019 != 128 || this.anInt5291 * 809831617 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local10) {
			local1 |= 0x7;
		}
		@Pc(58) Class161 local58 = this.aClass523_15.aClass161_60;
		@Pc(84) Class20 local84;
		synchronized (this.aClass523_15.aClass161_60) {
			local84 = (Class20) this.aClass523_15.aClass161_60.method23219((long) ((this.anInt5287 = (this.anInt5287 * 789935545 | -427632027 * arg0.anInt2463 << 29) * -73138039) * 789935545));
		}
		if (local84 == null || arg0.method17117(local84.method5327(), local1) != 0) {
			if (local84 != null) {
				local1 = arg0.method17102(local1, local84.method5327());
			}
			@Pc(111) int local111 = local1;
			if (this.aShortArray122 != null) {
				local111 = local1 | 0x4000;
			}
			if (this.aShortArray124 != null) {
				local111 |= 0x8000;
			}
			@Pc(137) Class138 local137 = Class138.method22955(this.aClass523_15.aClass359_95, this.anInt5288 * -2075400401, 0);
			if (local137 == null) {
				return null;
			}
			if (local137.anInt3415 < 13) {
				local137.method22968(2);
			}
			local84 = arg0.method17100(local137, local111, this.aClass523_15.anInt5296 * -1634790317, this.anInt5292 * 115972029 + 64, this.anInt5293 * -1160509979 + 850);
			@Pc(176) int local176;
			if (this.aShortArray122 != null) {
				for (local176 = 0; local176 < this.aShortArray122.length; local176++) {
					local84.method5415(this.aShortArray122[local176], this.aShortArray121[local176]);
				}
			}
			if (this.aShortArray124 != null) {
				for (local176 = 0; local176 < this.aShortArray124.length; local176++) {
					local84.method5372(this.aShortArray124[local176], this.aShortArray123[local176]);
				}
			}
			local84.method5326(local1);
			@Pc(224) Class161 local224 = this.aClass523_15.aClass161_60;
			synchronized (this.aClass523_15.aClass161_60) {
				this.aClass523_15.aClass161_60.method23222(local84, (long) ((this.anInt5287 = (this.anInt5287 * 789935545 | arg0.anInt2463 * -427632027 << 29) * -73138039) * 789935545));
			}
		}
		@Pc(263) Class20 local263 = local84.method5430(arg13, local1, true);
		if (arg12 != null) {
			arg12.method20066(local263, 0);
		}
		if (this.anInt5290 * -404858019 != 128 || this.anInt5286 * -876625615 != 128) {
			local263.method5335(this.anInt5290 * -404858019, this.anInt5286 * -876625615, this.anInt5290 * -404858019);
		}
		if (this.anInt5291 * 809831617 != 0) {
			if (this.anInt5291 * 809831617 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5291 * 809831617 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5291 * 809831617 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local263.method5329(arg8);
		}
		if (local10) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local263.method5331(arg9);
				}
				if (arg10 != 0) {
					local263.method5482(arg10);
				}
				if (arg11 != 0) {
					local263.method5333(0, arg11, 0);
				}
			} else {
				local263.method5336(this.aByte170, this.anInt5295 * -1109538185, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local263.method5326(arg1);
		return local263;
	}

	@OriginalMember(owner = "client!va", name = "q", descriptor = "()Z", line = 192)
	public final boolean method29745() {
		return this.anInt5288 * -2075400401 == -1 ? true : this.aClass523_15.aClass359_95.method26673(this.anInt5288 * -2075400401, 0);
	}

	@OriginalMember(owner = "client!va", name = "s", descriptor = "(I)Z", line = 192)
	public final boolean method29752() {
		return this.anInt5288 * -2075400401 == -1 ? true : this.aClass523_15.aClass359_95.method26673(this.anInt5288 * -2075400401, 0);
	}

	@OriginalMember(owner = "client!va", name = "m", descriptor = "()Z", line = 192)
	public final boolean method29754() {
		return this.anInt5288 * -2075400401 == -1 ? true : this.aClass523_15.aClass359_95.method26673(this.anInt5288 * -2075400401, 0);
	}

	@OriginalMember(owner = "client!va", name = "r", descriptor = "()Z", line = 192)
	public final boolean method29761() {
		return this.anInt5288 * -2075400401 == -1 ? true : this.aClass523_15.aClass359_95.method26673(this.anInt5288 * -2075400401, 0);
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "()Z", line = 192)
	public final boolean method29762() {
		return this.anInt5288 * -2075400401 == -1 ? true : this.aClass523_15.aClass359_95.method26673(this.anInt5288 * -2075400401, 0);
	}

	@OriginalMember(owner = "client!va", name = "ah", descriptor = "(I)V", line = 1062)
	static void method29766() {
		Class615.aClass82_3.method21599();
		Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
		Class615.aClass82_3.aClass301_2 = null;
		Class615.aClass82_3.aClass301_3 = null;
		Class615.aClass82_3.aClass301_1 = null;
		Class615.aClass82_3.aClass301_4 = null;
		Class615.aClass82_3.anInt2915 = 0;
		Class615.aClass82_3.anInt2918 = 0;
		client.anInt3041 = 0;
		Class564.method32904();
		Class179.method23535();
		@Pc(32) int local32;
		for (local32 = 0; local32 < 2048; local32++) {
			client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local32] = null;
		}
		Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 = null;
		for (local32 = 0; local32 < client.anInt3054 * -453205259; local32++) {
			@Pc(56) Class26_Sub1_Sub1_Sub1 local56 = (Class26_Sub1_Sub1_Sub1) client.aClass3_Sub29Array1[local32].anObject2;
			if (local56 != null) {
				local56.anInt2364 = 1954799489;
			}
		}
		Class53.method20619();
		Class375.method27232(Class205.method24189());
		Class166.method23342(5);
		for (local32 = 0; local32 < 112; local32++) {
			client.aBooleanArray19[local32] = true;
		}
		Class75.method19526(Class615.aClass82_3);
		Class413.aClass507_1 = null;
		Class230.aLong247 = 0L;
		Class161.method23267();
		Class302.aClass10_Sub1_1.method725();
	}

	@OriginalMember(owner = "client!va", name = "aip", descriptor = "(Lclient!vs;I)V", line = 10497)
	static final void method29764(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean565 ? 1 : 0;
	}

	@OriginalMember(owner = "client!va", name = "ata", descriptor = "(Lclient!vs;B)V", line = 12398)
	static final void method29765(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13372() ? 1 : 0;
	}
}
