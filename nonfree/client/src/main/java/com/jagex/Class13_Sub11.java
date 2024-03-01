package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ack")
public class Class13_Sub11 extends Class13 {

	@OriginalMember(owner = "client!ack", name = "bk", descriptor = "Lclient!co;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!ack", name = "a", descriptor = "I")
	final int anInt632;

	@OriginalMember(owner = "client!ack", name = "g", descriptor = "I")
	final int anInt633;

	@OriginalMember(owner = "client!ack", name = "l", descriptor = "Ljava/lang/String;")
	final String aString37;

	@OriginalMember(owner = "client!ack", name = "h", descriptor = "I")
	final int anInt634;

	@OriginalMember(owner = "client!ack", name = "x", descriptor = "I")
	final int anInt635;

	@OriginalMember(owner = "client!ack", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 14)
	Class13_Sub11(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt632 = arg0.method20271() * -1143649163;
		this.anInt633 = arg0.method20271() * -1809526477;
		this.aString37 = arg0.method20283();
		this.anInt634 = arg0.method20275() * -991452163;
		this.anInt635 = arg0.method20271() * 1716331357;
	}

	@OriginalMember(owner = "client!ack", name = "a", descriptor = "(I)V", line = 23)
	@Override
	public void method16888() {
		Class161.method23264(Class141.anInt3427 * 1197232991, this.anInt632 * -928701475, this.anInt633 * 1727238651, Class186.method23926(this.anInt632 * -928701475, this.anInt633 * 1727238651, Class141.anInt3427 * 1197232991), this.anInt635 * 1853311221, this.anInt634 * -2137403051, this.aString37);
	}

	@OriginalMember(owner = "client!ack", name = "h", descriptor = "()V", line = 23)
	@Override
	public void method16896() {
		Class161.method23264(Class141.anInt3427 * 1197232991, this.anInt632 * -928701475, this.anInt633 * 1727238651, Class186.method23926(this.anInt632 * -928701475, this.anInt633 * 1727238651, Class141.anInt3427 * 1197232991), this.anInt635 * 1853311221, this.anInt634 * -2137403051, this.aString37);
	}

	@OriginalMember(owner = "client!ack", name = "j", descriptor = "(Lclient!de;I)V", line = 285)
	static void method6494(@OriginalArg(0) Class21 arg0) {
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17050(0, 0, Class128.anInt3317 * 2037417253, 350, Class67.anInt1838 * -47428739 << 24 | 0x332277, 1);
		@Pc(29) int local29 = 350 / (Class67.anInt1834 * -54642283);
		@Pc(41) int local41;
		if (Class67.anInt1840 * 1387788187 > 0) {
			local41 = 346 - Class67.anInt1834 * -54642283 - 4;
			@Pc(53) int local53 = local29 * local41 / (local29 + Class67.anInt1840 * 1387788187 - 1);
			@Pc(55) int local55 = 4;
			if (Class67.anInt1840 * 1387788187 > 1) {
				local55 += (local41 - local53) * (Class67.anInt1840 * 1387788187 - 1 - Class67.anInt1835 * 393384311) / (Class67.anInt1840 * 1387788187 - 1);
			}
			arg0.method17050(Class128.anInt3317 * 2037417253 - 16, local55, 12, local53, Class67.anInt1838 * -47428739 << 24 | 0x332277, 2);
			for (@Pc(104) int local104 = Class67.anInt1835 * 393384311; local104 < Class67.anInt1835 * 393384311 + local29 && local104 < Class67.anInt1840 * 1387788187; local104++) {
				@Pc(123) String[] local123 = Class230.method24546(Class67.aStringArray7[local104], '\b');
				@Pc(134) int local134 = (Class128.anInt3317 * 2037417253 - 8 - 16) / local123.length;
				for (@Pc(136) int local136 = 0; local136 < local123.length; local136++) {
					@Pc(146) int local146 = local136 * local134 + 8;
					arg0.method17079(local146, 0, local134 + local146 - 8, 350);
					Class454.aClass14_12.method3329(Class107.method21926(local123[local136]), local146, 350 - Class147.anInt3433 * 110915335 - 2 - Class222.aClass611_7.anInt5536 * -1990992757 - Class67.anInt1834 * -54642283 * (local104 - Class67.anInt1835 * 393384311), -1, -16777216);
				}
			}
		}
		Class418.aClass14_11.method3309("797 1", Class128.anInt3317 * 2037417253 - 25, 330, -1, -16777216);
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17065(0, 350 - Class147.anInt3433 * 110915335, Class128.anInt3317 * 2037417253, -1);
		Class568.aClass14_13.method3329("--> " + Class107.method21926(Class67.aString61), 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 1, -1, -16777216);
		if (Canvas_Sub1.aBoolean481) {
			local41 = -1;
			if (client.anInt3034 % 30 > 15) {
				local41 = 16777215;
			}
			arg0.method17066(Class224.aClass611_8.method33592("--> " + Class107.method21926(Class67.aString61).substring(0, Class67.anInt1837 * -1377464445)) + 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 11, 12, local41);
		}
		arg0.method17056();
		Class439.method28218();
	}
}
