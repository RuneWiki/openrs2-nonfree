package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amf")
public class Class3_Sub18_Sub2 extends Class3_Sub18 {

	@OriginalMember(owner = "client!amf", name = "ar", descriptor = "[Lclient!xa;")
	protected static Class569[] aClass569Array1;

	@OriginalMember(owner = "client!amf", name = "s", descriptor = "I")
	static final int anInt2640 = 0;

	@OriginalMember(owner = "client!amf", name = "x", descriptor = "I")
	static final int anInt2641 = 128;

	@OriginalMember(owner = "client!amf", name = "u", descriptor = "I")
	int anInt2642;

	@OriginalMember(owner = "client!amf", name = "b", descriptor = "Ljava/lang/String;")
	String aString102;

	@OriginalMember(owner = "client!amf", name = "c", descriptor = "Ljava/lang/String;")
	String aString103;

	@OriginalMember(owner = "client!amf", name = "z", descriptor = "F")
	float aFloat210;

	@OriginalMember(owner = "client!amf", name = "j", descriptor = "F")
	float aFloat211;

	@OriginalMember(owner = "client!amf", name = "n", descriptor = "Ljava/lang/String;")
	String aString104;

	@OriginalMember(owner = "client!amf", name = "y", descriptor = "I")
	int anInt2643;

