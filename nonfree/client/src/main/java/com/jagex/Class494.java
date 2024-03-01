package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ty")
public class Class494 implements Iterable {

	@OriginalMember(owner = "client!ty", name = "p", descriptor = "[Lclient!tw;")
	Class492[] aClass492Array2;

	@OriginalMember(owner = "client!ty", name = "<init>", descriptor = "(Lclient!ny;)V", line = 10)
	public Class494(@OriginalArg(0) Class359 arg0) {
		@Pc(9) byte[] local9 = arg0.method26705(Class474.aClass474_9.anInt5121 * 152686723);
		if (local9 == null) {
			this.aClass492Array2 = new Class492[0];
		} else {
			this.method29306(new Class3_Sub41(local9));
		}
	}

	@OriginalMember(owner = "client!ty", name = "p", descriptor = "(Lclient!ahb;I)V", line = 21)
	void method29306(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				@Pc(13) int local13 = arg0.method20269();
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.method20269();
					@Pc(32) int local32 = arg0.method20271();
					@Pc(36) int local36 = arg0.method20269();
					@Pc(45) boolean local45 = (local36 & 0x1) != 0;
					@Pc(47) int local47 = 0;
					if ((local36 & 0x2) != 0) {
						local47 = arg0.method20269();
					}
					@Pc(64) boolean local64 = arg0.method20269() == 1;
					local19.add(new Class492(local28, local32, local45, local64, local47));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass492Array2 = new Class492[local15 + 1];
				@Pc(91) Iterator local91 = local19.iterator();
				while (local91.hasNext()) {
					@Pc(98) Class492 local98 = (Class492) local91.next();
					this.aClass492Array2[local98.method29288()] = local98;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ty", name = "s", descriptor = "(Lclient!ahb;)V", line = 21)
	void method29308(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				@Pc(13) int local13 = arg0.method20269();
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.method20269();
					@Pc(32) int local32 = arg0.method20271();
					@Pc(36) int local36 = arg0.method20269();
					@Pc(45) boolean local45 = (local36 & 0x1) != 0;
					@Pc(47) int local47 = 0;
					if ((local36 & 0x2) != 0) {
						local47 = arg0.method20269();
					}
					@Pc(64) boolean local64 = arg0.method20269() == 1;
					local19.add(new Class492(local28, local32, local45, local64, local47));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass492Array2 = new Class492[local15 + 1];
				@Pc(91) Iterator local91 = local19.iterator();
				while (local91.hasNext()) {
					@Pc(98) Class492 local98 = (Class492) local91.next();
					this.aClass492Array2[local98.method29288()] = local98;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ty", name = "u", descriptor = "(Lclient!ahb;)V", line = 21)
	void method29311(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				@Pc(13) int local13 = arg0.method20269();
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.method20269();
					@Pc(32) int local32 = arg0.method20271();
					@Pc(36) int local36 = arg0.method20269();
					@Pc(45) boolean local45 = (local36 & 0x1) != 0;
					@Pc(47) int local47 = 0;
					if ((local36 & 0x2) != 0) {
						local47 = arg0.method20269();
					}
					@Pc(64) boolean local64 = arg0.method20269() == 1;
					local19.add(new Class492(local28, local32, local45, local64, local47));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass492Array2 = new Class492[local15 + 1];
				@Pc(91) Iterator local91 = local19.iterator();
				while (local91.hasNext()) {
					@Pc(98) Class492 local98 = (Class492) local91.next();
					this.aClass492Array2[local98.method29288()] = local98;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ty", name = "a", descriptor = "(I)I", line = 51)
	public int method29304() {
		return this.aClass492Array2.length;
	}

	@OriginalMember(owner = "client!ty", name = "y", descriptor = "()I", line = 51)
	public int method29309() {
		return this.aClass492Array2.length;
	}

	@OriginalMember(owner = "client!ty", name = "g", descriptor = "(II)Lclient!tw;", line = 55)
	public Class492 method29302(@OriginalArg(0) int arg0) {
		return this.aClass492Array2[arg0];
	}

	@OriginalMember(owner = "client!ty", name = "b", descriptor = "(I)Lclient!tw;", line = 55)
	public Class492 method29310(@OriginalArg(0) int arg0) {
		return this.aClass492Array2[arg0];
	}

	@OriginalMember(owner = "client!ty", name = "c", descriptor = "(I)Lclient!tw;", line = 55)
	public Class492 method29312(@OriginalArg(0) int arg0) {
		return this.aClass492Array2[arg0];
	}

	@OriginalMember(owner = "client!ty", name = "z", descriptor = "(I)Lclient!tw;", line = 55)
	public Class492 method29313(@OriginalArg(0) int arg0) {
		return this.aClass492Array2[arg0];
	}

	@OriginalMember(owner = "client!ty", name = "h", descriptor = "()Ljava/util/Iterator;", line = 59)
	public Iterator method29303() {
		return new Class487(this.aClass492Array2);
	}

	@OriginalMember(owner = "client!ty", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 59)
	@Override
	public Iterator iterator() {
		return new Class487(this.aClass492Array2);
	}

	@OriginalMember(owner = "client!ty", name = "l", descriptor = "()Ljava/util/Iterator;", line = 59)
	public Iterator method29305() {
		return new Class487(this.aClass492Array2);
	}

	@OriginalMember(owner = "client!ty", name = "x", descriptor = "()Ljava/util/Iterator;", line = 59)
	public Iterator method29307() {
		return new Class487(this.aClass492Array2);
	}

	@OriginalMember(owner = "client!ty", name = "l", descriptor = "(B)V", line = 68)
	public static void method29314() {
		Class482.aClass581_37 = new Class581(8);
		Class482.anInt5157 = 0;
		@Pc(9) Iterator local9 = Class482.aList19.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class478 local16 = (Class478) local9.next();
			local16.method28832();
		}
	}

	@OriginalMember(owner = "client!ty", name = "an", descriptor = "([BB)[B", line = 431)
	static final byte[] method29319(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		@Pc(8) int local8 = local4.method20269();
		@Pc(12) int local12 = local4.method20275();
		if (local12 < 0 || Class359.anInt4641 * -652341339 != 0 && local12 > Class359.anInt4641 * -652341339) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(34) byte[] local34 = new byte[local12];
			local4.method20286(local34, 0, local12);
			return local34;
		} else {
			@Pc(46) int local46 = local4.method20275();
			if (local46 < 0 || Class359.anInt4641 * -652341339 != 0 && local46 > Class359.anInt4641 * -652341339) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local46];
			if (local8 == 1) {
				Class562.method32867(local64, local46, arg0, local12, 9);
			} else {
				@Pc(78) Class622 local78 = Class359.aClass622_1;
				synchronized (Class359.aClass622_1) {
					Class359.aClass622_1.method33762(local4, local64);
				}
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!ty", name = "ev", descriptor = "(II)Z", line = 1682)
	static boolean method29317(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 12;
	}

	@OriginalMember(owner = "client!ty", name = "di", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4765)
	static final void method29315(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean637 = false;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!ty", name = "qf", descriptor = "(Lclient!vs;I)V", line = 7024)
	static final void method29318(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.method22372(local11).method11806();
	}

	@OriginalMember(owner = "client!ty", name = "akd", descriptor = "(Lclient!vs;I)V", line = 10855)
	static final void method29316(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class80.aClass23_Sub1_1.method5830().anInt3698 * -1882151819;
	}
}
