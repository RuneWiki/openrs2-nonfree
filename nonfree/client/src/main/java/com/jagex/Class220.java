package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public class Class220 implements Interface1 {

	@OriginalMember(owner = "client!hf", name = "aw", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray13;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
	public static final int[] anIntArray393 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	public static final int[] anIntArray394 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "[B")
	byte[] aByteArray71;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
	int[] anIntArray391;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[S")
	short[] aShortArray101;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[S")
	short[] aShortArray102;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "[B")
	byte[] aByteArray72;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "[S")
	short[] aShortArray103;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!hp;")
	Class228 aClass228_1;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "[S")
	short[] aShortArray104;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
	int[] anIntArray392 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 21)
	Class220() {
	}

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "(Lclient!ahb;I)V", line = 25)
	void method24365(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method24373(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "(Lclient!ahb;)V", line = 25)
	void method24371(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method24373(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "(Lclient!ahb;)V", line = 25)
	void method24377(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method24373(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lclient!ahb;I)V", line = 32)
	void method24369(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method20269();
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method20269();
			this.anIntArray391 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray391[local20] = arg0.method20375();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method20269();
				this.aShortArray101 = new short[local14];
				this.aShortArray102 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray101[local20] = (short) arg0.method20271();
					this.aShortArray102[local20] = (short) arg0.method20271();
				}
			} else if (arg1 == 41) {
				local14 = arg0.method20269();
				this.aShortArray104 = new short[local14];
				this.aShortArray103 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray104[local20] = (short) arg0.method20271();
					this.aShortArray103[local20] = (short) arg0.method20271();
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method20271();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray72 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray72[local142] = local140++;
						} else {
							this.aByteArray72[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method20271();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray71 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray71[local142] = local140++;
						} else {
							this.aByteArray71[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray392[arg1 - 60] = arg0.method20375();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ahb;IB)V", line = 32)
	void method24373(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method20269();
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method20269();
			this.anIntArray391 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray391[local20] = arg0.method20375();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method20269();
				this.aShortArray101 = new short[local14];
				this.aShortArray102 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray101[local20] = (short) arg0.method20271();
					this.aShortArray102[local20] = (short) arg0.method20271();
				}
			} else if (arg1 == 41) {
				local14 = arg0.method20269();
				this.aShortArray104 = new short[local14];
				this.aShortArray103 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray104[local20] = (short) arg0.method20271();
					this.aShortArray103[local20] = (short) arg0.method20271();
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method20271();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray72 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray72[local142] = local140++;
						} else {
							this.aByteArray72[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method20271();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray71 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray71[local142] = local140++;
						} else {
							this.aByteArray71[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray392[arg1 - 60] = arg0.method20375();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "(Lclient!ahb;I)V", line = 32)
	void method24374(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method20269();
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method20269();
			this.anIntArray391 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray391[local20] = arg0.method20375();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method20269();
				this.aShortArray101 = new short[local14];
				this.aShortArray102 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray101[local20] = (short) arg0.method20271();
					this.aShortArray102[local20] = (short) arg0.method20271();
				}
			} else if (arg1 == 41) {
				local14 = arg0.method20269();
				this.aShortArray104 = new short[local14];
				this.aShortArray103 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray104[local20] = (short) arg0.method20271();
					this.aShortArray103[local20] = (short) arg0.method20271();
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method20271();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray72 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray72[local142] = local140++;
						} else {
							this.aByteArray72[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method20271();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray71 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray71[local142] = local140++;
						} else {
							this.aByteArray71[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray392[arg1 - 60] = arg0.method20375();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(II)Z", line = 48)
	public static boolean method24382(@OriginalArg(0) int arg0) {
		return arg0 >= Class456.aClass456_4.anInt5061 * 821735799 && arg0 <= Class456.aClass456_14.anInt5061 * 821735799 || Class456.aClass456_6.anInt5061 * 821735799 == arg0;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()Z", line = 96)
	public boolean method24366() {
		if (this.anIntArray391 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(12) Class359 local12 = this.aClass228_1.aClass359_41;
		synchronized (this.aClass228_1.aClass359_41) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray391.length; local15++) {
				if (!this.aClass228_1.aClass359_41.method26673(this.anIntArray391[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(B)Z", line = 96)
	public boolean method24367() {
		if (this.anIntArray391 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(12) Class359 local12 = this.aClass228_1.aClass359_41;
		synchronized (this.aClass228_1.aClass359_41) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray391.length; local15++) {
				if (!this.aClass228_1.aClass359_41.method26673(this.anIntArray391[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "()Z", line = 96)
	public boolean method24375() {
		if (this.anIntArray391 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(12) Class359 local12 = this.aClass228_1.aClass359_41;
		synchronized (this.aClass228_1.aClass359_41) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray391.length; local15++) {
				if (!this.aClass228_1.aClass359_41.method26673(this.anIntArray391[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "()Lclient!dy;", line = 105)
	public Class138 method24368() {
		if (this.anIntArray391 == null) {
			return null;
		}
		@Pc(9) Class138[] local9 = new Class138[this.anIntArray391.length];
		@Pc(14) Class359 local14 = this.aClass228_1.aClass359_41;
		@Pc(17) int local17;
		synchronized (this.aClass228_1.aClass359_41) {
			local17 = 0;
			while (true) {
				if (local17 >= this.anIntArray391.length) {
					break;
				}
				local9[local17] = Class138.method22955(this.aClass228_1.aClass359_41, this.anIntArray391[local17], 0);
				local17++;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < this.anIntArray391.length; local46++) {
			if (local9[local46].anInt3415 < 13) {
				local9[local46].method22968(2);
			}
		}
		@Pc(72) Class138 local72;
		if (local9.length == 1) {
			local72 = local9[0];
		} else {
			local72 = new Class138(local9, local9.length);
		}
		if (local72 == null) {
			return null;
		}
		if (this.aShortArray101 != null) {
			for (local17 = 0; local17 < this.aShortArray101.length; local17++) {
				local72.method22964(this.aShortArray101[local17], this.aShortArray102[local17]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local17 = 0; local17 < this.aShortArray104.length; local17++) {
				local72.method22965(this.aShortArray104[local17], this.aShortArray103[local17]);
			}
		}
		return local72;
	}

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "()Lclient!dy;", line = 105)
	public Class138 method24372() {
		if (this.anIntArray391 == null) {
			return null;
		}
		@Pc(9) Class138[] local9 = new Class138[this.anIntArray391.length];
		@Pc(14) Class359 local14 = this.aClass228_1.aClass359_41;
		@Pc(17) int local17;
		synchronized (this.aClass228_1.aClass359_41) {
			local17 = 0;
			while (true) {
				if (local17 >= this.anIntArray391.length) {
					break;
				}
				local9[local17] = Class138.method22955(this.aClass228_1.aClass359_41, this.anIntArray391[local17], 0);
				local17++;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < this.anIntArray391.length; local46++) {
			if (local9[local46].anInt3415 < 13) {
				local9[local46].method22968(2);
			}
		}
		@Pc(72) Class138 local72;
		if (local9.length == 1) {
			local72 = local9[0];
		} else {
			local72 = new Class138(local9, local9.length);
		}
		if (local72 == null) {
			return null;
		}
		if (this.aShortArray101 != null) {
			for (local17 = 0; local17 < this.aShortArray101.length; local17++) {
				local72.method22964(this.aShortArray101[local17], this.aShortArray102[local17]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local17 = 0; local17 < this.aShortArray104.length; local17++) {
				local72.method22965(this.aShortArray104[local17], this.aShortArray103[local17]);
			}
		}
		return local72;
	}

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "(B)Lclient!dy;", line = 105)
	public Class138 method24376() {
		if (this.anIntArray391 == null) {
			return null;
		}
		@Pc(9) Class138[] local9 = new Class138[this.anIntArray391.length];
		@Pc(14) Class359 local14 = this.aClass228_1.aClass359_41;
		@Pc(17) int local17;
		synchronized (this.aClass228_1.aClass359_41) {
			local17 = 0;
			while (true) {
				if (local17 >= this.anIntArray391.length) {
					break;
				}
				local9[local17] = Class138.method22955(this.aClass228_1.aClass359_41, this.anIntArray391[local17], 0);
				local17++;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < this.anIntArray391.length; local46++) {
			if (local9[local46].anInt3415 < 13) {
				local9[local46].method22968(2);
			}
		}
		@Pc(72) Class138 local72;
		if (local9.length == 1) {
			local72 = local9[0];
		} else {
			local72 = new Class138(local9, local9.length);
		}
		if (local72 == null) {
			return null;
		}
		if (this.aShortArray101 != null) {
			for (local17 = 0; local17 < this.aShortArray101.length; local17++) {
				local72.method22964(this.aShortArray101[local17], this.aShortArray102[local17]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local17 = 0; local17 < this.aShortArray104.length; local17++) {
				local72.method22965(this.aShortArray104[local17], this.aShortArray103[local17]);
			}
		}
		return local72;
	}

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)Z", line = 131)
	public boolean method24364() {
		@Pc(1) boolean local1 = true;
		@Pc(6) Class359 local6 = this.aClass228_1.aClass359_41;
		synchronized (this.aClass228_1.aClass359_41) {
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray392[local9] != -1 && !this.aClass228_1.aClass359_41.method26673(this.anIntArray392[local9], 0)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "()Z", line = 131)
	public boolean method24378() {
		@Pc(1) boolean local1 = true;
		@Pc(6) Class359 local6 = this.aClass228_1.aClass359_41;
		synchronized (this.aClass228_1.aClass359_41) {
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray392[local9] != -1 && !this.aClass228_1.aClass359_41.method26673(this.anIntArray392[local9], 0)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "(I)Lclient!dy;", line = 141)
	public Class138 method24370() {
		@Pc(2) Class138[] local2 = new Class138[5];
		@Pc(4) int local4 = 0;
		@Pc(9) Class359 local9 = this.aClass228_1.aClass359_41;
		@Pc(12) int local12;
		synchronized (this.aClass228_1.aClass359_41) {
			local12 = 0;
			while (true) {
				if (local12 >= 5) {
					break;
				}
				if (this.anIntArray392[local12] != -1) {
					local2[local4++] = Class138.method22955(this.aClass228_1.aClass359_41, this.anIntArray392[local12], 0);
				}
				local12++;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < 5; local46++) {
			if (local2[local46] != null && local2[local46].anInt3415 < 13) {
				local2[local46].method22968(2);
			}
		}
		@Pc(73) Class138 local73 = new Class138(local2, local4);
		if (this.aShortArray101 != null) {
			for (local12 = 0; local12 < this.aShortArray101.length; local12++) {
				local73.method22964(this.aShortArray101[local12], this.aShortArray102[local12]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local12 = 0; local12 < this.aShortArray104.length; local12++) {
				local73.method22965(this.aShortArray104[local12], this.aShortArray103[local12]);
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "()Lclient!dy;", line = 141)
	public Class138 method24379() {
		@Pc(2) Class138[] local2 = new Class138[5];
		@Pc(4) int local4 = 0;
		@Pc(9) Class359 local9 = this.aClass228_1.aClass359_41;
		@Pc(12) int local12;
		synchronized (this.aClass228_1.aClass359_41) {
			local12 = 0;
			while (true) {
				if (local12 >= 5) {
					break;
				}
				if (this.anIntArray392[local12] != -1) {
					local2[local4++] = Class138.method22955(this.aClass228_1.aClass359_41, this.anIntArray392[local12], 0);
				}
				local12++;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < 5; local46++) {
			if (local2[local46] != null && local2[local46].anInt3415 < 13) {
				local2[local46].method22968(2);
			}
		}
		@Pc(73) Class138 local73 = new Class138(local2, local4);
		if (this.aShortArray101 != null) {
			for (local12 = 0; local12 < this.aShortArray101.length; local12++) {
				local73.method22964(this.aShortArray101[local12], this.aShortArray102[local12]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local12 = 0; local12 < this.aShortArray104.length; local12++) {
				local73.method22965(this.aShortArray104[local12], this.aShortArray103[local12]);
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "()Lclient!dy;", line = 141)
	public Class138 method24380() {
		@Pc(2) Class138[] local2 = new Class138[5];
		@Pc(4) int local4 = 0;
		@Pc(9) Class359 local9 = this.aClass228_1.aClass359_41;
		@Pc(12) int local12;
		synchronized (this.aClass228_1.aClass359_41) {
			local12 = 0;
			while (true) {
				if (local12 >= 5) {
					break;
				}
				if (this.anIntArray392[local12] != -1) {
					local2[local4++] = Class138.method22955(this.aClass228_1.aClass359_41, this.anIntArray392[local12], 0);
				}
				local12++;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < 5; local46++) {
			if (local2[local46] != null && local2[local46].anInt3415 < 13) {
				local2[local46].method22968(2);
			}
		}
		@Pc(73) Class138 local73 = new Class138(local2, local4);
		if (this.aShortArray101 != null) {
			for (local12 = 0; local12 < this.aShortArray101.length; local12++) {
				local73.method22964(this.aShortArray101[local12], this.aShortArray102[local12]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local12 = 0; local12 < this.aShortArray104.length; local12++) {
				local73.method22965(this.aShortArray104[local12], this.aShortArray103[local12]);
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "()Lclient!dy;", line = 141)
	public Class138 method24381() {
		@Pc(2) Class138[] local2 = new Class138[5];
		@Pc(4) int local4 = 0;
		@Pc(9) Class359 local9 = this.aClass228_1.aClass359_41;
		@Pc(12) int local12;
		synchronized (this.aClass228_1.aClass359_41) {
			local12 = 0;
			while (true) {
				if (local12 >= 5) {
					break;
				}
				if (this.anIntArray392[local12] != -1) {
					local2[local4++] = Class138.method22955(this.aClass228_1.aClass359_41, this.anIntArray392[local12], 0);
				}
				local12++;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < 5; local46++) {
			if (local2[local46] != null && local2[local46].anInt3415 < 13) {
				local2[local46].method22968(2);
			}
		}
		@Pc(73) Class138 local73 = new Class138(local2, local4);
		if (this.aShortArray101 != null) {
			for (local12 = 0; local12 < this.aShortArray101.length; local12++) {
				local73.method22964(this.aShortArray101[local12], this.aShortArray102[local12]);
			}
		}
		if (this.aShortArray104 != null) {
			for (local12 = 0; local12 < this.aShortArray104.length; local12++) {
				local73.method22965(this.aShortArray104[local12], this.aShortArray103[local12]);
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!hf", name = "akx", descriptor = "(Lclient!vs;B)V", line = 10859)
	static final void method24383(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class80.aClass23_Sub1_1.method5887().anInt3695 * 68540099;
	}

	@OriginalMember(owner = "client!hf", name = "ako", descriptor = "(Lclient!vs;I)V", line = 10926)
	static final void method24384(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(41) Class320 local41 = Class320.method25891((float) local13, (float) local23, (float) local33);
		Class80.aClass23_Sub1_1.method5812(local41);
		local41.method25874();
	}
}
