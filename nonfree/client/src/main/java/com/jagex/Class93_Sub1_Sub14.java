package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asd")
public class Class93_Sub1_Sub14 extends Class93_Sub1 {

	@OriginalMember(owner = "client!asd", name = "z", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!asd", name = "u", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!asd", name = "d", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!asd", name = "l", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!asd", name = "p", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!asd", name = "<init>", descriptor = "()V", line = 14)
	Class93_Sub1_Sub14() {
	}

	@OriginalMember(owner = "client!asd", name = "e", descriptor = "(Lclient!alw;I)V", line = 18)
	void method22360(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method22378(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!asd", name = "w", descriptor = "(Lclient!alw;)V", line = 18)
	void method22364(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method22378(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!asd", name = "l", descriptor = "(Lclient!alw;)V", line = 18)
	void method22365(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method22378(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!asd", name = "u", descriptor = "(Lclient!alw;)V", line = 18)
	void method22366(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method22378(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!asd", name = "z", descriptor = "(Lclient!alw;)V", line = 18)
	void method22367(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method22378(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!asd", name = "p", descriptor = "(Lclient!alw;I)V", line = 25)
	void method22361(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString107 = arg0.method22427();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method22413();
			this.anIntArray260 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray260[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method22413();
			this.anIntArray261 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray261[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!asd", name = "r", descriptor = "(Lclient!alw;I)V", line = 25)
	void method22368(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString107 = arg0.method22427();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method22413();
			this.anIntArray260 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray260[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method22413();
			this.anIntArray261 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray261[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!asd", name = "d", descriptor = "(Lclient!alw;I)V", line = 25)
	void method22369(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString107 = arg0.method22427();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method22413();
			this.anIntArray260 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray260[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method22413();
			this.anIntArray261 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray261[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!asd", name = "c", descriptor = "(Lclient!alw;I)V", line = 25)
	void method22370(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString107 = arg0.method22427();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method22413();
			this.anIntArray260 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray260[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method22413();
			this.anIntArray261 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray261[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!asd", name = "n", descriptor = "(Lclient!alw;II)V", line = 25)
	void method22378(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString107 = arg0.method22427();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method22413();
			this.anIntArray260 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray260[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method22413();
			this.anIntArray261 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray261[local25] = arg0.method22415();
				local39 = arg0.method22414();
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class615.method32089(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!asd", name = "m", descriptor = "(CI)I", line = 51)
	public int method22371(@OriginalArg(0) char arg0) {
		if (this.anIntArray260 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray260.length; local7++) {
			if (arg0 == this.aCharArray3[local7]) {
				return this.anIntArray260[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asd", name = "y", descriptor = "(C)I", line = 51)
	public int method22373(@OriginalArg(0) char arg0) {
		if (this.anIntArray260 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray260.length; local7++) {
			if (arg0 == this.aCharArray3[local7]) {
				return this.anIntArray260[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asd", name = "v", descriptor = "(C)I", line = 51)
	public int method22377(@OriginalArg(0) char arg0) {
		if (this.anIntArray260 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray260.length; local7++) {
			if (arg0 == this.aCharArray3[local7]) {
				return this.anIntArray260[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asd", name = "k", descriptor = "(CI)I", line = 57)
	public int method22362(@OriginalArg(0) char arg0) {
		if (this.anIntArray261 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length; local6++) {
			if (arg0 == this.aCharArray4[local6]) {
				return this.anIntArray261[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asd", name = "x", descriptor = "(C)I", line = 57)
	public int method22374(@OriginalArg(0) char arg0) {
		if (this.anIntArray261 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length; local6++) {
			if (arg0 == this.aCharArray4[local6]) {
				return this.anIntArray261[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asd", name = "h", descriptor = "(C)I", line = 57)
	public int method22375(@OriginalArg(0) char arg0) {
		if (this.anIntArray261 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length; local6++) {
			if (arg0 == this.aCharArray4[local6]) {
				return this.anIntArray261[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asd", name = "a", descriptor = "(C)I", line = 57)
	public int method22376(@OriginalArg(0) char arg0) {
		if (this.anIntArray261 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length; local6++) {
			if (arg0 == this.aCharArray4[local6]) {
				return this.anIntArray261[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asd", name = "i", descriptor = "()V", line = 63)
	void method22359() {
		@Pc(5) int local5;
		if (this.anIntArray261 != null) {
			for (local5 = 0; local5 < this.anIntArray261.length; local5++) {
				this.anIntArray261[local5] |= 0x8000;
			}
		}
		if (this.anIntArray260 != null) {
			for (local5 = 0; local5 < this.anIntArray260.length; local5++) {
				this.anIntArray260[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asd", name = "f", descriptor = "(I)V", line = 63)
	void method22363() {
		@Pc(5) int local5;
		if (this.anIntArray261 != null) {
			for (local5 = 0; local5 < this.anIntArray261.length; local5++) {
				this.anIntArray261[local5] |= 0x8000;
			}
		}
		if (this.anIntArray260 != null) {
			for (local5 = 0; local5 < this.anIntArray260.length; local5++) {
				this.anIntArray260[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asd", name = "g", descriptor = "()V", line = 63)
	void method22372() {
		@Pc(5) int local5;
		if (this.anIntArray261 != null) {
			for (local5 = 0; local5 < this.anIntArray261.length; local5++) {
				this.anIntArray261[local5] |= 0x8000;
			}
		}
		if (this.anIntArray260 != null) {
			for (local5 = 0; local5 < this.anIntArray260.length; local5++) {
				this.anIntArray260[local5] |= 0x8000;
			}
		}
	}
}
