package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public class Class325 {

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "Lclient!zr;")
	static Class715 aClass715_1;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Ljava/lang/String;")
	String aString176;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "Lclient!ht;")
	Class323 aClass323_132;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "Ljava/lang/String;")
	String aString177;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "Lclient!ht;")
	Class323 aClass323_133;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "[I")
	public int[] anIntArray405;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
	int anInt4138 = 592418195;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V", line = 58)
	Class325() {
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(Lclient!hw;I)V", line = 61)
	void method27296(@OriginalArg(0) Class326 arg0) {
		@Pc(3) int local3 = arg0.method27306();
		this.aClass323_133 = Class449.method28930()[local3];
		@Pc(17) int local17;
		if (Class323.aClass323_9 == this.aClass323_133) {
			local17 = arg0.method27306();
			this.aClass323_132 = Class449.method28930()[local17];
			this.anInt4138 = arg0.method27306() * -592418195;
		}
		this.aString176 = arg0.method27307();
		this.aString177 = arg0.method27307();
		local17 = arg0.method27306();
		this.anIntArray404 = new int[local17];
		this.anIntArray405 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray404[local54] = arg0.method27306();
			this.anIntArray405[local54] = arg0.method27306();
		}
	}

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "(Lclient!hw;)V", line = 61)
	void method27297(@OriginalArg(0) Class326 arg0) {
		@Pc(3) int local3 = arg0.method27306();
		this.aClass323_133 = Class449.method28930()[local3];
		@Pc(17) int local17;
		if (Class323.aClass323_9 == this.aClass323_133) {
			local17 = arg0.method27306();
			this.aClass323_132 = Class449.method28930()[local17];
			this.anInt4138 = arg0.method27306() * -592418195;
		}
		this.aString176 = arg0.method27307();
		this.aString177 = arg0.method27307();
		local17 = arg0.method27306();
		this.anIntArray404 = new int[local17];
		this.anIntArray405 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray404[local54] = arg0.method27306();
			this.anIntArray405[local54] = arg0.method27306();
		}
	}

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "(Lclient!hw;)V", line = 61)
	void method27298(@OriginalArg(0) Class326 arg0) {
		@Pc(3) int local3 = arg0.method27306();
		this.aClass323_133 = Class449.method28930()[local3];
		@Pc(17) int local17;
		if (Class323.aClass323_9 == this.aClass323_133) {
			local17 = arg0.method27306();
			this.aClass323_132 = Class449.method28930()[local17];
			this.anInt4138 = arg0.method27306() * -592418195;
		}
		this.aString176 = arg0.method27307();
		this.aString177 = arg0.method27307();
		local17 = arg0.method27306();
		this.anIntArray404 = new int[local17];
		this.anIntArray405 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray404[local54] = arg0.method27306();
			this.anIntArray405[local54] = arg0.method27306();
		}
	}

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "(II)V", line = 94)
	public static void method27299(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Class663.anInt5837 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray336[Class663.anInt5837 * 763077233] + 1];
		Class663.anInt5832 = 0;
		Class663.anInt5831 = 0;
	}

	@OriginalMember(owner = "client!hv", name = "td", descriptor = "(Lclient!yf;I)V", line = 8551)
	static final void method27303(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3981 * 1215292027;
	}

	@OriginalMember(owner = "client!hv", name = "vh", descriptor = "(Lclient!yf;B)V", line = 8865)
	static final void method27304(@OriginalArg(0) Class681 arg0) {
		Class335.method27409((String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375]);
	}

	@OriginalMember(owner = "client!hv", name = "afr", descriptor = "(Lclient!yf;I)V", line = 10533)
	static final void method27300(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anInt5891 -= -1915563430;
		@Pc(27) int local27 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(43) Class5 local43 = Class157.aClass462_2.method29241(client.anInterface50_1, local37);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local43.method55(local13, local27, Class110_Sub14.aClass100Array4);
	}

	@OriginalMember(owner = "client!hv", name = "lk", descriptor = "(Ljava/lang/String;ZB)I", line = 12352)
	public static int method27302(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class143_Sub1.anIntArray158 = null;
		Class155.anInt2066 = 0;
		@Pc(10) LinkedList local10 = new LinkedList();
		@Pc(14) LinkedList local14 = new LinkedList();
		@Pc(20) int local20 = arg1 ? 32768 : 0;
		@Pc(34) int local34 = local20 + (arg1 ? Class372.aClass58_2.anInt227 * 2069221553 : Class372.aClass58_2.anInt226 * 2099043927);
		@Pc(36) int local36;
		for (local36 = local20; local36 < local34; local36++) {
			@Pc(44) Class93_Sub1_Sub18 local44 = Class372.aClass58_2.method1097(local36);
			if (local44.aBoolean513 && local44.method22947().toLowerCase().indexOf(local2) != -1) {
				if (local10.size() >= 50) {
					return -1;
				}
				local10.add(local36);
				local14.add(local44.method22947());
			}
		}
		Class143_Sub1.anIntArray158 = new int[local10.size()];
		local36 = 0;
		@Pc(85) Iterator local85 = local10.iterator();
		while (local85.hasNext()) {
			@Pc(92) Integer local92 = (Integer) local85.next();
			Class143_Sub1.anIntArray158[local36++] = local92;
		}
		@Pc(107) String[] local107 = (String[]) local14.toArray(new String[Class143_Sub1.anIntArray158.length]);
		Class118.method8414(local107, Class143_Sub1.anIntArray158);
		return local10.size();
	}

	@OriginalMember(owner = "client!hv", name = "aqx", descriptor = "(Lclient!yf;I)V", line = 12816)
	static final void method27301(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
