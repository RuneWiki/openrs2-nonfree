package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agc")
public abstract class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!agc", name = "h", descriptor = "I")
	int anInt2708;

	@OriginalMember(owner = "client!agc", name = "l", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!agc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V", line = 11)
	Class3_Sub18(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!agc", name = "p", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V", line = 16)
	void method19495(@OriginalArg(0) OggPacket arg0) {
		this.method19497(arg0);
		this.anInt2708 += 1885988663;
	}

	@OriginalMember(owner = "client!agc", name = "h", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 16)
	void method19500(@OriginalArg(0) OggPacket arg0) {
		this.method19497(arg0);
		this.anInt2708 += 1885988663;
	}

	@OriginalMember(owner = "client!agc", name = "x", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 16)
	void method19501(@OriginalArg(0) OggPacket arg0) {
		this.method19497(arg0);
		this.anInt2708 += 1885988663;
	}

	@OriginalMember(owner = "client!agc", name = "l", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 16)
	void method19503(@OriginalArg(0) OggPacket arg0) {
		this.method19497(arg0);
		this.anInt2708 += 1885988663;
	}

	@OriginalMember(owner = "client!agc", name = "auz", descriptor = "(Lclient!vs;I)V", line = 12643)
	static final void method19507(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass26_Sub1_Sub5_Sub1_1.method21479();
	}

	@OriginalMember(owner = "client!agc", name = "y", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V")
	abstract void method19496(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!agc", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	abstract void method19497(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!agc", name = "z", descriptor = "()V")
	abstract void method19498();

	@OriginalMember(owner = "client!agc", name = "g", descriptor = "(B)V")
	abstract void method19499();

	@OriginalMember(owner = "client!agc", name = "s", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V")
	abstract void method19502(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!agc", name = "b", descriptor = "()V")
	abstract void method19504();

	@OriginalMember(owner = "client!agc", name = "c", descriptor = "()V")
	abstract void method19505();

	@OriginalMember(owner = "client!agc", name = "u", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V")
	abstract void method19506(@OriginalArg(0) OggPacket arg0);
}
