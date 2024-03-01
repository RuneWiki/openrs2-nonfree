package com.jagex;

import java.awt.Font;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public class Class410 {

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Ljava/awt/Font;")
	static Font aFont2;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "[Lclient!ahu;")
	static Class63_Sub1[] aClass63_Sub1Array1;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Ljava/util/List;")
	public List aList15 = new LinkedList();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Z")
	boolean aBoolean755 = false;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	int anInt4818 = 0;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	int anInt4819 = 0;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Z)V", line = 12)
	Class410(@OriginalArg(0) boolean arg0) {
		this.aBoolean755 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "(B)V", line = 17)
	public void method27670() {
		@Pc(3) Iterator local3 = this.aList15.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class446 local10 = (Class446) local3.next();
			local3.remove();
			Class375.method27228(local10);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ry;I)V", line = 26)
	void method27669(@OriginalArg(0) Class446 arg0) {
		@Pc(2) Class26_Sub1 local2 = arg0.aClass26_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class136[] local8 = arg0.aClass26_Sub1_25.aClass136Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean621) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass410_2 = this;
		@Pc(44) Class446 local44;
		if (this.aBoolean755) {
			@Pc(37) Iterator local37 = this.aList15.iterator();
			while (local37.hasNext()) {
				local44 = (Class446) local37.next();
				if (local2 == local44.aClass26_Sub1_25) {
					local37.remove();
					Class375.method27228(local44);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList15.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList15.add(arg0);
				return;
			}
			local44 = (Class446) local58.next();
		} while (local2.anInt2892 * 168363997 < local44.aClass26_Sub1_25.anInt2892 * 168363997);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(IIFLclient!jf;I)V", line = 49)
	public static void method27676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface25 arg3) {
		if (Class514.aClass48_6 != null) {
			Class514.aClass48_6.method9518().method25228(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ql", name = "ax", descriptor = "(I)V", line = 173)
	static void method27677() {
		@Pc(3) Class3_Sub1_Sub11 local3 = Class60_Sub34.method14470(14, 0L);
		local3.method19145();
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(Lclient!agb;B)V", line = 195)
	public static void method27671(@OriginalArg(0) Class3_Sub17 arg0) {
		Class392.method27429(arg0, 200000);
	}

	@OriginalMember(owner = "client!ql", name = "yh", descriptor = "(Lclient!vs;I)V", line = 8557)
	static final void method27672(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.aByte135;
	}

	@OriginalMember(owner = "client!ql", name = "jl", descriptor = "(B)V", line = 8941)
	static final void method27675() {
		@Pc(2) Class3_Sub41_Sub1 local2 = client.aClass82_2.aClass3_Sub41_Sub1_2;
		local2.method19824();
		@Pc(10) int local10 = local2.method19825(8);
		@Pc(17) int local17;
		if (local10 < client.anInt3163 * 1758488217) {
			for (local17 = local10; local17 < client.anInt3163 * 1758488217; local17++) {
				client.anIntArray294[(client.anInt3173 += 169149563) * -2017576269 - 1] = client.anIntArray303[local17];
			}
		}
		if (local10 > client.anInt3163 * 1758488217) {
			throw new RuntimeException();
		}
		client.anInt3163 = 0;
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(58) int local58 = client.anIntArray303[local17];
			@Pc(66) Class26_Sub1_Sub1_Sub1_Sub1 local66 = (Class26_Sub1_Sub1_Sub1_Sub1) ((Class3_Sub29) client.aClass581_21.method33217((long) local58)).anObject2;
			@Pc(71) int local71 = local2.method19825(1);
			if (local71 == 0) {
				client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local58;
				local66.anInt2378 = client.anInt3058 * 1663327699;
			} else {
				@Pc(97) int local97 = local2.method19825(2);
				if (local97 == 0) {
					client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local58;
					local66.anInt2378 = client.anInt3058 * 1663327699;
					client.anIntArray293[(client.anInt3057 += -130259787) * 2013817245 - 1] = local58;
				} else {
					@Pc(160) Class532 local160;
					if (local97 == 1) {
						client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local58;
						local66.anInt2378 = client.anInt3058 * 1663327699;
						local160 = (Class532) Class356.method26649(Class34_Sub1_Sub1.method16504(), local2.method19825(3));
						local66.method15499(local160, Class538.aClass538_3.aByte171);
						@Pc(171) int local171 = local2.method19825(1);
						if (local171 == 1) {
							client.anIntArray293[(client.anInt3057 += -130259787) * 2013817245 - 1] = local58;
						}
					} else if (local97 == 2) {
						client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local58;
						local66.anInt2378 = client.anInt3058 * 1663327699;
						if (local2.method19825(1) == 1) {
							local160 = (Class532) Class356.method26649(Class34_Sub1_Sub1.method16504(), local2.method19825(3));
							local66.method15499(local160, Class538.aClass538_2.aByte171);
							@Pc(239) Class532 local239 = (Class532) Class356.method26649(Class34_Sub1_Sub1.method16504(), local2.method19825(3));
							local66.method15499(local239, Class538.aClass538_2.aByte171);
						} else {
							local160 = (Class532) Class356.method26649(Class34_Sub1_Sub1.method16504(), local2.method19825(3));
							local66.method15499(local160, Class538.aClass538_1.aByte171);
						}
						@Pc(267) int local267 = local2.method19825(1);
						if (local267 == 1) {
							client.anIntArray293[(client.anInt3057 += -130259787) * 2013817245 - 1] = local58;
						}
					} else if (local97 == 3) {
						client.anIntArray294[(client.anInt3173 += 169149563) * -2017576269 - 1] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "aeh", descriptor = "(Lclient!vs;B)V", line = 9637)
	static final void method27673(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class3_Sub1_Sub14 local17 = Class13_Sub23.aClass343_1.method26476(local12);
		if (local17.anIntArray264 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anIntArray264.length;
		}
	}

	@OriginalMember(owner = "client!ql", name = "all", descriptor = "(Lclient!vs;B)V", line = 11131)
	static final void method27674(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3671 * -780345315;
	}
}
