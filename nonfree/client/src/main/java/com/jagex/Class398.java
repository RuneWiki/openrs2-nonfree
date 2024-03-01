package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public class Class398 {

	@OriginalMember(owner = "client!pv", name = "el", descriptor = "Lclient!nj;")
	public static Class347 aClass347_3;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
	static int anInt4797 = 0;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList2;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "Z")
	boolean aBoolean753;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
	final int anInt4796;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	final int anInt4798;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "[I")
	final int[] anIntArray430;

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "[I")
	final int[] anIntArray431;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "Lclient!dh;")
	public Class20 aClass20_8;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V", line = 24)
	public static void method27550(@OriginalArg(0) int arg0) {
		Class293.method25561(new Class424(arg0));
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!de;Lclient!ahb;I)V", line = 27)
	public Class398(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2) {
		this.anInt4796 = arg2 * 1944363583;
		this.anInt4798 = arg1.method20262() * -663305089;
		this.anIntArray430 = new int[this.anInt4798 * -275448961];
		this.anIntArray431 = new int[this.anInt4798 * -275448961];
		@Pc(31) int local31 = arg1.method20271();
		@Pc(35) int local35 = arg1.method20271();
		for (@Pc(37) int local37 = 0; local37 < this.anInt4798 * -275448961; local37++) {
			this.anIntArray430[local37] = local31 + arg1.method20390();
			this.anIntArray431[local37] = local35 + arg1.method20390();
		}
		this.aClass20_8 = this.method27526(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "(Lclient!de;I)Lclient!dh;", line = 42)
	Class20 method27526(@OriginalArg(0) Class21 arg0) {
		@Pc(7) Class138 local7 = Class138.method22955(Class55.aClass359_17, this.anInt4796 * 2028096959, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3415 < 13) {
				local7.method22968(2);
			}
			return arg0.method17100(local7, 2048, anInt4797 * 1040542187, 64, 768);
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(Lclient!de;)Lclient!dh;", line = 42)
	Class20 method27534(@OriginalArg(0) Class21 arg0) {
		@Pc(7) Class138 local7 = Class138.method22955(Class55.aClass359_17, this.anInt4796 * 2028096959, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3415 < 13) {
				local7.method22968(2);
			}
			return arg0.method17100(local7, 2048, anInt4797 * 1040542187, 64, 768);
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(Lclient!de;)Lclient!dh;", line = 42)
	Class20 method27535(@OriginalArg(0) Class21 arg0) {
		@Pc(7) Class138 local7 = Class138.method22955(Class55.aClass359_17, this.anInt4796 * 2028096959, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3415 < 13) {
				local7.method22968(2);
			}
			return arg0.method17100(local7, 2048, anInt4797 * 1040542187, 64, 768);
		}
	}

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "(Lclient!de;)Lclient!dh;", line = 42)
	Class20 method27542(@OriginalArg(0) Class21 arg0) {
		@Pc(7) Class138 local7 = Class138.method22955(Class55.aClass359_17, this.anInt4796 * 2028096959, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3415 < 13) {
				local7.method22968(2);
			}
			return arg0.method17100(local7, 2048, anInt4797 * 1040542187, 64, 768);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!rp;B)V", line = 49)
	public void method27540(@OriginalArg(0) Class438 arg0) {
		if (arg0 == null || this.anInt4798 * -275448961 <= 0) {
			return;
		}
		this.method27525(arg0);
		@Pc(15) Iterator local15 = this.aLinkedList2.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class26_Sub1_Sub1_Sub6 local22 = (Class26_Sub1_Sub1_Sub6) local15.next();
			arg0.method28054(local22, false);
		}
		this.aBoolean753 = true;
	}

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "(Lclient!rp;I)V", line = 62)
	public void method27528(@OriginalArg(0) Class438 arg0) {
		if (arg0 == null || this.aLinkedList2 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList2.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class26_Sub1_Sub1_Sub6 local16 = (Class26_Sub1_Sub1_Sub6) local9.next();
			arg0.method28079(local16.aByte101, local16.aShort94, local16.aShort93, new Class400(local16));
		}
	}

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "(Lclient!rp;I)V", line = 73)
	void method27525(@OriginalArg(0) Class438 arg0) {
		this.aLinkedList2 = new LinkedList();
		@Pc(8) Class346 local8 = client.aClass370_1.method27075();
		@Pc(12) Class464 local12 = client.aClass370_1.method26942();
		@Pc(27) Class464 local27 = new Class464(Class141.anInt3427 * 1197232991, this.anIntArray430[0], this.anIntArray431[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt4798 * -275448961; local29++) {
			@Pc(50) Class464 local50 = new Class464(Class141.anInt3427 * 1197232991, this.anIntArray430[local29], this.anIntArray431[local29]);
			while (local50.anInt5071 * -1567811631 != local27.anInt5071 * -1567811631 || local27.anInt5073 * 1360175441 != local50.anInt5073 * 1360175441) {
				if (local27.anInt5071 * -1567811631 < local50.anInt5071 * -1567811631) {
					local27.anInt5071 += -70999759;
				} else if (local27.anInt5071 * -1567811631 > local50.anInt5071 * -1567811631) {
					local27.anInt5071 -= -70999759;
				}
				if (local27.anInt5073 * 1360175441 < local50.anInt5073 * 1360175441) {
					local27.anInt5073 += -1055832143;
				} else if (local27.anInt5073 * 1360175441 > local50.anInt5073 * 1360175441) {
					local27.anInt5073 -= -1055832143;
				}
				@Pc(134) int local134 = Class141.anInt3427 * 1197232991;
				@Pc(144) int local144 = local27.anInt5071 * -1567811631 - local12.anInt5071 * -1567811631;
				@Pc(154) int local154 = local27.anInt5073 * 1360175441 - local12.anInt5073 * 1360175441;
				if (local144 >= 0 && local144 < arg0.anInt4901 * 406964363 && local154 >= 0 && local154 < arg0.anInt4902 * 2009656297) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method26504(local144, local154)) {
						local134++;
					}
					this.aLinkedList2.add(new Class26_Sub1_Sub1_Sub6(arg0, this, Class141.anInt3427 * 1197232991, local134, local176, Class186.method23926(local176, local182, Class141.anInt3427 * 1197232991), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "(Lclient!rp;)V", line = 73)
	void method27529(@OriginalArg(0) Class438 arg0) {
		this.aLinkedList2 = new LinkedList();
		@Pc(8) Class346 local8 = client.aClass370_1.method27075();
		@Pc(12) Class464 local12 = client.aClass370_1.method26942();
		@Pc(27) Class464 local27 = new Class464(Class141.anInt3427 * 1197232991, this.anIntArray430[0], this.anIntArray431[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt4798 * -275448961; local29++) {
			@Pc(50) Class464 local50 = new Class464(Class141.anInt3427 * 1197232991, this.anIntArray430[local29], this.anIntArray431[local29]);
			while (local50.anInt5071 * -1567811631 != local27.anInt5071 * -1567811631 || local27.anInt5073 * 1360175441 != local50.anInt5073 * 1360175441) {
				if (local27.anInt5071 * -1567811631 < local50.anInt5071 * -1567811631) {
					local27.anInt5071 += -70999759;
				} else if (local27.anInt5071 * -1567811631 > local50.anInt5071 * -1567811631) {
					local27.anInt5071 -= -70999759;
				}
				if (local27.anInt5073 * 1360175441 < local50.anInt5073 * 1360175441) {
					local27.anInt5073 += -1055832143;
				} else if (local27.anInt5073 * 1360175441 > local50.anInt5073 * 1360175441) {
					local27.anInt5073 -= -1055832143;
				}
				@Pc(134) int local134 = Class141.anInt3427 * 1197232991;
				@Pc(144) int local144 = local27.anInt5071 * -1567811631 - local12.anInt5071 * -1567811631;
				@Pc(154) int local154 = local27.anInt5073 * 1360175441 - local12.anInt5073 * 1360175441;
				if (local144 >= 0 && local144 < arg0.anInt4901 * 406964363 && local154 >= 0 && local154 < arg0.anInt4902 * 2009656297) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method26504(local144, local154)) {
						local134++;
					}
					this.aLinkedList2.add(new Class26_Sub1_Sub1_Sub6(arg0, this, Class141.anInt3427 * 1197232991, local134, local176, Class186.method23926(local176, local182, Class141.anInt3427 * 1197232991), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "(Lclient!rp;)V", line = 73)
	void method27536(@OriginalArg(0) Class438 arg0) {
		this.aLinkedList2 = new LinkedList();
		@Pc(8) Class346 local8 = client.aClass370_1.method27075();
		@Pc(12) Class464 local12 = client.aClass370_1.method26942();
		@Pc(27) Class464 local27 = new Class464(Class141.anInt3427 * 1197232991, this.anIntArray430[0], this.anIntArray431[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt4798 * -275448961; local29++) {
			@Pc(50) Class464 local50 = new Class464(Class141.anInt3427 * 1197232991, this.anIntArray430[local29], this.anIntArray431[local29]);
			while (local50.anInt5071 * -1567811631 != local27.anInt5071 * -1567811631 || local27.anInt5073 * 1360175441 != local50.anInt5073 * 1360175441) {
				if (local27.anInt5071 * -1567811631 < local50.anInt5071 * -1567811631) {
					local27.anInt5071 += -70999759;
				} else if (local27.anInt5071 * -1567811631 > local50.anInt5071 * -1567811631) {
					local27.anInt5071 -= -70999759;
				}
				if (local27.anInt5073 * 1360175441 < local50.anInt5073 * 1360175441) {
					local27.anInt5073 += -1055832143;
				} else if (local27.anInt5073 * 1360175441 > local50.anInt5073 * 1360175441) {
					local27.anInt5073 -= -1055832143;
				}
				@Pc(134) int local134 = Class141.anInt3427 * 1197232991;
				@Pc(144) int local144 = local27.anInt5071 * -1567811631 - local12.anInt5071 * -1567811631;
				@Pc(154) int local154 = local27.anInt5073 * 1360175441 - local12.anInt5073 * 1360175441;
				if (local144 >= 0 && local144 < arg0.anInt4901 * 406964363 && local154 >= 0 && local154 < arg0.anInt4902 * 2009656297) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method26504(local144, local154)) {
						local134++;
					}
					this.aLinkedList2.add(new Class26_Sub1_Sub1_Sub6(arg0, this, Class141.anInt3427 * 1197232991, local134, local176, Class186.method23926(local176, local182, Class141.anInt3427 * 1197232991), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "(I)V", line = 99)
	public static void method27533(@OriginalArg(0) int arg0) {
		anInt4797 = arg0 * -2018871613;
	}

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "(I)V", line = 99)
	public static void method27538(@OriginalArg(0) int arg0) {
		anInt4797 = arg0 * -2018871613;
	}

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "(I)V", line = 99)
	public static void method27539(@OriginalArg(0) int arg0) {
		anInt4797 = arg0 * -2018871613;
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V", line = 99)
	public static void method27549(@OriginalArg(0) int arg0) {
		anInt4797 = arg0 * -2018871613;
	}

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "(B)V", line = 103)
	public void method27530() {
		this.aBoolean753 = false;
		this.aClass20_8 = null;
	}

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "()V", line = 103)
	public void method27537() {
		this.aBoolean753 = false;
		this.aClass20_8 = null;
	}

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "()V", line = 103)
	public void method27541() {
		this.aBoolean753 = false;
		this.aClass20_8 = null;
	}

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "()V", line = 103)
	public void method27544() {
		this.aBoolean753 = false;
		this.aClass20_8 = null;
	}

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "()V", line = 103)
	public void method27546() {
		this.aBoolean753 = false;
		this.aClass20_8 = null;
	}

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "()Z", line = 108)
	public boolean method27527() {
		return this.aBoolean753;
	}

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "(I)Z", line = 108)
	public boolean method27531() {
		return this.aBoolean753;
	}

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "()Z", line = 108)
	public boolean method27545() {
		return this.aBoolean753;
	}

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "(Lclient!de;I)Z", line = 112)
	public boolean method27532(@OriginalArg(0) Class21 arg0) {
		this.aClass20_8 = this.method27526(arg0);
		return this.aClass20_8 != null;
	}

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "(Lclient!de;)Z", line = 112)
	public boolean method27543(@OriginalArg(0) Class21 arg0) {
		this.aClass20_8 = this.method27526(arg0);
		return this.aClass20_8 != null;
	}

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "(Lclient!de;)Z", line = 112)
	public boolean method27547(@OriginalArg(0) Class21 arg0) {
		this.aClass20_8 = this.method27526(arg0);
		return this.aClass20_8 != null;
	}

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "(Lclient!de;)Z", line = 112)
	public boolean method27548(@OriginalArg(0) Class21 arg0) {
		this.aClass20_8 = this.method27526(arg0);
		return this.aClass20_8 != null;
	}

	@OriginalMember(owner = "client!pv", name = "ui", descriptor = "(Lclient!vs;I)V", line = 7779)
	static final void method27551(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class424.aClass165_1.method23327(local12);
	}

	@OriginalMember(owner = "client!pv", name = "ajr", descriptor = "(Lclient!vs;B)V", line = 10641)
	static final void method27552(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 != -1) {
			Class449.anInt5013 = 2127832081;
			Class47.anInt1011 = -1801069635;
			return;
		}
		@Pc(21) int local21 = local12 >> 14 & 0x3FFF;
		@Pc(25) int local25 = local12 & 0x3FFF;
		@Pc(29) Class464 local29 = client.aClass370_1.method26942();
		local21 -= local29.anInt5071 * -1567811631;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 >= client.aClass370_1.method26943()) {
			local21 = client.aClass370_1.method26943();
		}
		local25 -= local29.anInt5073 * 1360175441;
		if (local25 < 0) {
			local25 = 0;
		} else if (local25 >= client.aClass370_1.method27062()) {
			local25 = client.aClass370_1.method27062();
		}
		Class449.anInt5013 = ((local21 << 9) + 256) * -2127832081;
		Class47.anInt1011 = ((local25 << 9) + 256) * 1801069635;
	}

	@OriginalMember(owner = "client!pv", name = "asf", descriptor = "(Lclient!vs;I)V", line = 12282)
	static final void method27553(@OriginalArg(0) Class536 arg0) {
		if (client.aBoolean565) {
			Class300.aClass300_6.method25643();
		}
	}
}
