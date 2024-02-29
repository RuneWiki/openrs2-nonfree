package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yw")
public class Class679 implements Interface12 {

	@OriginalMember(owner = "client!yw", name = "p", descriptor = "I")
	static final int anInt5809 = 8224;

	@OriginalMember(owner = "client!yw", name = "hs", descriptor = "Lclient!aof;")
	public static Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!yw", name = "s", descriptor = "[B")
	byte[] aByteArray105;

	@OriginalMember(owner = "client!yw", name = "d", descriptor = "[B")
	byte[] aByteArray106;

	@OriginalMember(owner = "client!yw", name = "w", descriptor = "[S")
	short[] aShortArray150;

	@OriginalMember(owner = "client!yw", name = "t", descriptor = "[S")
	short[] aShortArray151;

	@OriginalMember(owner = "client!yw", name = "q", descriptor = "[S")
	short[] aShortArray152;

	@OriginalMember(owner = "client!yw", name = "x", descriptor = "[S")
	short[] aShortArray153;

	@OriginalMember(owner = "client!yw", name = "l", descriptor = "I")
	int anInt5808;

	@OriginalMember(owner = "client!yw", name = "y", descriptor = "I")
	public int anInt5810 = -430182369;

	@OriginalMember(owner = "client!yw", name = "r", descriptor = "I")
	int anInt5814 = -145336960;

	@OriginalMember(owner = "client!yw", name = "g", descriptor = "I")
	int anInt5811 = 2006302592;

	@OriginalMember(owner = "client!yw", name = "z", descriptor = "I")
	int anInt5812 = 0;

	@OriginalMember(owner = "client!yw", name = "j", descriptor = "I")
	int anInt5807 = 0;

	@OriginalMember(owner = "client!yw", name = "i", descriptor = "I")
	int anInt5813 = 0;

	@OriginalMember(owner = "client!yw", name = "k", descriptor = "Z")
	public boolean aBoolean860 = false;

	@OriginalMember(owner = "client!yw", name = "u", descriptor = "B")
	byte aByte176 = 0;

	@OriginalMember(owner = "client!yw", name = "e", descriptor = "I")
	int anInt5815 = 827440845;

	@OriginalMember(owner = "client!yw", name = "v", descriptor = "I")
	final int anInt5806;

	@OriginalMember(owner = "client!yw", name = "c", descriptor = "Lclient!yg;")
	final Class144 aClass144_1;

	@OriginalMember(owner = "client!yw", name = "<init>", descriptor = "(ILclient!yg;)V", line = 34)
	Class679(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1) {
		this.anInt5806 = arg0 * 301019577;
		this.aClass144_1 = arg1;
	}

	@OriginalMember(owner = "client!yw", name = "v", descriptor = "(Lclient!akv;)V", line = 41)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method36037(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!yw", name = "p", descriptor = "(Lclient!akv;B)V", line = 41)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method36037(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!yw", name = "l", descriptor = "(Lclient!akv;)V", line = 41)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method36037(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!yw", name = "y", descriptor = "(Lclient!akv;)V", line = 41)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method36037(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!yw", name = "q", descriptor = "(Lclient!akv;IB)V", line = 48)
	void method36037(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5808 = arg0.method22549() * 276801009;
		} else if (arg1 == 2) {
			this.anInt5810 = arg0.method22549() * 430182369;
		} else if (arg1 == 4) {
			this.anInt5814 = arg0.method22483() * -1913738069;
		} else if (arg1 == 5) {
			this.anInt5811 = arg0.method22483() * 518990719;
		} else if (arg1 == 6) {
			this.anInt5812 = arg0.method22483() * -181056353;
		} else if (arg1 == 7) {
			this.anInt5807 = arg0.method22478() * -1945897667;
		} else if (arg1 == 8) {
			this.anInt5813 = arg0.method22478() * 338099613;
		} else if (arg1 == 10) {
			this.aBoolean860 = true;
		} else if (arg1 == 9) {
			this.aByte176 = 3;
			this.anInt5815 = -1645312416;
		} else if (arg1 == 15) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22483() * -827440845;
		} else if (arg1 == 16) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22500() * -827440845;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.method22478();
				this.aShortArray150 = new short[local128];
				this.aShortArray151 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray150[local138] = (short) arg0.method22483();
					this.aShortArray151[local138] = (short) arg0.method22483();
				}
			} else if (arg1 == 41) {
				local128 = arg0.method22478();
				this.aShortArray152 = new short[local128];
				this.aShortArray153 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray152[local138] = (short) arg0.method22483();
					this.aShortArray153[local138] = (short) arg0.method22483();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray106 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray106[local226] = local224++;
						} else {
							this.aByteArray106[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray105 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray105[local226] = local224++;
						} else {
							this.aByteArray105[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yw", name = "i", descriptor = "(Lclient!akv;I)V", line = 48)
	void method36038(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5808 = arg0.method22549() * 276801009;
		} else if (arg1 == 2) {
			this.anInt5810 = arg0.method22549() * 430182369;
		} else if (arg1 == 4) {
			this.anInt5814 = arg0.method22483() * -1913738069;
		} else if (arg1 == 5) {
			this.anInt5811 = arg0.method22483() * 518990719;
		} else if (arg1 == 6) {
			this.anInt5812 = arg0.method22483() * -181056353;
		} else if (arg1 == 7) {
			this.anInt5807 = arg0.method22478() * -1945897667;
		} else if (arg1 == 8) {
			this.anInt5813 = arg0.method22478() * 338099613;
		} else if (arg1 == 10) {
			this.aBoolean860 = true;
		} else if (arg1 == 9) {
			this.aByte176 = 3;
			this.anInt5815 = -1645312416;
		} else if (arg1 == 15) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22483() * -827440845;
		} else if (arg1 == 16) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22500() * -827440845;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.method22478();
				this.aShortArray150 = new short[local128];
				this.aShortArray151 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray150[local138] = (short) arg0.method22483();
					this.aShortArray151[local138] = (short) arg0.method22483();
				}
			} else if (arg1 == 41) {
				local128 = arg0.method22478();
				this.aShortArray152 = new short[local128];
				this.aShortArray153 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray152[local138] = (short) arg0.method22483();
					this.aShortArray153[local138] = (short) arg0.method22483();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray106 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray106[local226] = local224++;
						} else {
							this.aByteArray106[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray105 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray105[local226] = local224++;
						} else {
							this.aByteArray105[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yw", name = "z", descriptor = "(Lclient!akv;I)V", line = 48)
	void method36039(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5808 = arg0.method22549() * 276801009;
		} else if (arg1 == 2) {
			this.anInt5810 = arg0.method22549() * 430182369;
		} else if (arg1 == 4) {
			this.anInt5814 = arg0.method22483() * -1913738069;
		} else if (arg1 == 5) {
			this.anInt5811 = arg0.method22483() * 518990719;
		} else if (arg1 == 6) {
			this.anInt5812 = arg0.method22483() * -181056353;
		} else if (arg1 == 7) {
			this.anInt5807 = arg0.method22478() * -1945897667;
		} else if (arg1 == 8) {
			this.anInt5813 = arg0.method22478() * 338099613;
		} else if (arg1 == 10) {
			this.aBoolean860 = true;
		} else if (arg1 == 9) {
			this.aByte176 = 3;
			this.anInt5815 = -1645312416;
		} else if (arg1 == 15) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22483() * -827440845;
		} else if (arg1 == 16) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22500() * -827440845;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.method22478();
				this.aShortArray150 = new short[local128];
				this.aShortArray151 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray150[local138] = (short) arg0.method22483();
					this.aShortArray151[local138] = (short) arg0.method22483();
				}
			} else if (arg1 == 41) {
				local128 = arg0.method22478();
				this.aShortArray152 = new short[local128];
				this.aShortArray153 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray152[local138] = (short) arg0.method22483();
					this.aShortArray153[local138] = (short) arg0.method22483();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray106 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray106[local226] = local224++;
						} else {
							this.aByteArray106[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray105 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray105[local226] = local224++;
						} else {
							this.aByteArray105[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yw", name = "j", descriptor = "(Lclient!akv;I)V", line = 48)
	void method36040(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5808 = arg0.method22549() * 276801009;
		} else if (arg1 == 2) {
			this.anInt5810 = arg0.method22549() * 430182369;
		} else if (arg1 == 4) {
			this.anInt5814 = arg0.method22483() * -1913738069;
		} else if (arg1 == 5) {
			this.anInt5811 = arg0.method22483() * 518990719;
		} else if (arg1 == 6) {
			this.anInt5812 = arg0.method22483() * -181056353;
		} else if (arg1 == 7) {
			this.anInt5807 = arg0.method22478() * -1945897667;
		} else if (arg1 == 8) {
			this.anInt5813 = arg0.method22478() * 338099613;
		} else if (arg1 == 10) {
			this.aBoolean860 = true;
		} else if (arg1 == 9) {
			this.aByte176 = 3;
			this.anInt5815 = -1645312416;
		} else if (arg1 == 15) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22483() * -827440845;
		} else if (arg1 == 16) {
			this.aByte176 = 3;
			this.anInt5815 = arg0.method22500() * -827440845;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.method22478();
				this.aShortArray150 = new short[local128];
				this.aShortArray151 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray150[local138] = (short) arg0.method22483();
					this.aShortArray151[local138] = (short) arg0.method22483();
				}
			} else if (arg1 == 41) {
				local128 = arg0.method22478();
				this.aShortArray152 = new short[local128];
				this.aShortArray153 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray152[local138] = (short) arg0.method22483();
					this.aShortArray153[local138] = (short) arg0.method22483();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray106 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray106[local226] = local224++;
						} else {
							this.aByteArray106[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.method22483();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray105 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray105[local226] = local224++;
						} else {
							this.aByteArray105[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yw", name = "y", descriptor = "(Ljava/lang/CharSequence;B)I", line = 76)
	public static int method36041(@OriginalArg(0) CharSequence arg0) {
		return Class526.method30676(arg0, 10, true);
	}

	@OriginalMember(owner = "client!yw", name = "x", descriptor = "(Lclient!dx;ILclient!zx;BB)Lclient!dv;", line = 123)
	public final Class84 method36042(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) byte arg3) {
		return this.method36053(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!yw", name = "k", descriptor = "(Lclient!dx;ILclient!zx;B)Lclient!dv;", line = 123)
	public final Class84 method36043(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) byte arg3) {
		return this.method36053(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!yw", name = "u", descriptor = "(Lclient!dx;ILclient!zx;B)Lclient!dv;", line = 123)
	public final Class84 method36044(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) byte arg3) {
		return this.method36053(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!yw", name = "f", descriptor = "(Lclient!dx;IIIIILclient!zx;B)Lclient!dv;", line = 127)
	public final Class84 method36045(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class151 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte176 == 3 ? this.method36053(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method36053(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!yw", name = "e", descriptor = "(Lclient!dx;IIIIILclient!zx;B)Lclient!dv;", line = 127)
	public final Class84 method36046(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class151 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte176 == 3 ? this.method36053(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method36053(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!yw", name = "b", descriptor = "(Lclient!dx;IIIIILclient!zx;B)Lclient!dv;", line = 127)
	public final Class84 method36047(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class151 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte176 == 3 ? this.method36053(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method36053(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!yw", name = "o", descriptor = "(Lclient!dx;IIIIILclient!zx;B)Lclient!dv;", line = 127)
	public final Class84 method36048(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class151 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte176 == 3 ? this.method36053(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method36053(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!yw", name = "d", descriptor = "(Lclient!dx;IIIIILclient!zx;BI)Lclient!dv;", line = 127)
	public final Class84 method36049(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class151 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte176 == 3 ? this.method36053(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method36053(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!yw", name = "s", descriptor = "(Lclient!dx;IILclient!cj;Lclient!cj;IIILclient!zx;BB)Lclient!dv;", line = 132)
	public final Class84 method36050(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) Class88 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class151 arg8, @OriginalArg(9) byte arg9) {
		return this.method36053(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@OriginalMember(owner = "client!yw", name = "n", descriptor = "(Lclient!dx;IILclient!cj;Lclient!cj;IIILclient!zx;B)Lclient!dv;", line = 132)
	public final Class84 method36051(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) Class88 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class151 arg8, @OriginalArg(9) byte arg9) {
		return this.method36053(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@OriginalMember(owner = "client!yw", name = "a", descriptor = "(Lclient!dx;IILclient!cj;Lclient!cj;IIILclient!zx;B)Lclient!dv;", line = 132)
	public final Class84 method36052(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) Class88 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class151 arg8, @OriginalArg(9) byte arg9) {
		return this.method36053(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@OriginalMember(owner = "client!yw", name = "r", descriptor = "(Lclient!dx;IZLclient!cj;Lclient!cj;IIIIIIILclient!zx;BI)Lclient!dv;", line = 136)
	final Class84 method36053(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) Class88 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class151 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte176 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23432();
		}
		if (this.anInt5811 * -942893953 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5812 * 758959967 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(57) Class232 local57 = this.aClass144_1.aClass232_30;
		@Pc(76) Class84 local76;
		synchronized (this.aClass144_1.aClass232_30) {
			local76 = (Class84) this.aClass144_1.aClass232_30.method25835((long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
		}
		if (local76 == null || arg0.method20116(local76.method6875(), local1) != 0) {
			if (local76 != null) {
				local1 = arg0.method20117(local1, local76.method6875());
			}
			@Pc(103) int local103 = local1;
			if (this.aShortArray150 != null) {
				local103 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local103 |= 0x8000;
			}
			@Pc(128) Class216 local128 = Class216.method25655(this.aClass144_1.aClass478_44, this.anInt5808 * 412003089, 0);
			if (local128 == null) {
				return null;
			}
			if (local128.anInt3733 < 13) {
				local128.method25695(2);
			}
			local76 = arg0.method20115(local128, local103, this.aClass144_1.anInt2040 * 1770536517, this.anInt5807 * -1023243755 + 64, this.anInt5813 * -616402763 + 850);
			@Pc(167) int local167;
			if (this.aShortArray150 != null) {
				for (local167 = 0; local167 < this.aShortArray150.length; local167++) {
					local76.method6835(this.aShortArray150[local167], this.aShortArray151[local167]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local167 = 0; local167 < this.aShortArray152.length; local167++) {
					local76.method6890(this.aShortArray152[local167], this.aShortArray153[local167]);
				}
			}
			local76.method6795(local1);
			@Pc(215) Class232 local215 = this.aClass144_1.aClass232_30;
			synchronized (this.aClass144_1.aClass232_30) {
				this.aClass144_1.aClass232_30.method25844(local76, (long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
			}
		}
		@Pc(247) Class84 local247 = local76.method6794(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23438(local247, 0);
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5811 * -942893953 != 128) {
			local247.method6803(this.anInt5814 * 721939971, this.anInt5811 * -942893953, this.anInt5814 * 721939971);
		}
		if (this.anInt5812 * 758959967 != 0) {
			if (this.anInt5812 * 758959967 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5812 * 758959967 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5812 * 758959967 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method6797(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method6799(arg9);
				}
				if (arg10 != 0) {
					local247.method6800(arg10);
				}
				if (arg11 != 0) {
					local247.method6872(0, arg11, 0);
				}
			} else {
				local247.method6804(this.aByte176, this.anInt5815 * -1790467589, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method6795(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yw", name = "m", descriptor = "(Lclient!dx;IZLclient!cj;Lclient!cj;IIIIIIILclient!zx;B)Lclient!dv;", line = 136)
	final Class84 method36054(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) Class88 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class151 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte176 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23432();
		}
		if (this.anInt5811 * -942893953 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5812 * 758959967 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(57) Class232 local57 = this.aClass144_1.aClass232_30;
		@Pc(76) Class84 local76;
		synchronized (this.aClass144_1.aClass232_30) {
			local76 = (Class84) this.aClass144_1.aClass232_30.method25835((long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
		}
		if (local76 == null || arg0.method20116(local76.method6875(), local1) != 0) {
			if (local76 != null) {
				local1 = arg0.method20117(local1, local76.method6875());
			}
			@Pc(103) int local103 = local1;
			if (this.aShortArray150 != null) {
				local103 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local103 |= 0x8000;
			}
			@Pc(128) Class216 local128 = Class216.method25655(this.aClass144_1.aClass478_44, this.anInt5808 * 412003089, 0);
			if (local128 == null) {
				return null;
			}
			if (local128.anInt3733 < 13) {
				local128.method25695(2);
			}
			local76 = arg0.method20115(local128, local103, this.aClass144_1.anInt2040 * 1770536517, this.anInt5807 * -1023243755 + 64, this.anInt5813 * -616402763 + 850);
			@Pc(167) int local167;
			if (this.aShortArray150 != null) {
				for (local167 = 0; local167 < this.aShortArray150.length; local167++) {
					local76.method6835(this.aShortArray150[local167], this.aShortArray151[local167]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local167 = 0; local167 < this.aShortArray152.length; local167++) {
					local76.method6890(this.aShortArray152[local167], this.aShortArray153[local167]);
				}
			}
			local76.method6795(local1);
			@Pc(215) Class232 local215 = this.aClass144_1.aClass232_30;
			synchronized (this.aClass144_1.aClass232_30) {
				this.aClass144_1.aClass232_30.method25844(local76, (long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
			}
		}
		@Pc(247) Class84 local247 = local76.method6794(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23438(local247, 0);
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5811 * -942893953 != 128) {
			local247.method6803(this.anInt5814 * 721939971, this.anInt5811 * -942893953, this.anInt5814 * 721939971);
		}
		if (this.anInt5812 * 758959967 != 0) {
			if (this.anInt5812 * 758959967 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5812 * 758959967 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5812 * 758959967 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method6797(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method6799(arg9);
				}
				if (arg10 != 0) {
					local247.method6800(arg10);
				}
				if (arg11 != 0) {
					local247.method6872(0, arg11, 0);
				}
			} else {
				local247.method6804(this.aByte176, this.anInt5815 * -1790467589, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method6795(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yw", name = "h", descriptor = "(Lclient!dx;IZLclient!cj;Lclient!cj;IIIIIIILclient!zx;B)Lclient!dv;", line = 136)
	final Class84 method36055(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) Class88 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class151 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte176 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23432();
		}
		if (this.anInt5811 * -942893953 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5812 * 758959967 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(57) Class232 local57 = this.aClass144_1.aClass232_30;
		@Pc(76) Class84 local76;
		synchronized (this.aClass144_1.aClass232_30) {
			local76 = (Class84) this.aClass144_1.aClass232_30.method25835((long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
		}
		if (local76 == null || arg0.method20116(local76.method6875(), local1) != 0) {
			if (local76 != null) {
				local1 = arg0.method20117(local1, local76.method6875());
			}
			@Pc(103) int local103 = local1;
			if (this.aShortArray150 != null) {
				local103 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local103 |= 0x8000;
			}
			@Pc(128) Class216 local128 = Class216.method25655(this.aClass144_1.aClass478_44, this.anInt5808 * 412003089, 0);
			if (local128 == null) {
				return null;
			}
			if (local128.anInt3733 < 13) {
				local128.method25695(2);
			}
			local76 = arg0.method20115(local128, local103, this.aClass144_1.anInt2040 * 1770536517, this.anInt5807 * -1023243755 + 64, this.anInt5813 * -616402763 + 850);
			@Pc(167) int local167;
			if (this.aShortArray150 != null) {
				for (local167 = 0; local167 < this.aShortArray150.length; local167++) {
					local76.method6835(this.aShortArray150[local167], this.aShortArray151[local167]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local167 = 0; local167 < this.aShortArray152.length; local167++) {
					local76.method6890(this.aShortArray152[local167], this.aShortArray153[local167]);
				}
			}
			local76.method6795(local1);
			@Pc(215) Class232 local215 = this.aClass144_1.aClass232_30;
			synchronized (this.aClass144_1.aClass232_30) {
				this.aClass144_1.aClass232_30.method25844(local76, (long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
			}
		}
		@Pc(247) Class84 local247 = local76.method6794(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23438(local247, 0);
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5811 * -942893953 != 128) {
			local247.method6803(this.anInt5814 * 721939971, this.anInt5811 * -942893953, this.anInt5814 * 721939971);
		}
		if (this.anInt5812 * 758959967 != 0) {
			if (this.anInt5812 * 758959967 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5812 * 758959967 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5812 * 758959967 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method6797(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method6799(arg9);
				}
				if (arg10 != 0) {
					local247.method6800(arg10);
				}
				if (arg11 != 0) {
					local247.method6872(0, arg11, 0);
				}
			} else {
				local247.method6804(this.aByte176, this.anInt5815 * -1790467589, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method6795(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yw", name = "aj", descriptor = "(Lclient!dx;IZLclient!cj;Lclient!cj;IIIIIIILclient!zx;B)Lclient!dv;", line = 136)
	final Class84 method36056(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) Class88 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class151 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte176 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23432();
		}
		if (this.anInt5811 * -942893953 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5812 * 758959967 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(57) Class232 local57 = this.aClass144_1.aClass232_30;
		@Pc(76) Class84 local76;
		synchronized (this.aClass144_1.aClass232_30) {
			local76 = (Class84) this.aClass144_1.aClass232_30.method25835((long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
		}
		if (local76 == null || arg0.method20116(local76.method6875(), local1) != 0) {
			if (local76 != null) {
				local1 = arg0.method20117(local1, local76.method6875());
			}
			@Pc(103) int local103 = local1;
			if (this.aShortArray150 != null) {
				local103 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local103 |= 0x8000;
			}
			@Pc(128) Class216 local128 = Class216.method25655(this.aClass144_1.aClass478_44, this.anInt5808 * 412003089, 0);
			if (local128 == null) {
				return null;
			}
			if (local128.anInt3733 < 13) {
				local128.method25695(2);
			}
			local76 = arg0.method20115(local128, local103, this.aClass144_1.anInt2040 * 1770536517, this.anInt5807 * -1023243755 + 64, this.anInt5813 * -616402763 + 850);
			@Pc(167) int local167;
			if (this.aShortArray150 != null) {
				for (local167 = 0; local167 < this.aShortArray150.length; local167++) {
					local76.method6835(this.aShortArray150[local167], this.aShortArray151[local167]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local167 = 0; local167 < this.aShortArray152.length; local167++) {
					local76.method6890(this.aShortArray152[local167], this.aShortArray153[local167]);
				}
			}
			local76.method6795(local1);
			@Pc(215) Class232 local215 = this.aClass144_1.aClass232_30;
			synchronized (this.aClass144_1.aClass232_30) {
				this.aClass144_1.aClass232_30.method25844(local76, (long) (this.anInt5806 * 319915145 | arg0.anInt2780 * 2098753835 << 29));
			}
		}
		@Pc(247) Class84 local247 = local76.method6794(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23438(local247, 0);
		}
		if (this.anInt5814 * 721939971 != 128 || this.anInt5811 * -942893953 != 128) {
			local247.method6803(this.anInt5814 * 721939971, this.anInt5811 * -942893953, this.anInt5814 * 721939971);
		}
		if (this.anInt5812 * 758959967 != 0) {
			if (this.anInt5812 * 758959967 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5812 * 758959967 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5812 * 758959967 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method6797(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method6799(arg9);
				}
				if (arg10 != 0) {
					local247.method6800(arg10);
				}
				if (arg11 != 0) {
					local247.method6872(0, arg11, 0);
				}
			} else {
				local247.method6804(this.aByte176, this.anInt5815 * -1790467589, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method6795(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yw", name = "g", descriptor = "(I)Z", line = 195)
	public final boolean method36057() {
		return this.anInt5808 * 412003089 == -1 ? true : this.aClass144_1.aClass478_44.method29727(this.anInt5808 * 412003089, 0);
	}

	@OriginalMember(owner = "client!yw", name = "ag", descriptor = "()Z", line = 195)
	public final boolean method36058() {
		return this.anInt5808 * 412003089 == -1 ? true : this.aClass144_1.aClass478_44.method29727(this.anInt5808 * 412003089, 0);
	}

	@OriginalMember(owner = "client!yw", name = "ai", descriptor = "()Z", line = 195)
	public final boolean method36059() {
		return this.anInt5808 * 412003089 == -1 ? true : this.aClass144_1.aClass478_44.method29727(this.anInt5808 * 412003089, 0);
	}

	@OriginalMember(owner = "client!yw", name = "c", descriptor = "(I)V", line = 199)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!yw", name = "t", descriptor = "()V", line = 199)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!yw", name = "w", descriptor = "()V", line = 199)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!yw", name = "es", descriptor = "(II)V", line = 890)
	public static void method36060(@OriginalArg(0) int arg0) {
		@Pc(5) Class1 local5 = (Class1) Class136_Sub1.aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class1();
		}
		local5.anInt2 = Class136_Sub1.anInt1697 * -1551336507;
		local5.anInt1 = Class136_Sub1.anInt1708 * -1184677759;
		Class136_Sub1.aHashMap4.put(arg0, local5);
	}
}
