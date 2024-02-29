package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agb")
public class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!agb", name = "ab", descriptor = "[Lclient!abj;")
	protected static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!agb", name = "y", descriptor = "Lclient!hr;")
	Class105 aClass105_1;

	@OriginalMember(owner = "client!agb", name = "l", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_1;

	@OriginalMember(owner = "client!agb", name = "v", descriptor = "Lclient!hi;")
	Class112 aClass112_1;

	@OriginalMember(owner = "client!agb", name = "<init>", descriptor = "(Lclient!aed;)V", line = 14)
	public Class99_Sub1(@OriginalArg(0) Class86_Sub1 arg0) throws Exception_Sub3 {
		super(arg0);
		this.method7812();
	}

	@OriginalMember(owner = "client!agb", name = "l", descriptor = "(B)Z", line = 19)
	boolean method7812() throws Exception_Sub3 {
		this.aClass112_1 = this.aClass86_Sub1_10.method20613("BatchedSprite");
		this.aClass77_Sub12_Sub1_1 = this.aClass112_1.method9524("SpriteSampler");
		this.aClass105_1 = this.aClass112_1.method9458("Normal");
		this.aClass112_1.method9547(this.aClass105_1);
		return true;
	}

	@OriginalMember(owner = "client!agb", name = "t", descriptor = "()Z", line = 19)
	boolean method7813() throws Exception_Sub3 {
		this.aClass112_1 = this.aClass86_Sub1_10.method20613("BatchedSprite");
		this.aClass77_Sub12_Sub1_1 = this.aClass112_1.method9524("SpriteSampler");
		this.aClass105_1 = this.aClass112_1.method9458("Normal");
		this.aClass112_1.method9547(this.aClass105_1);
		return true;
	}

	@OriginalMember(owner = "client!agb", name = "y", descriptor = "()Z", line = 19)
	boolean method7814() throws Exception_Sub3 {
		this.aClass112_1 = this.aClass86_Sub1_10.method20613("BatchedSprite");
		this.aClass77_Sub12_Sub1_1 = this.aClass112_1.method9524("SpriteSampler");
		this.aClass105_1 = this.aClass112_1.method9458("Normal");
		this.aClass112_1.method9547(this.aClass105_1);
		return true;
	}

	@OriginalMember(owner = "client!agb", name = "w", descriptor = "()Z", line = 19)
	boolean method7815() throws Exception_Sub3 {
		this.aClass112_1 = this.aClass86_Sub1_10.method20613("BatchedSprite");
		this.aClass77_Sub12_Sub1_1 = this.aClass112_1.method9524("SpriteSampler");
		this.aClass105_1 = this.aClass112_1.method9458("Normal");
		this.aClass112_1.method9547(this.aClass105_1);
		return true;
	}

	@OriginalMember(owner = "client!agb", name = "c", descriptor = "()V", line = 27)
	@Override
	public void method8410() {
		this.aClass112_1.method9545();
		this.aClass112_1.method9503(this.aClass77_Sub12_Sub1_1, 0, this.anInterface37_12);
	}

	@OriginalMember(owner = "client!agb", name = "p", descriptor = "()V", line = 27)
	@Override
	public void method8409() {
		this.aClass112_1.method9545();
		this.aClass112_1.method9503(this.aClass77_Sub12_Sub1_1, 0, this.anInterface37_12);
	}

	@OriginalMember(owner = "client!agb", name = "v", descriptor = "()V", line = 27)
	@Override
	public void method8408() {
		this.aClass112_1.method9545();
		this.aClass112_1.method9503(this.aClass77_Sub12_Sub1_1, 0, this.anInterface37_12);
	}

	@OriginalMember(owner = "client!agb", name = "gg", descriptor = "(Lclient!yf;I)V", line = 5724)
	static final void method7816(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class143_Sub24.method15789(local16, local22, arg0);
	}
}
