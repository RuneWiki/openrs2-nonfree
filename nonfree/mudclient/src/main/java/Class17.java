import a.Class11;
import a.a.Class2;
import a.a.Class3;
import a.a.Class6;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!f")
public final class Class17 {

	@OriginalMember(owner = "mudclient!f", name = "i", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "mudclient!f", name = "j", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "mudclient!f", name = "k", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "mudclient!f", name = "l", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "mudclient!f", name = "F", descriptor = "Lmudclient!a/a/f;")
	public Class2 aClass2_3;

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "mudclient!f", name = "b", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "mudclient!f", name = "e", descriptor = "I")
	public int anInt338 = 750;

	@OriginalMember(owner = "mudclient!f", name = "f", descriptor = "I")
	private final int anInt339 = 12345678;

	@OriginalMember(owner = "mudclient!f", name = "g", descriptor = "I")
	private final int anInt340 = 128;

	@OriginalMember(owner = "mudclient!f", name = "h", descriptor = "[I")
	private int[] anIntArray163 = new int[256];

	@OriginalMember(owner = "mudclient!f", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray8 = new byte[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray9 = new byte[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray10 = new byte[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray11 = new byte[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray12 = new byte[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray13 = new byte[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray18 = new int[4][2304];

	@OriginalMember(owner = "mudclient!f", name = "u", descriptor = "I")
	private int anInt341 = 96;

	@OriginalMember(owner = "mudclient!f", name = "v", descriptor = "I")
	private int anInt342 = 96;

	@OriginalMember(owner = "mudclient!f", name = "w", descriptor = "[I")
	public int[] anIntArray164 = new int[this.anInt341 * this.anInt342 * 2];

	@OriginalMember(owner = "mudclient!f", name = "x", descriptor = "[I")
	public int[] anIntArray165 = new int[this.anInt341 * this.anInt342 * 2];

	@OriginalMember(owner = "mudclient!f", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray19 = new int[this.anInt341][this.anInt342];

	@OriginalMember(owner = "mudclient!f", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray20 = new int[this.anInt341][this.anInt342];

	@OriginalMember(owner = "mudclient!f", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray21 = new int[this.anInt341][this.anInt342];

	@OriginalMember(owner = "mudclient!f", name = "B", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "mudclient!f", name = "C", descriptor = "[Lmudclient!a/a/f;")
	public Class2[] aClass2Array3 = new Class2[64];

	@OriginalMember(owner = "mudclient!f", name = "D", descriptor = "[[Lmudclient!a/a/f;")
	public Class2[][] aClass2ArrayArray1 = new Class2[4][64];

	@OriginalMember(owner = "mudclient!f", name = "E", descriptor = "[[Lmudclient!a/a/f;")
	public Class2[][] aClass2ArrayArray2 = new Class2[4][64];

	@OriginalMember(owner = "mudclient!f", name = "d", descriptor = "Lmudclient!a/a/j;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "mudclient!f", name = "c", descriptor = "Lmudclient!a/a/g;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "mudclient!f", name = "<init>", descriptor = "(Lmudclient!a/a/j;Lmudclient!a/a/g;)V")
	public Class17(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class3 arg1) {
		this.aClass6_1 = arg0;
		this.aClass3_3 = arg1;
		for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
			this.anIntArray163[local134] = Class6.method240(255 - local134 * 4, 255 - (int) ((double) local134 * 1.75D), 255 - local134 * 4);
		}
		for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
			this.anIntArray163[local164 + 64] = Class6.method240(local164 * 3, 144, 0);
		}
		for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
			this.anIntArray163[local184 + 128] = Class6.method240(192 - (int) ((double) local184 * 1.5D), 144 - (int) ((double) local184 * 1.5D), 0);
		}
		for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
			this.anIntArray163[local214 + 192] = Class6.method240(96 - (int) ((double) local214 * 1.5D), (int) ((double) local214 * 1.5D) + 48, 0);
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "(IIIIII[I[IZ)I")
	public int method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) boolean arg8) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < this.anInt341; local3++) {
			for (local7 = 0; local7 < this.anInt342; local7++) {
				this.anIntArrayArray19[local3][local7] = 0;
			}
		}
		@Pc(28) byte local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg1;
		this.anIntArrayArray19[arg0][arg1] = 99;
		arg6[local28] = arg0;
		local7 = local28 + 1;
		arg7[local28] = arg1;
		@Pc(53) int local53 = arg6.length;
		@Pc(55) boolean local55 = false;
		while (local30 != local7) {
			local32 = arg6[local30];
			local34 = arg7[local30];
			local30 = (local30 + 1) % local53;
			if (local32 >= arg2 && local32 <= arg4 && local34 >= arg3 && local34 <= arg5) {
				local55 = true;
				break;
			}
			if (arg8) {
				if (local32 > 0 && local32 - 1 >= arg2 && local32 - 1 <= arg4 && local34 >= arg3 && local34 <= arg5 && (this.anIntArrayArray20[local32 - 1][local34] & 0x8) == 0) {
					local55 = true;
					break;
				}
				if (local32 < this.anInt341 - 1 && local32 + 1 >= arg2 && local32 + 1 <= arg4 && local34 >= arg3 && local34 <= arg5 && (this.anIntArrayArray20[local32 + 1][local34] & 0x2) == 0) {
					local55 = true;
					break;
				}
				if (local34 > 0 && local32 >= arg2 && local32 <= arg4 && local34 - 1 >= arg3 && local34 - 1 <= arg5 && (this.anIntArrayArray20[local32][local34 - 1] & 0x4) == 0) {
					local55 = true;
					break;
				}
				if (local34 < this.anInt342 - 1 && local32 >= arg2 && local32 <= arg4 && local34 + 1 >= arg3 && local34 + 1 <= arg5 && (this.anIntArrayArray20[local32][local34 + 1] & 0x1) == 0) {
					local55 = true;
					break;
				}
			}
			if (local32 > 0 && this.anIntArrayArray19[local32 - 1][local34] == 0 && (this.anIntArrayArray20[local32 - 1][local34] & 0x78) == 0) {
				arg6[local7] = local32 - 1;
				arg7[local7] = local34;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32 - 1][local34] = 2;
			}
			if (local32 < this.anInt341 - 1 && this.anIntArrayArray19[local32 + 1][local34] == 0 && (this.anIntArrayArray20[local32 + 1][local34] & 0x72) == 0) {
				arg6[local7] = local32 + 1;
				arg7[local7] = local34;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32 + 1][local34] = 8;
			}
			if (local34 > 0 && this.anIntArrayArray19[local32][local34 - 1] == 0 && (this.anIntArrayArray20[local32][local34 - 1] & 0x74) == 0) {
				arg6[local7] = local32;
				arg7[local7] = local34 - 1;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32][local34 - 1] = 1;
			}
			if (local34 < this.anInt342 - 1 && this.anIntArrayArray19[local32][local34 + 1] == 0 && (this.anIntArrayArray20[local32][local34 + 1] & 0x71) == 0) {
				arg6[local7] = local32;
				arg7[local7] = local34 + 1;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32][local34 + 1] = 4;
			}
			if (local32 > 0 && local34 > 0 && (this.anIntArrayArray20[local32][local34 - 1] & 0x74) == 0 && (this.anIntArrayArray20[local32 - 1][local34] & 0x78) == 0 && (this.anIntArrayArray20[local32 - 1][local34 - 1] & 0x7C) == 0 && this.anIntArrayArray19[local32 - 1][local34 - 1] == 0) {
				arg6[local7] = local32 - 1;
				arg7[local7] = local34 - 1;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32 - 1][local34 - 1] = 3;
			}
			if (local32 < this.anInt341 - 1 && local34 > 0 && (this.anIntArrayArray20[local32][local34 - 1] & 0x74) == 0 && (this.anIntArrayArray20[local32 + 1][local34] & 0x72) == 0 && (this.anIntArrayArray20[local32 + 1][local34 - 1] & 0x76) == 0 && this.anIntArrayArray19[local32 + 1][local34 - 1] == 0) {
				arg6[local7] = local32 + 1;
				arg7[local7] = local34 - 1;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32 + 1][local34 - 1] = 9;
			}
			if (local32 > 0 && local34 < this.anInt342 - 1 && (this.anIntArrayArray20[local32][local34 + 1] & 0x71) == 0 && (this.anIntArrayArray20[local32 - 1][local34] & 0x78) == 0 && (this.anIntArrayArray20[local32 - 1][local34 + 1] & 0x79) == 0 && this.anIntArrayArray19[local32 - 1][local34 + 1] == 0) {
				arg6[local7] = local32 - 1;
				arg7[local7] = local34 + 1;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32 - 1][local34 + 1] = 6;
			}
			if (local32 < this.anInt341 - 1 && local34 < this.anInt342 - 1 && (this.anIntArrayArray20[local32][local34 + 1] & 0x71) == 0 && (this.anIntArrayArray20[local32 + 1][local34] & 0x72) == 0 && (this.anIntArrayArray20[local32 + 1][local34 + 1] & 0x73) == 0 && this.anIntArrayArray19[local32 + 1][local34 + 1] == 0) {
				arg6[local7] = local32 + 1;
				arg7[local7] = local34 + 1;
				local7 = (local7 + 1) % local53;
				this.anIntArrayArray19[local32 + 1][local34 + 1] = 12;
			}
		}
		if (!local55) {
			return -1;
		}
		@Pc(766) byte local766 = 0;
		arg6[local766] = local32;
		local30 = local766 + 1;
		arg7[local766] = local34;
		@Pc(783) int local783;
		@Pc(784) int local784 = local783 = this.anIntArrayArray19[local32][local34];
		while (local32 != arg0 || local34 != arg1) {
			if (local784 != local783) {
				local783 = local784;
				arg6[local30] = local32;
				arg7[local30++] = local34;
			}
			if ((local784 & 0x2) != 0) {
				local32++;
			} else if ((local784 & 0x8) != 0) {
				local32--;
			}
			if ((local784 & 0x1) != 0) {
				local34++;
			} else if ((local784 & 0x4) != 0) {
				local34--;
			}
			local784 = this.anIntArrayArray19[local32][local34];
		}
		return local30;
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "(III)V")
	private void method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray20[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "mudclient!f", name = "b", descriptor = "(III)V")
	private void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray20[arg0][arg1] &= 65535 - arg2;
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "(IIII)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0 || arg1 < 0 || arg0 >= this.anInt341 - 1 || arg1 >= this.anInt342 - 1 || Class14.anIntArray133[arg3] != 1) {
			return;
		}
		if (arg2 == 0) {
			this.anIntArrayArray20[arg0][arg1] |= 0x1;
			if (arg1 > 0) {
				this.method414(arg0, arg1 - 1, 4);
			}
		} else if (arg2 == 1) {
			this.anIntArrayArray20[arg0][arg1] |= 0x2;
			if (arg0 > 0) {
				this.method414(arg0 - 1, arg1, 8);
			}
		} else if (arg2 == 2) {
			this.anIntArrayArray20[arg0][arg1] |= 0x10;
		} else if (arg2 == 3) {
			this.anIntArrayArray20[arg0][arg1] |= 0x20;
		}
		this.method420(arg0, arg1, 1, 1);
	}

	@OriginalMember(owner = "mudclient!f", name = "b", descriptor = "(IIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0 || arg1 < 0 || arg0 >= this.anInt341 - 1 || arg1 >= this.anInt342 - 1 || Class14.anIntArray133[arg3] != 1) {
			return;
		}
		if (arg2 == 0) {
			this.anIntArrayArray20[arg0][arg1] &= 0xFFFE;
			if (arg1 > 0) {
				this.method415(arg0, arg1 - 1, 4);
			}
		} else if (arg2 == 1) {
			this.anIntArrayArray20[arg0][arg1] &= 0xFFFD;
			if (arg0 > 0) {
				this.method415(arg0 - 1, arg1, 8);
			}
		} else if (arg2 == 2) {
			this.anIntArrayArray20[arg0][arg1] &= 0xFFEF;
		} else if (arg2 == 3) {
			this.anIntArrayArray20[arg0][arg1] &= 0xFFDF;
		}
		this.method420(arg0, arg1, 1, 1);
	}

	@OriginalMember(owner = "mudclient!f", name = "c", descriptor = "(III)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg1 < 0 || arg0 >= this.anInt341 - 1 || arg1 >= this.anInt342 - 1 || Class14.anIntArray128[arg2] != 1 && Class14.anIntArray128[arg2] != 2) {
			return;
		}
		@Pc(33) int local33 = this.method433(arg0, arg1);
		@Pc(42) int local42;
		@Pc(46) int local46;
		if (local33 == 0 || local33 == 4) {
			local42 = Class14.anIntArray126[arg2];
			local46 = Class14.anIntArray127[arg2];
		} else {
			local46 = Class14.anIntArray126[arg2];
			local42 = Class14.anIntArray127[arg2];
		}
		for (@Pc(58) int local58 = arg0; local58 < arg0 + local42; local58++) {
			for (@Pc(62) int local62 = arg1; local62 < arg1 + local46; local62++) {
				if (Class14.anIntArray128[arg2] == 1) {
					this.anIntArrayArray20[local58][local62] |= 0x40;
				} else if (local33 == 0) {
					this.anIntArrayArray20[local58][local62] |= 0x2;
					if (local58 > 0) {
						this.method414(local58 - 1, local62, 8);
					}
				} else if (local33 == 2) {
					this.anIntArrayArray20[local58][local62] |= 0x4;
					if (local62 < this.anInt342 - 1) {
						this.method414(local58, local62 + 1, 1);
					}
				} else if (local33 == 4) {
					this.anIntArrayArray20[local58][local62] |= 0x8;
					if (local58 < this.anInt341 - 1) {
						this.method414(local58 + 1, local62, 2);
					}
				} else if (local33 == 6) {
					this.anIntArrayArray20[local58][local62] |= 0x1;
					if (local62 > 0) {
						this.method414(local58, local62 - 1, 4);
					}
				}
			}
		}
		this.method420(arg0, arg1, local42, local46);
	}

	@OriginalMember(owner = "mudclient!f", name = "d", descriptor = "(III)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg1 < 0 || arg0 >= this.anInt341 - 1 || arg1 >= this.anInt342 - 1 || Class14.anIntArray128[arg2] != 1 && Class14.anIntArray128[arg2] != 2) {
			return;
		}
		@Pc(33) int local33 = this.method433(arg0, arg1);
		@Pc(42) int local42;
		@Pc(46) int local46;
		if (local33 == 0 || local33 == 4) {
			local42 = Class14.anIntArray126[arg2];
			local46 = Class14.anIntArray127[arg2];
		} else {
			local46 = Class14.anIntArray126[arg2];
			local42 = Class14.anIntArray127[arg2];
		}
		for (@Pc(58) int local58 = arg0; local58 < arg0 + local42; local58++) {
			for (@Pc(62) int local62 = arg1; local62 < arg1 + local46; local62++) {
				if (Class14.anIntArray128[arg2] == 1) {
					this.anIntArrayArray20[local58][local62] &= 0xFFBF;
				} else if (local33 == 0) {
					this.anIntArrayArray20[local58][local62] &= 0xFFFD;
					if (local58 > 0) {
						this.method415(local58 - 1, local62, 8);
					}
				} else if (local33 == 2) {
					this.anIntArrayArray20[local58][local62] &= 0xFFFB;
					if (local62 < this.anInt342 - 1) {
						this.method415(local58, local62 + 1, 1);
					}
				} else if (local33 == 4) {
					this.anIntArrayArray20[local58][local62] &= 0xFFF7;
					if (local58 < this.anInt341 - 1) {
						this.method415(local58 + 1, local62, 2);
					}
				} else if (local33 == 6) {
					this.anIntArrayArray20[local58][local62] &= 0xFFFE;
					if (local62 > 0) {
						this.method415(local58, local62 - 1, 4);
					}
				}
			}
		}
		this.method420(arg0, arg1, local42, local46);
	}

	@OriginalMember(owner = "mudclient!f", name = "c", descriptor = "(IIII)V")
	private void method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 1 || arg1 < 1 || arg0 + arg2 >= this.anInt341 || arg1 + arg3 >= this.anInt342) {
			return;
		}
		for (@Pc(22) int local22 = arg0; local22 <= arg0 + arg2; local22++) {
			for (@Pc(26) int local26 = arg1; local26 <= arg1 + arg3; local26++) {
				if ((this.method423(local22, local26) & 0x63) == 0 && (this.method423(local22 - 1, local26) & 0x59) == 0 && (this.method423(local22, local26 - 1) & 0x56) == 0 && (this.method423(local22 - 1, local26 - 1) & 0x6C) == 0) {
					this.method421(local22, local26, 0);
				} else {
					this.method421(local22, local26, 35);
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "e", descriptor = "(III)V")
	private void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / 12;
		@Pc(7) int local7 = arg1 / 12;
		@Pc(13) int local13 = (arg0 - 1) / 12;
		@Pc(19) int local19 = (arg1 - 1) / 12;
		this.method422(local3, local7, arg0, arg1, arg2);
		if (local3 != local13) {
			this.method422(local13, local7, arg0, arg1, arg2);
		}
		if (local7 != local19) {
			this.method422(local3, local19, arg0, arg1, arg2);
		}
		if (local3 != local13 && local7 != local19) {
			this.method422(local13, local19, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "(IIIII)V")
	private void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class2 local8 = this.aClass2Array3[arg0 + arg1 * 8];
		for (@Pc(10) int local10 = 0; local10 < local8.anInt78; local10++) {
			if (local8.anIntArray33[local10] == arg2 * 128 && local8.anIntArray35[local10] == arg3 * 128) {
				local8.method125(local10, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "(II)I")
	private int method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0 && arg1 >= 0 && arg0 < this.anInt341 && arg1 < this.anInt342 ? this.anIntArrayArray20[arg0][arg1] : 0;
	}

	@OriginalMember(owner = "mudclient!f", name = "b", descriptor = "(II)I")
	public int method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 >> 7;
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg0 & 0x7F;
		@Pc(15) int local15 = arg1 & 0x7F;
		if (local3 < 0 || local7 < 0 || local3 >= this.anInt341 - 1 || local7 >= this.anInt342 - 1) {
			return 0;
		}
		@Pc(43) int local43;
		@Pc(52) int local52;
		@Pc(61) int local61;
		if (local11 <= 128 - local15) {
			local43 = this.method425(local3, local7);
			local52 = this.method425(local3 + 1, local7) - local43;
			local61 = this.method425(local3, local7 + 1) - local43;
		} else {
			local43 = this.method425(local3 + 1, local7 + 1);
			local52 = this.method425(local3, local7 + 1) - local43;
			local61 = this.method425(local3 + 1, local7) - local43;
			local11 = 128 - local11;
			local15 = 128 - local15;
		}
		return local43 + local52 * local11 / 128 + local61 * local15 / 128;
	}

	@OriginalMember(owner = "mudclient!f", name = "c", descriptor = "(II)I")
	private int method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return (this.aByteArrayArray7[local15][arg0 * 48 + arg1] & 0xFF) * 3;
	}

	@OriginalMember(owner = "mudclient!f", name = "d", descriptor = "(II)I")
	private int method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return this.aByteArrayArray8[local15][arg0 * 48 + arg1] & 0xFF;
	}

	@OriginalMember(owner = "mudclient!f", name = "f", descriptor = "(III)I")
	private int method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return this.aByteArrayArray12[local15][arg0 * 48 + arg1] & 0xFF;
	}

	@OriginalMember(owner = "mudclient!f", name = "g", descriptor = "(III)V")
	private void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return;
		}
		@Pc(14) byte local14 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local14 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local14 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local14 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		this.aByteArrayArray12[local14][arg0 * 48 + arg1] = (byte) arg2;
	}

	@OriginalMember(owner = "mudclient!f", name = "h", descriptor = "(III)I")
	private int method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = this.method427(arg0, arg1, arg2);
		if (local5 == 0) {
			return -1;
		} else {
			@Pc(15) int local15 = Class14.anIntArray138[local5 - 1];
			return local15 == 2 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "d", descriptor = "(IIII)I")
	private int method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = this.method427(arg0, arg1, arg2);
		return local5 == 0 ? arg3 : Class14.anIntArray137[local5 - 1];
	}

	@OriginalMember(owner = "mudclient!f", name = "e", descriptor = "(II)I")
	private int method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return this.anIntArrayArray18[local15][arg0 * 48 + arg1];
	}

	@OriginalMember(owner = "mudclient!f", name = "f", descriptor = "(II)I")
	private int method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return this.aByteArrayArray11[local15][arg0 * 48 + arg1];
	}

	@OriginalMember(owner = "mudclient!f", name = "g", descriptor = "(II)I")
	public int method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return this.aByteArrayArray13[local15][arg0 * 48 + arg1];
	}

	@OriginalMember(owner = "mudclient!f", name = "h", descriptor = "(II)Z")
	private boolean method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method432(arg0, arg1) > 0 || this.method432(arg0 - 1, arg1) > 0 || this.method432(arg0 - 1, arg1 - 1) > 0 || this.method432(arg0, arg1 - 1) > 0;
	}

	@OriginalMember(owner = "mudclient!f", name = "i", descriptor = "(II)Z")
	private boolean method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method432(arg0, arg1) > 0 && this.method432(arg0 - 1, arg1) > 0 && this.method432(arg0 - 1, arg1 - 1) > 0 && this.method432(arg0, arg1 - 1) > 0;
	}

	@OriginalMember(owner = "mudclient!f", name = "j", descriptor = "(II)I")
	private int method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return this.aByteArrayArray10[local15][arg0 * 48 + arg1] & 0xFF;
	}

	@OriginalMember(owner = "mudclient!f", name = "k", descriptor = "(II)I")
	private int method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
			return 0;
		}
		@Pc(15) byte local15 = 0;
		if (arg0 >= 48 && arg1 < 48) {
			local15 = 1;
			arg0 -= 48;
		} else if (arg0 < 48 && arg1 >= 48) {
			local15 = 2;
			arg1 -= 48;
		} else if (arg0 >= 48 && arg1 >= 48) {
			local15 = 3;
			arg0 -= 48;
			arg1 -= 48;
		}
		return this.aByteArrayArray9[local15][arg0 * 48 + arg1] & 0xFF;
	}

	@OriginalMember(owner = "mudclient!f", name = "e", descriptor = "(IIII)V")
	private void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) String local25 = "m" + arg2 + arg0 / 10 + arg0 % 10 + arg1 / 10 + arg1 % 10;
		try {
			@Pc(66) int local66;
			@Pc(68) int local68;
			@Pc(70) int local70;
			@Pc(79) int local79;
			@Pc(98) int local98;
			@Pc(178) int local178;
			@Pc(197) int local197;
			@Pc(439) int local439;
			@Pc(471) int local471;
			@Pc(489) int local489;
			@Pc(41) byte[] local41;
			if (this.aByteArray20 == null) {
				local41 = new byte[20736];
				Class11.method303("../gamedata/maps/" + local25 + ".jm", local41, 20736);
				local66 = 0;
				local68 = 0;
				for (local70 = 0; local70 < 2304; local70++) {
					local66 = local66 + local41[local68++] & 0xFF;
					this.aByteArrayArray7[arg3][local70] = (byte) local66;
				}
				local66 = 0;
				for (local79 = 0; local79 < 2304; local79++) {
					local66 = local66 + local41[local68++] & 0xFF;
					this.aByteArrayArray8[arg3][local79] = (byte) local66;
				}
				for (local98 = 0; local98 < 2304; local98++) {
					this.aByteArrayArray9[arg3][local98] = local41[local68++];
				}
				for (local178 = 0; local178 < 2304; local178++) {
					this.aByteArrayArray10[arg3][local178] = local41[local68++];
				}
				for (local197 = 0; local197 < 2304; local197++) {
					this.anIntArrayArray18[arg3][local197] = (local41[local68] & 0xFF) * 256 + (local41[local68 + 1] & 0xFF);
					local68 += 2;
				}
				for (local439 = 0; local439 < 2304; local439++) {
					this.aByteArrayArray11[arg3][local439] = local41[local68++];
				}
				for (local471 = 0; local471 < 2304; local471++) {
					this.aByteArrayArray12[arg3][local471] = local41[local68++];
				}
				for (local489 = 0; local489 < 2304; local489++) {
					this.aByteArrayArray13[arg3][local489] = local41[local68++];
				}
			} else {
				local41 = Class11.method319(local25 + ".hei", 0, this.aByteArray20);
				if (local41 == null && this.aByteArray22 != null) {
					local41 = Class11.method319(local25 + ".hei", 0, this.aByteArray22);
				}
				if (local41 == null || local41.length <= 0) {
					for (local66 = 0; local66 < 2304; local66++) {
						this.aByteArrayArray7[arg3][local66] = 0;
						this.aByteArrayArray8[arg3][local66] = 0;
					}
				} else {
					local66 = 0;
					local68 = 0;
					local70 = 0;
					label329: while (true) {
						do {
							if (local70 >= 2304) {
								local68 = 64;
								for (local79 = 0; local79 < 48; local79++) {
									for (local98 = 0; local98 < 48; local98++) {
										local68 = this.aByteArrayArray7[arg3][local98 * 48 + local79] + local68 & 0x7F;
										this.aByteArrayArray7[arg3][local98 * 48 + local79] = (byte) (local68 * 2);
									}
								}
								local68 = 0;
								local98 = 0;
								while (true) {
									do {
										if (local98 >= 2304) {
											local68 = 35;
											for (local178 = 0; local178 < 48; local178++) {
												for (local197 = 0; local197 < 48; local197++) {
													local68 = this.aByteArrayArray8[arg3][local197 * 48 + local178] + local68 & 0x7F;
													this.aByteArrayArray8[arg3][local197 * 48 + local178] = (byte) (local68 * 2);
												}
											}
											break label329;
										}
										local178 = local41[local66++] & 0xFF;
										if (local178 < 128) {
											this.aByteArrayArray8[arg3][local98++] = (byte) local178;
											local68 = local178;
										}
									} while (local178 < 128);
									for (local197 = 0; local197 < local178 - 128; local197++) {
										this.aByteArrayArray8[arg3][local98++] = (byte) local68;
									}
								}
							}
							local79 = local41[local66++] & 0xFF;
							if (local79 < 128) {
								this.aByteArrayArray7[arg3][local70++] = (byte) local79;
								local68 = local79;
							}
						} while (local79 < 128);
						for (local98 = 0; local98 < local79 - 128; local98++) {
							this.aByteArrayArray7[arg3][local70++] = (byte) local68;
						}
					}
				}
				local41 = Class11.method319(local25 + ".dat", 0, this.aByteArray21);
				if (local41 == null && this.aByteArray23 != null) {
					local41 = Class11.method319(local25 + ".dat", 0, this.aByteArray23);
				}
				if (local41 == null || local41.length == 0) {
					throw new IOException();
				}
				local66 = 0;
				for (local68 = 0; local68 < 2304; local68++) {
					this.aByteArrayArray9[arg3][local68] = local41[local66++];
				}
				for (local70 = 0; local70 < 2304; local70++) {
					this.aByteArrayArray10[arg3][local70] = local41[local66++];
				}
				for (local79 = 0; local79 < 2304; local79++) {
					this.anIntArrayArray18[arg3][local79] = local41[local66++] & 0xFF;
				}
				for (local98 = 0; local98 < 2304; local98++) {
					local178 = local41[local66++] & 0xFF;
					if (local178 > 0) {
						this.anIntArrayArray18[arg3][local98] = local178 + 12000;
					}
				}
				local178 = 0;
				while (true) {
					while (local178 < 2304) {
						local197 = local41[local66++] & 0xFF;
						if (local197 < 128) {
							this.aByteArrayArray11[arg3][local178++] = (byte) local197;
						} else {
							for (local439 = 0; local439 < local197 - 128; local439++) {
								this.aByteArrayArray11[arg3][local178++] = 0;
							}
						}
					}
					local197 = 0;
					local439 = 0;
					while (true) {
						while (local439 < 2304) {
							local471 = local41[local66++] & 0xFF;
							if (local471 < 128) {
								this.aByteArrayArray12[arg3][local439++] = (byte) local471;
								local197 = local471;
							} else {
								for (local489 = 0; local489 < local471 - 128; local489++) {
									this.aByteArrayArray12[arg3][local439++] = (byte) local197;
								}
							}
						}
						local471 = 0;
						while (true) {
							@Pc(536) int local536;
							while (local471 < 2304) {
								local489 = local41[local66++] & 0xFF;
								if (local489 < 128) {
									this.aByteArrayArray13[arg3][local471++] = (byte) local489;
								} else {
									for (local536 = 0; local536 < local489 - 128; local536++) {
										this.aByteArrayArray13[arg3][local471++] = 0;
									}
								}
							}
							local41 = Class11.method319(local25 + ".loc", 0, this.aByteArray21);
							if (local41 != null && local41.length > 0) {
								local66 = 0;
								local489 = 0;
								while (local489 < 2304) {
									local536 = local41[local66++] & 0xFF;
									if (local536 < 128) {
										this.anIntArrayArray18[arg3][local489++] = local536 + 48000;
									} else {
										local489 += local536 - 128;
									}
								}
								return;
							}
							return;
						}
					}
				}
			}
		} catch (@Pc(804) IOException local804) {
			for (@Pc(806) int local806 = 0; local806 < 2304; local806++) {
				this.aByteArrayArray7[arg3][local806] = 0;
				this.aByteArrayArray8[arg3][local806] = 0;
				this.aByteArrayArray9[arg3][local806] = 0;
				this.aByteArrayArray10[arg3][local806] = 0;
				this.anIntArrayArray18[arg3][local806] = 0;
				this.aByteArrayArray11[arg3][local806] = 0;
				this.aByteArrayArray12[arg3][local806] = 0;
				if (arg2 == 0) {
					this.aByteArrayArray12[arg3][local806] = -6;
				}
				if (arg2 == 3) {
					this.aByteArrayArray12[arg3][local806] = 8;
				}
				this.aByteArrayArray13[arg3][local806] = 0;
			}
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "()V")
	private void method439() {
		if (this.aBoolean54) {
			this.aClass6_1.method200();
		}
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			this.aClass2Array3[local9] = null;
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				this.aClass2ArrayArray1[local18][local9] = null;
			}
			for (@Pc(33) int local33 = 0; local33 < 4; local33++) {
				this.aClass2ArrayArray2[local33][local9] = null;
			}
		}
		System.gc();
	}

	@OriginalMember(owner = "mudclient!f", name = "i", descriptor = "(III)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method439();
		@Pc(7) int local7 = (arg0 + 24) / 48;
		@Pc(13) int local13 = (arg1 + 24) / 48;
		this.method443(arg0, arg1, arg2, true);
		if (arg2 != 0) {
			return;
		}
		this.method443(arg0, arg1, 1, false);
		this.method443(arg0, arg1, 2, false);
		this.method438(local7 - 1, local13 - 1, arg2, 0);
		this.method438(local7, local13 - 1, arg2, 1);
		this.method438(local7 - 1, local13, arg2, 2);
		this.method438(local7, local13, arg2, 3);
		this.method441();
	}

	@OriginalMember(owner = "mudclient!f", name = "b", descriptor = "()V")
	private void method441() {
		for (@Pc(3) int local3 = 0; local3 < 96; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 96; local7++) {
				if (this.method427(local3, local7, 0) == 250) {
					if (local3 == 47 && this.method427(local3 + 1, local7, 0) != 250 && this.method427(local3 + 1, local7, 0) != 2) {
						this.method428(local3, local7, 9);
					} else if (local7 != 47 || this.method427(local3, local7 + 1, 0) == 250 || this.method427(local3, local7 + 1, 0) == 2) {
						this.method428(local3, local7, 2);
					} else {
						this.method428(local3, local7, 9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "b", descriptor = "(IIIII)V")
	private void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg0 * 3;
		@Pc(7) int local7 = arg1 * 3;
		@Pc(12) int local12 = this.aClass6_1.method237(arg3);
		@Pc(17) int local17 = this.aClass6_1.method237(arg4);
		@Pc(23) int local23 = local12 >> 1 & 0x7F7F7F;
		@Pc(29) int local29 = local17 >> 1 & 0x7F7F7F;
		if (arg2 == 0) {
			this.aClass3_3.method370(local3, local7, 3, local23);
			this.aClass3_3.method370(local3, local7 + 1, 2, local23);
			this.aClass3_3.method370(local3, local7 + 2, 1, local23);
			this.aClass3_3.method370(local3 + 2, local7 + 1, 1, local29);
			this.aClass3_3.method370(local3 + 1, local7 + 2, 2, local29);
		} else if (arg2 == 1) {
			this.aClass3_3.method370(local3, local7, 3, local29);
			this.aClass3_3.method370(local3 + 1, local7 + 1, 2, local29);
			this.aClass3_3.method370(local3 + 2, local7 + 2, 1, local29);
			this.aClass3_3.method370(local3, local7 + 1, 1, local23);
			this.aClass3_3.method370(local3, local7 + 2, 2, local23);
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "(IIIZ)V")
	private void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) int local7 = (arg0 + 24) / 48;
		@Pc(13) int local13 = (arg1 + 24) / 48;
		this.method438(local7 - 1, local13 - 1, arg2, 0);
		this.method438(local7, local13 - 1, arg2, 1);
		this.method438(local7 - 1, local13, arg2, 2);
		this.method438(local7, local13, arg2, 3);
		this.method441();
		if (this.aClass2_3 == null) {
			this.aClass2_3 = new Class2(this.anInt341 * this.anInt342 * 2 + 256, this.anInt341 * this.anInt342 * 2 + 256, true, true, false, false, true);
		}
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(113) int local113;
		@Pc(117) int local117;
		@Pc(125) int local125;
		@Pc(227) int local227;
		@Pc(234) int local234;
		@Pc(266) int local266;
		@Pc(268) int local268;
		@Pc(294) int local294;
		@Pc(306) int local306;
		@Pc(705) int local705;
		@Pc(972) int local972;
		@Pc(1086) int local1086;
		if (arg3) {
			this.aClass3_3.method364();
			for (local85 = 0; local85 < 96; local85++) {
				for (local89 = 0; local89 < 96; local89++) {
					this.anIntArrayArray20[local85][local89] = 0;
				}
			}
			@Pc(109) Class2 local109 = this.aClass2_3;
			local109.method114();
			for (local113 = 0; local113 < 96; local113++) {
				for (local117 = 0; local117 < 96; local117++) {
					local125 = -this.method425(local113, local117);
					if (this.method427(local113, local117, arg2) > 0 && Class14.anIntArray138[this.method427(local113, local117, arg2) - 1] == 4) {
						local125 = 0;
					}
					if (this.method427(local113 - 1, local117, arg2) > 0 && Class14.anIntArray138[this.method427(local113 - 1, local117, arg2) - 1] == 4) {
						local125 = 0;
					}
					if (this.method427(local113, local117 - 1, arg2) > 0 && Class14.anIntArray138[this.method427(local113, local117 - 1, arg2) - 1] == 4) {
						local125 = 0;
					}
					if (this.method427(local113 - 1, local117 - 1, arg2) > 0 && Class14.anIntArray138[this.method427(local113 - 1, local117 - 1, arg2) - 1] == 4) {
						local125 = 0;
					}
					local227 = local109.method117(local113 * 128, local125, local117 * 128);
					local234 = (int) (Math.random() * 10.0D) - 5;
					local109.method125(local227, local234);
				}
			}
			@Pc(658) int[] local658;
			for (local117 = 0; local117 < 95; local117++) {
				for (local125 = 0; local125 < 95; local125++) {
					local227 = this.method426(local117, local125);
					local234 = this.anIntArray163[local227];
					local266 = local234;
					local268 = local234;
					@Pc(270) byte local270 = 0;
					if (arg2 == 1 || arg2 == 2) {
						local234 = 12345678;
						local266 = 12345678;
						local268 = 12345678;
					}
					if (this.method427(local117, local125, arg2) > 0) {
						local294 = this.method427(local117, local125, arg2);
						local227 = Class14.anIntArray138[local294 - 1];
						local306 = this.method429(local117, local125, arg2);
						local234 = local266 = Class14.anIntArray137[local294 - 1];
						if (local227 == 4) {
							local234 = 1;
							local266 = 1;
							if (local294 == 12) {
								local234 = 31;
								local266 = 31;
							}
						}
						if (local227 == 5) {
							if (this.method431(local117, local125) > 0 && this.method431(local117, local125) < 24000) {
								if (this.method430(local117 - 1, local125, arg2, local268) != 12345678 && this.method430(local117, local125 - 1, arg2, local268) != 12345678) {
									local234 = this.method430(local117 - 1, local125, arg2, local268);
									local270 = 0;
								} else if (this.method430(local117 + 1, local125, arg2, local268) != 12345678 && this.method430(local117, local125 + 1, arg2, local268) != 12345678) {
									local266 = this.method430(local117 + 1, local125, arg2, local268);
									local270 = 0;
								} else if (this.method430(local117 + 1, local125, arg2, local268) != 12345678 && this.method430(local117, local125 - 1, arg2, local268) != 12345678) {
									local266 = this.method430(local117 + 1, local125, arg2, local268);
									local270 = 1;
								} else if (this.method430(local117 - 1, local125, arg2, local268) != 12345678 && this.method430(local117, local125 + 1, arg2, local268) != 12345678) {
									local234 = this.method430(local117 - 1, local125, arg2, local268);
									local270 = 1;
								}
							}
						} else if (local227 != 2 || this.method431(local117, local125) > 0 && this.method431(local117, local125) < 24000) {
							if (this.method429(local117 - 1, local125, arg2) != local306 && this.method429(local117, local125 - 1, arg2) != local306) {
								local234 = local268;
								local270 = 0;
							} else if (this.method429(local117 + 1, local125, arg2) != local306 && this.method429(local117, local125 + 1, arg2) != local306) {
								local266 = local268;
								local270 = 0;
							} else if (this.method429(local117 + 1, local125, arg2) != local306 && this.method429(local117, local125 - 1, arg2) != local306) {
								local266 = local268;
								local270 = 1;
							} else if (this.method429(local117 - 1, local125, arg2) != local306 && this.method429(local117, local125 + 1, arg2) != local306) {
								local234 = local268;
								local270 = 1;
							}
						}
						if (Class14.anIntArray139[local294 - 1] != 0) {
							this.anIntArrayArray20[local117][local125] |= 0x40;
						}
						if (Class14.anIntArray138[local294 - 1] == 2) {
							this.anIntArrayArray20[local117][local125] |= 0x80;
						}
					}
					this.method442(local117, local125, local270, local234, local266);
					local294 = this.method425(local117 + 1, local125 + 1) - this.method425(local117 + 1, local125) + this.method425(local117, local125 + 1) - this.method425(local117, local125);
					if (local234 != local266 || local294 != 0) {
						local658 = new int[3];
						@Pc(661) int[] local661 = new int[3];
						if (local270 == 0) {
							if (local234 != 12345678) {
								local658[0] = local125 + local117 * this.anInt341 + this.anInt341;
								local658[1] = local125 + local117 * this.anInt341;
								local658[2] = local125 + local117 * this.anInt341 + 1;
								local705 = local109.method119(3, local658, 12345678, local234);
								this.anIntArray164[local705] = local117;
								this.anIntArray165[local705] = local125;
								local109.anIntArray29[local705] = local705 + 200000;
							}
							if (local266 != 12345678) {
								local661[0] = local125 + local117 * this.anInt341 + 1;
								local661[1] = local125 + local117 * this.anInt341 + this.anInt341 + 1;
								local661[2] = local125 + local117 * this.anInt341 + this.anInt341;
								local705 = local109.method119(3, local661, 12345678, local266);
								this.anIntArray164[local705] = local117;
								this.anIntArray165[local705] = local125;
								local109.anIntArray29[local705] = local705 + 200000;
							}
						} else {
							if (local234 != 12345678) {
								local658[0] = local125 + local117 * this.anInt341 + 1;
								local658[1] = local125 + local117 * this.anInt341 + this.anInt341 + 1;
								local658[2] = local125 + local117 * this.anInt341;
								local705 = local109.method119(3, local658, 12345678, local234);
								this.anIntArray164[local705] = local117;
								this.anIntArray165[local705] = local125;
								local109.anIntArray29[local705] = local705 + 200000;
							}
							if (local266 != 12345678) {
								local661[0] = local125 + local117 * this.anInt341 + this.anInt341;
								local661[1] = local125 + local117 * this.anInt341;
								local661[2] = local125 + local117 * this.anInt341 + this.anInt341 + 1;
								local705 = local109.method119(3, local661, 12345678, local266);
								this.anIntArray164[local705] = local117;
								this.anIntArray165[local705] = local125;
								local109.anIntArray29[local705] = local705 + 200000;
							}
						}
					} else if (local234 != 12345678) {
						local658 = new int[] { local125 + local117 * this.anInt341 + this.anInt341, local125 + local117 * this.anInt341, local125 + local117 * this.anInt341 + 1, local125 + local117 * this.anInt341 + this.anInt341 + 1 };
						local972 = local109.method119(4, local658, 12345678, local234);
						this.anIntArray164[local972] = local117;
						this.anIntArray165[local972] = local125;
						local109.anIntArray29[local972] = local972 + 200000;
					}
				}
			}
			for (local125 = 1; local125 < 95; local125++) {
				for (local227 = 1; local227 < 95; local227++) {
					if (this.method427(local125, local227, arg2) > 0 && Class14.anIntArray138[this.method427(local125, local227, arg2) - 1] == 4) {
						local234 = Class14.anIntArray137[this.method427(local125, local227, arg2) - 1];
						local266 = local109.method117(local125 * 128, -this.method425(local125, local227), local227 * 128);
						local268 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227), local227 * 128);
						local1086 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227 + 1), (local227 + 1) * 128);
						local294 = local109.method117(local125 * 128, -this.method425(local125, local227 + 1), (local227 + 1) * 128);
						local658 = new int[] { local266, local268, local1086, local294 };
						local972 = local109.method119(4, local658, local234, 12345678);
						this.anIntArray164[local972] = local125;
						this.anIntArray165[local972] = local227;
						local109.anIntArray29[local972] = local972 + 200000;
						this.method442(local125, local227, 0, local234, local234);
					} else if (this.method427(local125, local227, arg2) == 0 || Class14.anIntArray138[this.method427(local125, local227, arg2) - 1] != 3) {
						if (this.method427(local125, local227 + 1, arg2) > 0 && Class14.anIntArray138[this.method427(local125, local227 + 1, arg2) - 1] == 4) {
							local234 = Class14.anIntArray137[this.method427(local125, local227 + 1, arg2) - 1];
							local266 = local109.method117(local125 * 128, -this.method425(local125, local227), local227 * 128);
							local268 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227), local227 * 128);
							local1086 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227 + 1), (local227 + 1) * 128);
							local294 = local109.method117(local125 * 128, -this.method425(local125, local227 + 1), (local227 + 1) * 128);
							local658 = new int[] { local266, local268, local1086, local294 };
							local972 = local109.method119(4, local658, local234, 12345678);
							this.anIntArray164[local972] = local125;
							this.anIntArray165[local972] = local227;
							local109.anIntArray29[local972] = local972 + 200000;
							this.method442(local125, local227, 0, local234, local234);
						}
						if (this.method427(local125, local227 - 1, arg2) > 0 && Class14.anIntArray138[this.method427(local125, local227 - 1, arg2) - 1] == 4) {
							local234 = Class14.anIntArray137[this.method427(local125, local227 - 1, arg2) - 1];
							local266 = local109.method117(local125 * 128, -this.method425(local125, local227), local227 * 128);
							local268 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227), local227 * 128);
							local1086 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227 + 1), (local227 + 1) * 128);
							local294 = local109.method117(local125 * 128, -this.method425(local125, local227 + 1), (local227 + 1) * 128);
							local658 = new int[] { local266, local268, local1086, local294 };
							local972 = local109.method119(4, local658, local234, 12345678);
							this.anIntArray164[local972] = local125;
							this.anIntArray165[local972] = local227;
							local109.anIntArray29[local972] = local972 + 200000;
							this.method442(local125, local227, 0, local234, local234);
						}
						if (this.method427(local125 + 1, local227, arg2) > 0 && Class14.anIntArray138[this.method427(local125 + 1, local227, arg2) - 1] == 4) {
							local234 = Class14.anIntArray137[this.method427(local125 + 1, local227, arg2) - 1];
							local266 = local109.method117(local125 * 128, -this.method425(local125, local227), local227 * 128);
							local268 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227), local227 * 128);
							local1086 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227 + 1), (local227 + 1) * 128);
							local294 = local109.method117(local125 * 128, -this.method425(local125, local227 + 1), (local227 + 1) * 128);
							local658 = new int[] { local266, local268, local1086, local294 };
							local972 = local109.method119(4, local658, local234, 12345678);
							this.anIntArray164[local972] = local125;
							this.anIntArray165[local972] = local227;
							local109.anIntArray29[local972] = local972 + 200000;
							this.method442(local125, local227, 0, local234, local234);
						}
						if (this.method427(local125 - 1, local227, arg2) > 0 && Class14.anIntArray138[this.method427(local125 - 1, local227, arg2) - 1] == 4) {
							local234 = Class14.anIntArray137[this.method427(local125 - 1, local227, arg2) - 1];
							local266 = local109.method117(local125 * 128, -this.method425(local125, local227), local227 * 128);
							local268 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227), local227 * 128);
							local1086 = local109.method117((local125 + 1) * 128, -this.method425(local125 + 1, local227 + 1), (local227 + 1) * 128);
							local294 = local109.method117(local125 * 128, -this.method425(local125, local227 + 1), (local227 + 1) * 128);
							local658 = new int[] { local266, local268, local1086, local294 };
							local972 = local109.method119(4, local658, local234, 12345678);
							this.anIntArray164[local972] = local125;
							this.anIntArray165[local972] = local227;
							local109.anIntArray29[local972] = local972 + 200000;
							this.method442(local125, local227, 0, local234, local234);
						}
					}
				}
			}
			local109.method122(true, 40, 48, -50, -10, -50);
			this.aClass2Array3 = this.aClass2_3.method120(0, 0, 1536, 1536, 8, 64, 233, false);
			for (local227 = 0; local227 < 64; local227++) {
				this.aClass6_1.method198(this.aClass2Array3[local227]);
			}
			for (local234 = 0; local234 < 96; local234++) {
				for (local266 = 0; local266 < 96; local266++) {
					this.anIntArrayArray21[local234][local266] = this.method425(local234, local266);
				}
			}
		}
		this.aClass2_3.method114();
		local85 = 6316128;
		for (local89 = 0; local89 < 95; local89++) {
			for (local113 = 0; local113 < 95; local113++) {
				local117 = this.method436(local89, local113);
				if (local117 > 0 && (Class14.anIntArray134[local117 - 1] == 0 || this.aBoolean53)) {
					this.method445(this.aClass2_3, local117 - 1, local89, local113, local89 + 1, local113);
					if (arg3 && Class14.anIntArray133[local117 - 1] != 0) {
						this.anIntArrayArray20[local89][local113] |= 0x1;
						if (local113 > 0) {
							this.method414(local89, local113 - 1, 4);
						}
					}
					if (arg3) {
						this.aClass3_3.method370(local89 * 3, local113 * 3, 3, local85);
					}
				}
				local117 = this.method437(local89, local113);
				if (local117 > 0 && (Class14.anIntArray134[local117 - 1] == 0 || this.aBoolean53)) {
					this.method445(this.aClass2_3, local117 - 1, local89, local113, local89, local113 + 1);
					if (arg3 && Class14.anIntArray133[local117 - 1] != 0) {
						this.anIntArrayArray20[local89][local113] |= 0x2;
						if (local89 > 0) {
							this.method414(local89 - 1, local113, 8);
						}
					}
					if (arg3) {
						this.aClass3_3.method371(local89 * 3, local113 * 3, 3, local85);
					}
				}
				local117 = this.method431(local89, local113);
				if (local117 > 0 && local117 < 12000 && (Class14.anIntArray134[local117 - 1] == 0 || this.aBoolean53)) {
					this.method445(this.aClass2_3, local117 - 1, local89, local113, local89 + 1, local113 + 1);
					if (arg3 && Class14.anIntArray133[local117 - 1] != 0) {
						this.anIntArrayArray20[local89][local113] |= 0x20;
					}
					if (arg3) {
						this.aClass3_3.method372(local89 * 3, local113 * 3, local85);
						this.aClass3_3.method372(local89 * 3 + 1, local113 * 3 + 1, local85);
						this.aClass3_3.method372(local89 * 3 + 2, local113 * 3 + 2, local85);
					}
				}
				if (local117 > 12000 && local117 < 24000 && (Class14.anIntArray134[local117 - 12001] == 0 || this.aBoolean53)) {
					this.method445(this.aClass2_3, local117 - 12001, local89 + 1, local113, local89, local113 + 1);
					if (arg3 && Class14.anIntArray133[local117 - 12001] != 0) {
						this.anIntArrayArray20[local89][local113] |= 0x10;
					}
					if (arg3) {
						this.aClass3_3.method372(local89 * 3 + 2, local113 * 3, local85);
						this.aClass3_3.method372(local89 * 3 + 1, local113 * 3 + 1, local85);
						this.aClass3_3.method372(local89 * 3, local113 * 3 + 2, local85);
					}
				}
			}
		}
		if (arg3) {
			this.aClass3_3.method381(this.anInt338 - 1, 0, 0, 285, 285);
		}
		this.aClass2_3.method122(false, 60, 24, -50, -10, -50);
		this.aClass2ArrayArray1[arg2] = this.aClass2_3.method120(0, 0, 1536, 1536, 8, 64, 338, true);
		for (local113 = 0; local113 < 64; local113++) {
			this.aClass6_1.method198(this.aClass2ArrayArray1[arg2][local113]);
		}
		for (local117 = 0; local117 < 95; local117++) {
			for (local125 = 0; local125 < 95; local125++) {
				local227 = this.method436(local117, local125);
				if (local227 > 0) {
					this.method446(local227 - 1, local117, local125, local117 + 1, local125);
				}
				local227 = this.method437(local117, local125);
				if (local227 > 0) {
					this.method446(local227 - 1, local117, local125, local117, local125 + 1);
				}
				local227 = this.method431(local117, local125);
				if (local227 > 0 && local227 < 12000) {
					this.method446(local227 - 1, local117, local125, local117 + 1, local125 + 1);
				}
				if (local227 > 12000 && local227 < 24000) {
					this.method446(local227 - 12001, local117 + 1, local125, local117, local125 + 1);
				}
			}
		}
		@Pc(2391) int local2391;
		@Pc(2398) int local2398;
		@Pc(2405) int local2405;
		@Pc(2412) int local2412;
		@Pc(2419) int local2419;
		for (local125 = 1; local125 < 95; local125++) {
			for (local227 = 1; local227 < 95; local227++) {
				local234 = this.method432(local125, local227);
				if (local234 > 0) {
					local1086 = local125 + 1;
					local306 = local125 + 1;
					local972 = local227 + 1;
					@Pc(2389) int local2389 = local227 + 1;
					local2391 = 0;
					local2398 = this.anIntArrayArray21[local125][local227];
					local2405 = this.anIntArrayArray21[local1086][local227];
					local2412 = this.anIntArrayArray21[local306][local972];
					local2419 = this.anIntArrayArray21[local125][local2389];
					if (local2398 > 80000) {
						local2398 -= 80000;
					}
					if (local2405 > 80000) {
						local2405 -= 80000;
					}
					if (local2412 > 80000) {
						local2412 -= 80000;
					}
					if (local2419 > 80000) {
						local2419 -= 80000;
					}
					if (local2398 > local2391) {
						local2391 = local2398;
					}
					if (local2405 > local2391) {
						local2391 = local2405;
					}
					if (local2412 > local2391) {
						local2391 = local2412;
					}
					if (local2419 > local2391) {
						local2391 = local2419;
					}
					if (local2391 >= 80000) {
						local2391 -= 80000;
					}
					if (local2398 < 80000) {
						this.anIntArrayArray21[local125][local227] = local2391;
					} else {
						this.anIntArrayArray21[local125][local227] -= 80000;
					}
					if (local2405 < 80000) {
						this.anIntArrayArray21[local1086][local227] = local2391;
					} else {
						this.anIntArrayArray21[local1086][local227] -= 80000;
					}
					if (local2412 < 80000) {
						this.anIntArrayArray21[local306][local972] = local2391;
					} else {
						this.anIntArrayArray21[local306][local972] -= 80000;
					}
					if (local2419 < 80000) {
						this.anIntArrayArray21[local125][local2389] = local2391;
					} else {
						this.anIntArrayArray21[local125][local2389] -= 80000;
					}
				}
			}
		}
		this.aClass2_3.method114();
		for (local227 = 1; local227 < 95; local227++) {
			for (local234 = 1; local234 < 95; local234++) {
				local266 = this.method432(local227, local234);
				if (local266 > 0) {
					local294 = local227 + 1;
					local972 = local227 + 1;
					local705 = local234 + 1;
					local2391 = local234 + 1;
					local2398 = local227 * 128;
					local2405 = local234 * 128;
					local2412 = local2398 + 128;
					local2419 = local2405 + 128;
					@Pc(2630) int local2630 = local2398;
					@Pc(2632) int local2632 = local2405;
					@Pc(2634) int local2634 = local2412;
					@Pc(2636) int local2636 = local2419;
					@Pc(2643) int local2643 = this.anIntArrayArray21[local227][local234];
					@Pc(2650) int local2650 = this.anIntArrayArray21[local294][local234];
					@Pc(2657) int local2657 = this.anIntArrayArray21[local972][local705];
					@Pc(2664) int local2664 = this.anIntArrayArray21[local227][local2391];
					@Pc(2670) int local2670 = Class14.anIntArray135[local266 - 1];
					if (this.method435(local227, local234) && local2643 < 80000) {
						local2643 += local2670 + 80000;
						this.anIntArrayArray21[local227][local234] = local2643;
					}
					if (this.method435(local294, local234) && local2650 < 80000) {
						local2650 += local2670 + 80000;
						this.anIntArrayArray21[local294][local234] = local2650;
					}
					if (this.method435(local972, local705) && local2657 < 80000) {
						local2657 += local2670 + 80000;
						this.anIntArrayArray21[local972][local705] = local2657;
					}
					if (this.method435(local227, local2391) && local2664 < 80000) {
						local2664 += local2670 + 80000;
						this.anIntArrayArray21[local227][local2391] = local2664;
					}
					if (local2643 >= 80000) {
						local2643 -= 80000;
					}
					if (local2650 >= 80000) {
						local2650 -= 80000;
					}
					if (local2657 >= 80000) {
						local2657 -= 80000;
					}
					if (local2664 >= 80000) {
						local2664 -= 80000;
					}
					@Pc(2784) byte local2784 = 16;
					if (!this.method434(local227 - 1, local234)) {
						local2398 -= local2784;
					}
					if (!this.method434(local227 + 1, local234)) {
						local2398 += local2784;
					}
					if (!this.method434(local227, local234 - 1)) {
						local2405 -= local2784;
					}
					if (!this.method434(local227, local234 + 1)) {
						local2405 += local2784;
					}
					if (!this.method434(local294 - 1, local234)) {
						local2412 -= local2784;
					}
					if (!this.method434(local294 + 1, local234)) {
						local2412 += local2784;
					}
					if (!this.method434(local294, local234 - 1)) {
						local2632 -= local2784;
					}
					if (!this.method434(local294, local234 + 1)) {
						local2632 += local2784;
					}
					if (!this.method434(local972 - 1, local705)) {
						local2634 -= local2784;
					}
					if (!this.method434(local972 + 1, local705)) {
						local2634 += local2784;
					}
					if (!this.method434(local972, local705 - 1)) {
						local2419 -= local2784;
					}
					if (!this.method434(local972, local705 + 1)) {
						local2419 += local2784;
					}
					if (!this.method434(local227 - 1, local2391)) {
						local2630 -= local2784;
					}
					if (!this.method434(local227 + 1, local2391)) {
						local2630 += local2784;
					}
					if (!this.method434(local227, local2391 - 1)) {
						local2636 -= local2784;
					}
					if (!this.method434(local227, local2391 + 1)) {
						local2636 += local2784;
					}
					local266 = Class14.anIntArray136[local266 - 1];
					local2643 = -local2643;
					local2650 = -local2650;
					local2657 = -local2657;
					local2664 = -local2664;
					@Pc(3002) int[] local3002;
					if (this.method431(local227, local234) > 12000 && this.method431(local227, local234) < 24000 && this.method432(local227 - 1, local234 - 1) == 0) {
						local3002 = new int[] { this.aClass2_3.method117(local2634, local2657, local2419), this.aClass2_3.method117(local2630, local2664, local2636), this.aClass2_3.method117(local2412, local2650, local2632) };
						this.aClass2_3.method119(3, local3002, local266, 12345678);
					} else if (this.method431(local227, local234) > 12000 && this.method431(local227, local234) < 24000 && this.method432(local227 + 1, local234 + 1) == 0) {
						local3002 = new int[] { this.aClass2_3.method117(local2398, local2643, local2405), this.aClass2_3.method117(local2412, local2650, local2632), this.aClass2_3.method117(local2630, local2664, local2636) };
						this.aClass2_3.method119(3, local3002, local266, 12345678);
					} else if (this.method431(local227, local234) > 0 && this.method431(local227, local234) < 12000 && this.method432(local227 + 1, local234 - 1) == 0) {
						local3002 = new int[] { this.aClass2_3.method117(local2630, local2664, local2636), this.aClass2_3.method117(local2398, local2643, local2405), this.aClass2_3.method117(local2634, local2657, local2419) };
						this.aClass2_3.method119(3, local3002, local266, 12345678);
					} else if (this.method431(local227, local234) > 0 && this.method431(local227, local234) < 12000 && this.method432(local227 - 1, local234 + 1) == 0) {
						local3002 = new int[] { this.aClass2_3.method117(local2412, local2650, local2632), this.aClass2_3.method117(local2634, local2657, local2419), this.aClass2_3.method117(local2398, local2643, local2405) };
						this.aClass2_3.method119(3, local3002, local266, 12345678);
					} else if (local2643 == local2650 && local2657 == local2664) {
						local3002 = new int[] { this.aClass2_3.method117(local2398, local2643, local2405), this.aClass2_3.method117(local2412, local2650, local2632), this.aClass2_3.method117(local2634, local2657, local2419), this.aClass2_3.method117(local2630, local2664, local2636) };
						this.aClass2_3.method119(4, local3002, local266, 12345678);
					} else if (local2643 == local2664 && local2650 == local2657) {
						local3002 = new int[] { this.aClass2_3.method117(local2630, local2664, local2636), this.aClass2_3.method117(local2398, local2643, local2405), this.aClass2_3.method117(local2412, local2650, local2632), this.aClass2_3.method117(local2634, local2657, local2419) };
						this.aClass2_3.method119(4, local3002, local266, 12345678);
					} else {
						@Pc(3332) boolean local3332 = true;
						if (this.method432(local227 - 1, local234 - 1) > 0) {
							local3332 = false;
						}
						if (this.method432(local227 + 1, local234 + 1) > 0) {
							local3332 = false;
						}
						@Pc(3359) int[] local3359;
						@Pc(3397) int[] local3397;
						if (local3332) {
							local3359 = new int[] { this.aClass2_3.method117(local2398, local2643, local2405), this.aClass2_3.method117(local2412, local2650, local2632), this.aClass2_3.method117(local2630, local2664, local2636) };
							this.aClass2_3.method119(3, local3359, local266, 12345678);
							local3397 = new int[] { this.aClass2_3.method117(local2634, local2657, local2419), this.aClass2_3.method117(local2630, local2664, local2636), this.aClass2_3.method117(local2412, local2650, local2632) };
							this.aClass2_3.method119(3, local3397, local266, 12345678);
						} else {
							local3359 = new int[] { this.aClass2_3.method117(local2412, local2650, local2632), this.aClass2_3.method117(local2634, local2657, local2419), this.aClass2_3.method117(local2398, local2643, local2405) };
							this.aClass2_3.method119(3, local3359, local266, 12345678);
							local3397 = new int[] { this.aClass2_3.method117(local2630, local2664, local2636), this.aClass2_3.method117(local2398, local2643, local2405), this.aClass2_3.method117(local2634, local2657, local2419) };
							this.aClass2_3.method119(3, local3397, local266, 12345678);
						}
					}
				}
			}
		}
		this.aClass2_3.method122(true, 50, 50, -50, -10, -50);
		this.aClass2ArrayArray2[arg2] = this.aClass2_3.method120(0, 0, 1536, 1536, 8, 64, 169, true);
		for (local234 = 0; local234 < 64; local234++) {
			this.aClass6_1.method198(this.aClass2ArrayArray2[arg2][local234]);
		}
		if (this.aClass2ArrayArray2[arg2][0] == null) {
			throw new RuntimeException("null roof!");
		}
		for (local266 = 0; local266 < 96; local266++) {
			for (local268 = 0; local268 < 96; local268++) {
				if (this.anIntArrayArray21[local266][local268] >= 80000) {
					this.anIntArrayArray21[local266][local268] -= 80000;
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "([Lmudclient!a/a/f;)V")
	public void method444(@OriginalArg(0) Class2[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt341 - 2; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt342 - 2; local7++) {
				if (this.method431(local3, local7) > 48000 && this.method431(local3, local7) < 60000) {
					@Pc(28) int local28 = this.method431(local3, local7) - 48001;
					@Pc(33) int local33 = this.method433(local3, local7);
					@Pc(42) int local42;
					@Pc(46) int local46;
					if (local33 == 0 || local33 == 4) {
						local42 = Class14.anIntArray126[local28];
						local46 = Class14.anIntArray127[local28];
					} else {
						local46 = Class14.anIntArray126[local28];
						local42 = Class14.anIntArray127[local28];
					}
					this.method418(local3, local7, local28);
					@Pc(72) Class2 local72 = arg0[Class14.anIntArray125[local28]].method142(false, true, false, false);
					@Pc(82) int local82 = (local3 + local3 + local42) * 128 / 2;
					@Pc(92) int local92 = (local7 + local7 + local46) * 128 / 2;
					local72.method128(local82, -this.method424(local82, local92), local92);
					local72.method127(0, this.method433(local3, local7) * 32, 0);
					this.aClass6_1.method198(local72);
					local72.method123(48, 48, -50, -10, -50);
					if (local42 > 1 || local46 > 1) {
						for (@Pc(130) int local130 = local3; local130 < local3 + local42; local130++) {
							for (@Pc(134) int local134 = local7; local134 < local7 + local46; local134++) {
								if ((local130 > local3 || local134 > local7) && this.method431(local130, local134) - 48001 == local28) {
									local82 = local130;
									local92 = local134;
									@Pc(156) byte local156 = 0;
									if (local130 >= 48 && local134 < 48) {
										local156 = 1;
										local82 = local130 - 48;
									} else if (local130 < 48 && local134 >= 48) {
										local156 = 2;
										local92 = local134 - 48;
									} else if (local130 >= 48 && local134 >= 48) {
										local156 = 3;
										local82 = local130 - 48;
										local92 = local134 - 48;
									}
									this.anIntArrayArray18[local156][local82 * 48 + local92] = 0;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "a", descriptor = "(Lmudclient!a/a/f;IIIII)V")
	private void method445(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method421(arg2, arg3, 40);
		this.method421(arg4, arg5, 40);
		@Pc(13) int local13 = Class14.anIntArray130[arg1];
		@Pc(17) int local17 = Class14.anIntArray131[arg1];
		@Pc(21) int local21 = Class14.anIntArray132[arg1];
		@Pc(25) int local25 = arg2 * 128;
		@Pc(29) int local29 = arg3 * 128;
		@Pc(33) int local33 = arg4 * 128;
		@Pc(37) int local37 = arg5 * 128;
		@Pc(49) int local49 = arg0.method117(local25, -this.anIntArrayArray21[arg2][arg3], local29);
		@Pc(63) int local63 = arg0.method117(local25, -this.anIntArrayArray21[arg2][arg3] - local13, local29);
		@Pc(77) int local77 = arg0.method117(local33, -this.anIntArrayArray21[arg4][arg5] - local13, local37);
		@Pc(89) int local89 = arg0.method117(local33, -this.anIntArrayArray21[arg4][arg5], local37);
		@Pc(108) int[] local108 = new int[] { local49, local63, local77, local89 };
		@Pc(115) int local115 = arg0.method119(4, local108, local17, local21);
		if (Class14.anIntArray134[arg1] == 5) {
			arg0.anIntArray29[local115] = arg1 + 30000;
		} else {
			arg0.anIntArray29[local115] = 0;
		}
	}

	@OriginalMember(owner = "mudclient!f", name = "c", descriptor = "(IIIII)V")
	private void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = Class14.anIntArray130[arg0];
		if (this.anIntArrayArray21[arg1][arg2] < 80000) {
			this.anIntArrayArray21[arg1][arg2] += local3 + 80000;
		}
		if (this.anIntArrayArray21[arg3][arg4] < 80000) {
			this.anIntArrayArray21[arg3][arg4] += local3 + 80000;
		}
	}
}
