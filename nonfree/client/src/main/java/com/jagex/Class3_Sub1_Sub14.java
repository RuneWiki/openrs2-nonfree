package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amt")
public class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amt", name = "b", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!amt", name = "u", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!amt", name = "s", descriptor = "Ljava/lang/String;")
	public String aString115;

	@OriginalMember(owner = "client!amt", name = "y", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!amt", name = "c", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!amt", name = "<init>", descriptor = "()V", line = 14)
	Class3_Sub1_Sub14() {
	}

	@OriginalMember(owner = "client!amt", name = "p", descriptor = "(Lclient!ahb;I)V", line = 18)
	void method19323(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method19325(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!amt", name = "x", descriptor = "(Lclient!ahb;)V", line = 18)
	void method19327(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method19325(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!amt", name = "s", descriptor = "(Lclient!ahb;)V", line = 18)
	void method19328(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method19325(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!amt", name = "a", descriptor = "(Lclient!ahb;II)V", line = 25)
	void method19325(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString115 = arg0.method20283();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method20269();
			this.anIntArray264 = new int[local15];
			this.aCharArray1 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray264[local25] = arg0.method20271();
				local39 = arg0.method20390();
				this.aCharArray1[local25] = local39 == 0 ? 0 : Class380.method27288(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method20269();
			this.anIntArray263 = new int[local15];
			this.aCharArray2 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray263[local25] = arg0.method20271();
				local39 = arg0.method20390();
				this.aCharArray2[local25] = local39 == 0 ? 0 : Class380.method27288(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!amt", name = "u", descriptor = "(Lclient!ahb;I)V", line = 25)
	void method19329(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString115 = arg0.method20283();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method20269();
			this.anIntArray264 = new int[local15];
			this.aCharArray1 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray264[local25] = arg0.method20271();
				local39 = arg0.method20390();
				this.aCharArray1[local25] = local39 == 0 ? 0 : Class380.method27288(local39);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method20269();
			this.anIntArray263 = new int[local15];
			this.aCharArray2 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray263[local25] = arg0.method20271();
				local39 = arg0.method20390();
				this.aCharArray2[local25] = local39 == 0 ? 0 : Class380.method27288(local39);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!amt", name = "g", descriptor = "(CI)I", line = 51)
	public int method19322(@OriginalArg(0) char arg0) {
		if (this.anIntArray264 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray264.length; local7++) {
			if (arg0 == this.aCharArray1[local7]) {
				return this.anIntArray264[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!amt", name = "y", descriptor = "(C)I", line = 51)
	public int method19333(@OriginalArg(0) char arg0) {
		if (this.anIntArray264 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray264.length; local7++) {
			if (arg0 == this.aCharArray1[local7]) {
				return this.anIntArray264[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!amt", name = "l", descriptor = "(CB)I", line = 57)
	public int method19326(@OriginalArg(0) char arg0) {
		if (this.anIntArray263 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray263.length; local7++) {
			if (arg0 == this.aCharArray2[local7]) {
				return this.anIntArray263[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!amt", name = "c", descriptor = "(C)I", line = 57)
	public int method19332(@OriginalArg(0) char arg0) {
		if (this.anIntArray263 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray263.length; local7++) {
			if (arg0 == this.aCharArray2[local7]) {
				return this.anIntArray263[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!amt", name = "j", descriptor = "(C)I", line = 57)
	public int method19334(@OriginalArg(0) char arg0) {
		if (this.anIntArray263 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray263.length; local7++) {
			if (arg0 == this.aCharArray2[local7]) {
				return this.anIntArray263[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!amt", name = "b", descriptor = "(C)I", line = 57)
	public int method19336(@OriginalArg(0) char arg0) {
		if (this.anIntArray263 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray263.length; local7++) {
			if (arg0 == this.aCharArray2[local7]) {
				return this.anIntArray263[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!amt", name = "z", descriptor = "(C)I", line = 57)
	public int method19337(@OriginalArg(0) char arg0) {
		if (this.anIntArray263 == null) {
			return -1;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray263.length; local7++) {
			if (arg0 == this.aCharArray2[local7]) {
				return this.anIntArray263[local7];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!amt", name = "n", descriptor = "()V", line = 63)
	void method19324() {
		@Pc(5) int local5;
		if (this.anIntArray263 != null) {
			for (local5 = 0; local5 < this.anIntArray263.length; local5++) {
				this.anIntArray263[local5] |= 0x8000;
			}
		}
		if (this.anIntArray264 != null) {
			for (local5 = 0; local5 < this.anIntArray264.length; local5++) {
				this.anIntArray264[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!amt", name = "i", descriptor = "()V", line = 63)
	void method19330() {
		@Pc(5) int local5;
		if (this.anIntArray263 != null) {
			for (local5 = 0; local5 < this.anIntArray263.length; local5++) {
				this.anIntArray263[local5] |= 0x8000;
			}
		}
		if (this.anIntArray264 != null) {
			for (local5 = 0; local5 < this.anIntArray264.length; local5++) {
				this.anIntArray264[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!amt", name = "h", descriptor = "(I)V", line = 63)
	void method19331() {
		@Pc(5) int local5;
		if (this.anIntArray263 != null) {
			for (local5 = 0; local5 < this.anIntArray263.length; local5++) {
				this.anIntArray263[local5] |= 0x8000;
			}
		}
		if (this.anIntArray264 != null) {
			for (local5 = 0; local5 < this.anIntArray264.length; local5++) {
				this.anIntArray264[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!amt", name = "f", descriptor = "()V", line = 63)
	void method19335() {
		@Pc(5) int local5;
		if (this.anIntArray263 != null) {
			for (local5 = 0; local5 < this.anIntArray263.length; local5++) {
				this.anIntArray263[local5] |= 0x8000;
			}
		}
		if (this.anIntArray264 != null) {
			for (local5 = 0; local5 < this.anIntArray264.length; local5++) {
				this.anIntArray264[local5] |= 0x8000;
			}
		}
	}
}
