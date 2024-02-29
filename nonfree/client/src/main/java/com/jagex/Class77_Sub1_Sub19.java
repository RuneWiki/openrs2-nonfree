package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arw")
public class Class77_Sub1_Sub19 extends Class77_Sub1 {

	@OriginalMember(owner = "client!arw", name = "q", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!arw", name = "t", descriptor = "Ljava/lang/String;")
	public String aString114;

	@OriginalMember(owner = "client!arw", name = "x", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!arw", name = "d", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!arw", name = "s", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!arw", name = "<init>", descriptor = "()V", line = 14)
	Class77_Sub1_Sub19() {
	}

	@OriginalMember(owner = "client!arw", name = "p", descriptor = "(Lclient!akv;B)V", line = 18)
	void method22828(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method22831(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!arw", name = "w", descriptor = "(Lclient!akv;)V", line = 18)
	void method22829(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method22831(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!arw", name = "t", descriptor = "(Lclient!akv;I)V", line = 25)
	void method22830(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString114 = arg0.method22523();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method22478();
			this.anIntArray287 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray287[local25] = arg0.method22483();
				local39 = arg0.method22481();
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class125_Sub2.method12705(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method22478();
			this.anIntArray288 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray288[local25] = arg0.method22483();
				local39 = arg0.method22481();
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class125_Sub2.method12705(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!arw", name = "c", descriptor = "(Lclient!akv;IB)V", line = 25)
	void method22831(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString114 = arg0.method22523();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method22478();
			this.anIntArray287 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray287[local25] = arg0.method22483();
				local39 = arg0.method22481();
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class125_Sub2.method12705(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method22478();
			this.anIntArray288 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray288[local25] = arg0.method22483();
				local39 = arg0.method22481();
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class125_Sub2.method12705(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!arw", name = "v", descriptor = "(CS)I", line = 51)
	public int method22832(@OriginalArg(0) char arg0) {
		if (this.anIntArray287 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray287.length; local7++) {
			if (this.aCharArray3[local7] == arg0) {
				return this.anIntArray287[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!arw", name = "x", descriptor = "(C)I", line = 51)
	public int method22833(@OriginalArg(0) char arg0) {
		if (this.anIntArray287 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray287.length; local7++) {
			if (this.aCharArray3[local7] == arg0) {
				return this.anIntArray287[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!arw", name = "q", descriptor = "(C)I", line = 51)
	public int method22834(@OriginalArg(0) char arg0) {
		if (this.anIntArray287 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray287.length; local7++) {
			if (this.aCharArray3[local7] == arg0) {
				return this.anIntArray287[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!arw", name = "d", descriptor = "(C)I", line = 51)
	public int method22835(@OriginalArg(0) char arg0) {
		if (this.anIntArray287 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray287.length; local7++) {
			if (this.aCharArray3[local7] == arg0) {
				return this.anIntArray287[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!arw", name = "l", descriptor = "(CI)I", line = 57)
	public int method22836(@OriginalArg(0) char arg0) {
		if (this.anIntArray288 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray288.length; local6++) {
			if (this.aCharArray4[local6] == arg0) {
				return this.anIntArray288[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!arw", name = "s", descriptor = "(C)I", line = 57)
	public int method22837(@OriginalArg(0) char arg0) {
		if (this.anIntArray288 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray288.length; local6++) {
			if (this.aCharArray4[local6] == arg0) {
				return this.anIntArray288[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!arw", name = "r", descriptor = "(C)I", line = 57)
	public int method22838(@OriginalArg(0) char arg0) {
		if (this.anIntArray288 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray288.length; local6++) {
			if (this.aCharArray4[local6] == arg0) {
				return this.anIntArray288[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!arw", name = "y", descriptor = "(B)V", line = 63)
	void method22839() {
		@Pc(4) int local4;
		if (this.anIntArray288 != null) {
			for (local4 = 0; local4 < this.anIntArray288.length; local4++) {
				this.anIntArray288[local4] |= 0x8000;
			}
		}
		if (this.anIntArray287 != null) {
			for (local4 = 0; local4 < this.anIntArray287.length; local4++) {
				this.anIntArray287[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!arw", name = "j", descriptor = "()V", line = 63)
	void method22840() {
		@Pc(4) int local4;
		if (this.anIntArray288 != null) {
			for (local4 = 0; local4 < this.anIntArray288.length; local4++) {
				this.anIntArray288[local4] |= 0x8000;
			}
		}
		if (this.anIntArray287 != null) {
			for (local4 = 0; local4 < this.anIntArray287.length; local4++) {
				this.anIntArray287[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!arw", name = "g", descriptor = "()V", line = 63)
	void method22841() {
		@Pc(4) int local4;
		if (this.anIntArray288 != null) {
			for (local4 = 0; local4 < this.anIntArray288.length; local4++) {
				this.anIntArray288[local4] |= 0x8000;
			}
		}
		if (this.anIntArray287 != null) {
			for (local4 = 0; local4 < this.anIntArray287.length; local4++) {
				this.anIntArray287[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!arw", name = "z", descriptor = "()V", line = 63)
	void method22842() {
		@Pc(4) int local4;
		if (this.anIntArray288 != null) {
			for (local4 = 0; local4 < this.anIntArray288.length; local4++) {
				this.anIntArray288[local4] |= 0x8000;
			}
		}
		if (this.anIntArray287 != null) {
			for (local4 = 0; local4 < this.anIntArray287.length; local4++) {
				this.anIntArray287[local4] |= 0x8000;
			}
		}
	}
}
