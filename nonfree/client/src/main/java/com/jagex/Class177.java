package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public class Class177 {

	@OriginalMember(owner = "client!b", name = "ap", descriptor = "I")
	static int anInt3312;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
	public boolean aBoolean568;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Ljava/lang/String;")
	public String aString123;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Ljava/lang/String;")
	public String aString124;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Ljava/lang/String;")
	public String aString125;

	@OriginalMember(owner = "client!b", name = "kt", descriptor = "(Lclient!yf;I)V", line = 6935)
	static final void method24388(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -725861497;
		@Pc(19) byte[] local19 = new byte[] { (byte) arg0.anIntArray519[arg0.anInt5891 * -1497248091] };
		@Pc(35) byte[] local35 = new byte[] { (byte) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] };
		@Pc(45) int local45 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(49) Class312 local49 = Class659.method32805(local45);
		Class392.method28295(local49, local19, local35, arg0);
	}

	@OriginalMember(owner = "client!b", name = "adp", descriptor = "(Lclient!yf;I)V", line = 10082)
	static final void method24389(@OriginalArg(0) Class681 arg0) {
		if (Class121.aClass93_Sub28_2 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
			arg0.aClass93_Sub28_4 = Class121.aClass93_Sub28_2;
		}
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 12545)
	Class177() {
	}
}
