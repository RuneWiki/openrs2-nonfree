package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public class Class298 {

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "Lclient!zl;")
	static Class694 aClass694_1;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "[I")
	int[] anIntArray418;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "[B")
	byte[] aByteArray73;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "[I")
	int[] anIntArray419;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B)V", line = 8)
	public Class298(@OriginalArg(0) byte[] arg0) {
		@Pc(4) int local4 = arg0.length;
		this.anIntArray418 = new int[local4];
		this.aByteArray73 = arg0;
		@Pc(14) int[] local14 = new int[33];
		this.anIntArray419 = new int[8];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
			@Pc(29) byte local29 = arg0[local22];
			if (local29 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local29;
				@Pc(42) int local42 = local14[local29];
				this.anIntArray418[local22] = local42;
				@Pc(58) int local58;
				@Pc(67) int local67;
				@Pc(74) int local74;
				@Pc(83) int local83;
				if ((local42 & local38) == 0) {
					local58 = local42 | local38;
					for (local67 = local29 - 1; local67 >= 1; local67--) {
						local74 = local14[local67];
						if (local74 != local42) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local74 & local83) != 0) {
							local14[local67] = local14[local67 - 1];
							break;
						}
						local14[local67] = local74 | local83;
					}
				} else {
					local58 = local14[local29 - 1];
				}
				local14[local29] = local58;
				for (local67 = local29 + 1; local67 <= 32; local67++) {
					if (local42 == local14[local67]) {
						local14[local67] = local58;
					}
				}
				local67 = 0;
				for (local74 = 0; local74 < local29; local74++) {
					local83 = Integer.MIN_VALUE >>> local74;
					if ((local42 & local83) == 0) {
						local67++;
					} else {
						if (this.anIntArray419[local67] == 0) {
							this.anIntArray419[local67] = local20;
						}
						local67 = this.anIntArray419[local67];
					}
					if (local67 >= this.anIntArray419.length) {
						@Pc(170) int[] local170 = new int[this.anIntArray419.length * 2];
						for (@Pc(172) int local172 = 0; local172 < this.anIntArray419.length; local172++) {
							local170[local172] = this.anIntArray419[local172];
						}
						this.anIntArray419 = local170;
					}
					local83 >>>= 0x1;
				}
				this.anIntArray419[local67] = ~local22;
				if (local67 >= local20) {
					local20 = local67 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "(B)V", line = 18)
	public static void method27055() throws RuntimeException {
		if (!Class508.aString221.startsWith("win")) {
			return;
		}
		Class418.method28682();
		@Pc(7) Object local7 = null;
		@Pc(9) String local9 = Class636.aString238;
		@Pc(14) File local14 = new File(local9);
		if (!local14.isFile()) {
			throw new RuntimeException();
		}
		if (!local14.canRead()) {
			throw new RuntimeException();
		}
		if (Class142.aClass142_4 == Class636.aClass142_5) {
			throw new RuntimeException();
		}
		try {
			Class257.aProcess1 = (new ProcessBuilder(new String[] { local9 })).start();
			Class636.aClass142_5 = Class142.aClass142_4;
		} catch (@Pc(50) IOException local50) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(IIIIIILclient!ve;B)V", line = 61)
	static void method27056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class594 arg6) {
		@Pc(1) Class77_Sub4 local1 = null;
		for (@Pc(6) Class77_Sub4 local6 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36395(); local6 != null; local6 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36406()) {
			if (arg0 == local6.anInt1456 * -511427777 && local6.anInt1452 * -1522052283 == arg1 && local6.anInt1454 * -1246362377 == arg2 && arg3 == local6.anInt1459 * -1831835741) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class77_Sub4();
			local1.anInt1456 = arg0 * -453954369;
			local1.anInt1459 = arg3 * 2108621835;
			local1.anInt1452 = arg1 * 1402161037;
			local1.anInt1454 = arg2 * 2107243719;
			Class77_Sub4.aClass695_18.method36383(local1);
		}
		local1.anInt1453 = arg4 * -1796323797;
		local1.anInt1458 = arg5 * -804529983;
		local1.aClass594_1 = arg6;
		local1.aBoolean323 = true;
		local1.aBoolean324 = false;
	}

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "([BII[BII)I", line = 63)
	int method27057(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray418[local18];
			@Pc(28) byte local28 = this.aByteArray73[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(47) int local47 = local5 >> 3;
			@Pc(51) int local51 = local5 & 0x7;
			local1 &= -local51 >> 31;
			@Pc(68) int local68 = local47 + (local28 + local51 - 1 >> 3);
			@Pc(69) int local69 = local51 + 24;
			arg3[local47] = (byte) (local1 |= local23 >>> local69);
			if (local47 < local68) {
				local47++;
				local51 = local69 - 8;
				arg3[local47] = (byte) (local1 = local23 >>> local51);
				if (local47 < local68) {
					local47++;
					local51 -= 8;
					arg3[local47] = (byte) (local1 = local23 >>> local51);
					if (local47 < local68) {
						local47++;
						local51 -= 8;
						arg3[local47] = (byte) (local1 = local23 >>> local51);
						if (local47 < local68) {
							local47++;
							local51 -= 8;
							arg3[local47] = (byte) (local1 = local23 << -local51);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "([BII[BI)I", line = 63)
	int method27058(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray418[local18];
			@Pc(28) byte local28 = this.aByteArray73[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(47) int local47 = local5 >> 3;
			@Pc(51) int local51 = local5 & 0x7;
			local1 &= -local51 >> 31;
			@Pc(68) int local68 = local47 + (local28 + local51 - 1 >> 3);
			@Pc(69) int local69 = local51 + 24;
			arg3[local47] = (byte) (local1 |= local23 >>> local69);
			if (local47 < local68) {
				local47++;
				local51 = local69 - 8;
				arg3[local47] = (byte) (local1 = local23 >>> local51);
				if (local47 < local68) {
					local47++;
					local51 -= 8;
					arg3[local47] = (byte) (local1 = local23 >>> local51);
					if (local47 < local68) {
						local47++;
						local51 -= 8;
						arg3[local47] = (byte) (local1 = local23 >>> local51);
						if (local47 < local68) {
							local47++;
							local51 -= 8;
							arg3[local47] = (byte) (local1 = local23 << -local51);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "([BII[BI)I", line = 63)
	int method27059(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray418[local18];
			@Pc(28) byte local28 = this.aByteArray73[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(47) int local47 = local5 >> 3;
			@Pc(51) int local51 = local5 & 0x7;
			local1 &= -local51 >> 31;
			@Pc(68) int local68 = local47 + (local28 + local51 - 1 >> 3);
			@Pc(69) int local69 = local51 + 24;
			arg3[local47] = (byte) (local1 |= local23 >>> local69);
			if (local47 < local68) {
				local47++;
				local51 = local69 - 8;
				arg3[local47] = (byte) (local1 = local23 >>> local51);
				if (local47 < local68) {
					local47++;
					local51 -= 8;
					arg3[local47] = (byte) (local1 = local23 >>> local51);
					if (local47 < local68) {
						local47++;
						local51 -= 8;
						arg3[local47] = (byte) (local1 = local23 >>> local51);
						if (local47 < local68) {
							local47++;
							local51 -= 8;
							arg3[local47] = (byte) (local1 = local23 << -local51);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "([BI[BIII)I", line = 101)
	int method27060(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray419[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(64) int local64;
			if ((local64 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local64;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(97) int local97;
			if ((local97 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local97;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local129;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local161;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local226;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local259;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "([BI[BII)I", line = 101)
	int method27061(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray419[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(64) int local64;
			if ((local64 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local64;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(97) int local97;
			if ((local97 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local97;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local129;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local161;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local226;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local259;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "([BI[BII)I", line = 101)
	int method27062(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray419[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(64) int local64;
			if ((local64 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local64;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(97) int local97;
			if ((local97 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local97;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local129;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local161;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local226;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray419[local6];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray419[local6]) < 0) {
				arg2[arg3++] = (byte) ~local259;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!hg", name = "dk", descriptor = "(IB)V", line = 635)
	static void method27063(@OriginalArg(0) int arg0) {
		@Pc(3) byte local3;
		if (arg0 == 0) {
			local3 = 0;
		} else if (arg0 == 1) {
			local3 = 1;
		} else if (arg0 == 2) {
			local3 = 2;
		} else {
			return;
		}
		@Pc(24) byte local24;
		if ((double) Class136_Sub1.aFloat152 == 2.0D) {
			local24 = 0;
		} else if ((double) Class136_Sub1.aFloat152 == 3.0D) {
			local24 = 1;
		} else if ((double) Class136_Sub1.aFloat152 == 4.0D) {
			local24 = 2;
		} else if ((double) Class136_Sub1.aFloat152 == 6.0D) {
			local24 = 3;
		} else if ((double) Class136_Sub1.aFloat152 >= 8.0D) {
			local24 = 4;
		} else {
			return;
		}
		Class581.aClass94_12 = Class136_Sub1.aClass94ArrayArray1[local3][local24];
		Class266.aClass17_10 = Class136_Sub1.aClass17ArrayArray1[local3][local24];
	}

	@OriginalMember(owner = "client!hg", name = "cx", descriptor = "(Lclient!yf;I)V", line = 4926)
	static final void method27064(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class82.method2024(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "mc", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6868)
	static final void method27065(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		@Pc(18) int[] local18 = Class139.method14334(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray28 = Class73.method1040(local13, arg2);
		arg0.anIntArray398 = local18;
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!hg", name = "pg", descriptor = "(Lclient!yf;I)V", line = 7265)
	static final void method27066(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class619.method32396(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "acc", descriptor = "(Lclient!yf;I)V", line = 9589)
	static final void method27067(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(14) long local14 = (long) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(25) long local25 = (long) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(36) long local36 = (long) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (local36 * local14 / local25);
	}
}
