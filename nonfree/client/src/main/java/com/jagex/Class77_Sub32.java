package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akj")
public class Class77_Sub32 extends Class77 {

	@OriginalMember(owner = "client!akj", name = "s", descriptor = "[F")
	static float[] aFloatArray53 = new float[3];

	@OriginalMember(owner = "client!akj", name = "q", descriptor = "I")
	int anInt1710;

	@OriginalMember(owner = "client!akj", name = "d", descriptor = "F")
	float aFloat153;

	@OriginalMember(owner = "client!akj", name = "w", descriptor = "I")
	int anInt1711;

	@OriginalMember(owner = "client!akj", name = "t", descriptor = "I")
	int anInt1712;

	@OriginalMember(owner = "client!akj", name = "x", descriptor = "F")
	float aFloat154;

	@OriginalMember(owner = "client!akj", name = "l", descriptor = "Lclient!cs;")
	final Class195 aClass195_1;

	@OriginalMember(owner = "client!akj", name = "y", descriptor = "Lclient!mc;")
	final Class395 aClass395_1;

	@OriginalMember(owner = "client!akj", name = "<init>", descriptor = "(Lclient!cs;Lclient!wp;)V", line = 18)
	Class77_Sub32(@OriginalArg(0) Class195 arg0, @OriginalArg(1) Class626 arg1) {
		this.aClass195_1 = arg0;
		this.aClass395_1 = this.aClass195_1.method25444(Class622.anInterface45_1);
		this.method14081();
	}

	@OriginalMember(owner = "client!akj", name = "p", descriptor = "(I)V", line = 25)
	void method14081() {
		this.anInt1711 = this.aClass195_1.anInt3547 * 1492208541;
		this.anInt1712 = this.aClass195_1.anInt3548 * -884278269;
		this.anInt1710 = this.aClass195_1.anInt3546 * 837938373;
		if (this.aClass195_1.aClass442_96 != null) {
			this.aClass195_1.aClass442_96.method28993((float) (this.aClass395_1.anInt4601 * -1058410147), (float) (this.aClass395_1.anInt4613 * 829166933), (float) (this.aClass395_1.anInt4609 * 894885741), aFloatArray53);
		}
		this.aFloat154 = aFloatArray53[0];
		this.aFloat153 = aFloatArray53[2];
	}

	@OriginalMember(owner = "client!akj", name = "c", descriptor = "()V", line = 25)
	void method14082() {
		this.anInt1711 = this.aClass195_1.anInt3547 * 1492208541;
		this.anInt1712 = this.aClass195_1.anInt3548 * -884278269;
		this.anInt1710 = this.aClass195_1.anInt3546 * 837938373;
		if (this.aClass195_1.aClass442_96 != null) {
			this.aClass195_1.aClass442_96.method28993((float) (this.aClass395_1.anInt4601 * -1058410147), (float) (this.aClass395_1.anInt4613 * 829166933), (float) (this.aClass395_1.anInt4609 * 894885741), aFloatArray53);
		}
		this.aFloat154 = aFloatArray53[0];
		this.aFloat153 = aFloatArray53[2];
	}

	@OriginalMember(owner = "client!akj", name = "v", descriptor = "()V", line = 25)
	void method14083() {
		this.anInt1711 = this.aClass195_1.anInt3547 * 1492208541;
		this.anInt1712 = this.aClass195_1.anInt3548 * -884278269;
		this.anInt1710 = this.aClass195_1.anInt3546 * 837938373;
		if (this.aClass195_1.aClass442_96 != null) {
			this.aClass195_1.aClass442_96.method28993((float) (this.aClass395_1.anInt4601 * -1058410147), (float) (this.aClass395_1.anInt4613 * 829166933), (float) (this.aClass395_1.anInt4609 * 894885741), aFloatArray53);
		}
		this.aFloat154 = aFloatArray53[0];
		this.aFloat153 = aFloatArray53[2];
	}

	@OriginalMember(owner = "client!akj", name = "ads", descriptor = "(Lclient!yf;I)V", line = 9793)
	static final void method14084(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anInt5784 -= 617999126;
		@Pc(27) int local27 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(37) int local37 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local13.substring(local27, local37);
	}

	@OriginalMember(owner = "client!akj", name = "apu", descriptor = "(Lclient!yf;B)V", line = 12243)
	static final void method14085(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub32_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
	}
}