	@OriginalMember(owner = "client!amf", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V", line = 20)
	Class3_Sub18_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amf", name = "s", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 24)
	@Override
	void method19502(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 > 0 && !"SUB".equals(this.aString103)) {
			return;
		}
		@Pc(16) Class3_Sub41 local16 = new Class3_Sub41(arg0.getData());
		@Pc(20) int local20 = local16.method20269();
		if (this.anInt2708 * -1552515449 <= 8) {
			if ((local20 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (this.anInt2708 * -1552515449 == 0) {
				local16.anInt2803 += 338288867;
				this.anInt2642 = local16.method20412() * 1648653371;
				this.anInt2643 = local16.method20412() * 1133592971;
				if (this.anInt2642 * 974275827 == 0 || this.anInt2643 * -476488157 == 0) {
					throw new IllegalStateException();
				}
				@Pc(80) Class3_Sub41 local80 = new Class3_Sub41(16);
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString102 = local80.method20283();
				local80.anInt2803 = 0;
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString103 = local80.method20283();
			}
			return;
		}
		if (local20 == 0) {
			@Pc(114) long local114 = local16.method20279();
			@Pc(118) long local118 = local16.method20279();
			@Pc(122) long local122 = local16.method20279();
			if (local114 < 0L || local118 < 0L || local122 < 0L || local122 > local114) {
				throw new IllegalStateException();
			}
			this.aFloat210 = (float) ((long) (this.anInt2643 * -476488157) * local114) / (float) (this.anInt2642 * 974275827);
			this.aFloat211 = (float) ((long) (this.anInt2643 * -476488157) * (local118 + local114)) / (float) (this.anInt2642 * 974275827);
			@Pc(180) int local180 = local16.method20412();
			if (local180 < 0 || local180 > local16.aByteArray51.length - local16.anInt2803 * 62066237) {
				throw new IllegalStateException();
			}
			this.aString104 = Class122.method22834(local16.aByteArray51, local16.anInt2803 * 62066237, local180);
		}
		if ((local20 | 0x80) != 0) {
			return;
		}
	}

	@OriginalMember(owner = "client!amf", name = "u", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 24)
	@Override
	void method19506(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 > 0 && !"SUB".equals(this.aString103)) {
			return;
		}
		@Pc(16) Class3_Sub41 local16 = new Class3_Sub41(arg0.getData());
		@Pc(20) int local20 = local16.method20269();
		if (this.anInt2708 * -1552515449 <= 8) {
			if ((local20 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (this.anInt2708 * -1552515449 == 0) {
				local16.anInt2803 += 338288867;
				this.anInt2642 = local16.method20412() * 1648653371;
				this.anInt2643 = local16.method20412() * 1133592971;
				if (this.anInt2642 * 974275827 == 0 || this.anInt2643 * -476488157 == 0) {
					throw new IllegalStateException();
				}
				@Pc(80) Class3_Sub41 local80 = new Class3_Sub41(16);
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString102 = local80.method20283();
				local80.anInt2803 = 0;
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString103 = local80.method20283();
			}
			return;
		}
		if (local20 == 0) {
			@Pc(114) long local114 = local16.method20279();
			@Pc(118) long local118 = local16.method20279();
			@Pc(122) long local122 = local16.method20279();
			if (local114 < 0L || local118 < 0L || local122 < 0L || local122 > local114) {
				throw new IllegalStateException();
			}
			this.aFloat210 = (float) ((long) (this.anInt2643 * -476488157) * local114) / (float) (this.anInt2642 * 974275827);
			this.aFloat211 = (float) ((long) (this.anInt2643 * -476488157) * (local118 + local114)) / (float) (this.anInt2642 * 974275827);
			@Pc(180) int local180 = local16.method20412();
			if (local180 < 0 || local180 > local16.aByteArray51.length - local16.anInt2803 * 62066237) {
				throw new IllegalStateException();
			}
			this.aString104 = Class122.method22834(local16.aByteArray51, local16.anInt2803 * 62066237, local180);
		}
		if ((local20 | 0x80) != 0) {
			return;
		}
	}

	@OriginalMember(owner = "client!amf", name = "y", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 24)
	@Override
	void method19496(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 > 0 && !"SUB".equals(this.aString103)) {
			return;
		}
		@Pc(16) Class3_Sub41 local16 = new Class3_Sub41(arg0.getData());
		@Pc(20) int local20 = local16.method20269();
		if (this.anInt2708 * -1552515449 <= 8) {
			if ((local20 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (this.anInt2708 * -1552515449 == 0) {
				local16.anInt2803 += 338288867;
				this.anInt2642 = local16.method20412() * 1648653371;
				this.anInt2643 = local16.method20412() * 1133592971;
				if (this.anInt2642 * 974275827 == 0 || this.anInt2643 * -476488157 == 0) {
					throw new IllegalStateException();
				}
				@Pc(80) Class3_Sub41 local80 = new Class3_Sub41(16);
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString102 = local80.method20283();
				local80.anInt2803 = 0;
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString103 = local80.method20283();
			}
			return;
		}
		if (local20 == 0) {
			@Pc(114) long local114 = local16.method20279();
			@Pc(118) long local118 = local16.method20279();
			@Pc(122) long local122 = local16.method20279();
			if (local114 < 0L || local118 < 0L || local122 < 0L || local122 > local114) {
				throw new IllegalStateException();
			}
			this.aFloat210 = (float) ((long) (this.anInt2643 * -476488157) * local114) / (float) (this.anInt2642 * 974275827);
			this.aFloat211 = (float) ((long) (this.anInt2643 * -476488157) * (local118 + local114)) / (float) (this.anInt2642 * 974275827);
			@Pc(180) int local180 = local16.method20412();
			if (local180 < 0 || local180 > local16.aByteArray51.length - local16.anInt2803 * 62066237) {
				throw new IllegalStateException();
			}
			this.aString104 = Class122.method22834(local16.aByteArray51, local16.anInt2803 * 62066237, local180);
		}
		if ((local20 | 0x80) != 0) {
			return;
		}
	}

	@OriginalMember(owner = "client!amf", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V", line = 24)
	@Override
	void method19497(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 > 0 && !"SUB".equals(this.aString103)) {
			return;
		}
		@Pc(16) Class3_Sub41 local16 = new Class3_Sub41(arg0.getData());
		@Pc(20) int local20 = local16.method20269();
		if (this.anInt2708 * -1552515449 <= 8) {
			if ((local20 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (this.anInt2708 * -1552515449 == 0) {
				local16.anInt2803 += 338288867;
				this.anInt2642 = local16.method20412() * 1648653371;
				this.anInt2643 = local16.method20412() * 1133592971;
				if (this.anInt2642 * 974275827 == 0 || this.anInt2643 * -476488157 == 0) {
					throw new IllegalStateException();
				}
				@Pc(80) Class3_Sub41 local80 = new Class3_Sub41(16);
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString102 = local80.method20283();
				local80.anInt2803 = 0;
				local16.method20286(local80.aByteArray51, 0, 16);
				this.aString103 = local80.method20283();
			}
			return;
		}
		if (local20 == 0) {
			@Pc(114) long local114 = local16.method20279();
			@Pc(118) long local118 = local16.method20279();
			@Pc(122) long local122 = local16.method20279();
			if (local114 < 0L || local118 < 0L || local122 < 0L || local122 > local114) {
				throw new IllegalStateException();
			}
			this.aFloat210 = (float) ((long) (this.anInt2643 * -476488157) * local114) / (float) (this.anInt2642 * 974275827);
			this.aFloat211 = (float) ((long) (this.anInt2643 * -476488157) * (local118 + local114)) / (float) (this.anInt2642 * 974275827);
			@Pc(180) int local180 = local16.method20412();
			if (local180 < 0 || local180 > local16.aByteArray51.length - local16.anInt2803 * 62066237) {
				throw new IllegalStateException();
			}
			this.aString104 = Class122.method22834(local16.aByteArray51, local16.anInt2803 * 62066237, local180);
		}
		if ((local20 | 0x80) != 0) {
			return;
		}
	}

	@OriginalMember(owner = "client!amf", name = "af", descriptor = "()Ljava/lang/String;", line = 59)
	String method18806() {
		return this.aString102;
	}

	@OriginalMember(owner = "client!amf", name = "j", descriptor = "(B)Ljava/lang/String;", line = 59)
	String method18808() {
		return this.aString102;
	}

	@OriginalMember(owner = "client!amf", name = "k", descriptor = "()Ljava/lang/String;", line = 59)
	String method18813() {
		return this.aString102;
	}

	@OriginalMember(owner = "client!amf", name = "at", descriptor = "()Ljava/lang/String;", line = 59)
	String method18814() {
		return this.aString102;
	}

	@OriginalMember(owner = "client!amf", name = "ak", descriptor = "()Ljava/lang/String;", line = 59)
	String method18816() {
		return this.aString102;
	}

	@OriginalMember(owner = "client!amf", name = "aa", descriptor = "()Ljava/lang/String;", line = 59)
	String method18824() {
		return this.aString102;
	}

	@OriginalMember(owner = "client!amf", name = "as", descriptor = "()F", line = 63)
	public float method18809() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "ai", descriptor = "()F", line = 63)
	public float method18810() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "aj", descriptor = "()F", line = 63)
	public float method18818() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "ah", descriptor = "()F", line = 63)
	public float method18819() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "aq", descriptor = "()F", line = 63)
	public float method18820() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "av", descriptor = "()F", line = 63)
	public float method18821() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "an", descriptor = "()F", line = 63)
	public float method18825() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "n", descriptor = "(B)F", line = 63)
	public float method18826() {
		return this.aFloat210;
	}

	@OriginalMember(owner = "client!amf", name = "i", descriptor = "(I)F", line = 67)
	public float method18815() {
		return this.aFloat211;
	}

	@OriginalMember(owner = "client!amf", name = "ax", descriptor = "()F", line = 67)
	public float method18822() {
		return this.aFloat211;
	}

	@OriginalMember(owner = "client!amf", name = "az", descriptor = "()F", line = 67)
	public float method18823() {
		return this.aFloat211;
	}

	@OriginalMember(owner = "client!amf", name = "al", descriptor = "()Ljava/lang/String;", line = 71)
	public String method18807() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!amf", name = "f", descriptor = "(I)Ljava/lang/String;", line = 71)
	public String method18811() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!amf", name = "ao", descriptor = "()Ljava/lang/String;", line = 71)
	public String method18812() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!amf", name = "ap", descriptor = "()Ljava/lang/String;", line = 71)
	public String method18817() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!amf", name = "ab", descriptor = "()Ljava/lang/String;", line = 71)
	public String method18827() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!amf", name = "au", descriptor = "()Ljava/lang/String;", line = 71)
	public String method18828() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!amf", name = "g", descriptor = "(B)V", line = 74)
	@Override
	void method19499() {
	}

	@OriginalMember(owner = "client!amf", name = "z", descriptor = "()V", line = 74)
	@Override
	void method19498() {
	}

	@OriginalMember(owner = "client!amf", name = "b", descriptor = "()V", line = 74)
	@Override
	void method19504() {
	}

	@OriginalMember(owner = "client!amf", name = "c", descriptor = "()V", line = 74)
	@Override
	void method19505() {
	}
}
