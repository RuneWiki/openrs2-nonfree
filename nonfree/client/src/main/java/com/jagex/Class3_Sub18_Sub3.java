package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amv")
public class Class3_Sub18_Sub3 extends Class3_Sub18 {

	@OriginalMember(owner = "client!amv", name = "s", descriptor = "I")
	static final int anInt2698 = 1024;

	@OriginalMember(owner = "client!amv", name = "x", descriptor = "I")
	static final int anInt2699 = 2048;

	@OriginalMember(owner = "client!amv", name = "v", descriptor = "Z")
	boolean aBoolean476;

	@OriginalMember(owner = "client!amv", name = "c", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!amv", name = "z", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	GranulePos aGranulePos1;

	@OriginalMember(owner = "client!amv", name = "n", descriptor = "D")
	double aDouble2;

	@OriginalMember(owner = "client!amv", name = "j", descriptor = "Lclient!jagtheora/theora/Frame;")
	Frame aFrame1;

	@OriginalMember(owner = "client!amv", name = "r", descriptor = "Z")
	boolean aBoolean477;

	@OriginalMember(owner = "client!amv", name = "d", descriptor = "Z")
	boolean aBoolean478;

	@OriginalMember(owner = "client!amv", name = "q", descriptor = "I")
	int anInt2700;

	@OriginalMember(owner = "client!amv", name = "m", descriptor = "I")
	int anInt2701;

	@OriginalMember(owner = "client!amv", name = "e", descriptor = "J")
	long aLong177;

	@OriginalMember(owner = "client!amv", name = "t", descriptor = "Ljava/lang/Object;")
	Object anObject5;

	@OriginalMember(owner = "client!amv", name = "w", descriptor = "Z")
	boolean aBoolean479;

	@OriginalMember(owner = "client!amv", name = "u", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!amv", name = "y", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!amv", name = "b", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!amv", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V", line = 28)
	Class3_Sub18_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amv", name = "y", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 35)
	@Override
	void method19496(@OriginalArg(0) OggPacket arg0) {
		@Pc(11) int local11;
		if (!this.aBoolean477) {
			local11 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local11 == 0) {
				this.aBoolean477 = true;
				if (this.aTheoraInfo1.anInt4168 > 2048 || this.aTheoraInfo1.anInt4169 > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.anInt4168, this.aTheoraInfo1.anInt4169);
				this.anInt2700 = this.aDecoderContext1.getMaxPostProcessingLevel() * -329070335;
				this.method19394(this.anInt2701 * -829060109);
			} else if (local11 < 0) {
				throw new IllegalStateException("" + local11);
			}
			return;
		}
		this.aLong177 = Class176.method23413() * 4590076333330149053L;
		local11 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local11 < 0) {
			throw new IllegalStateException("" + local11);
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble2 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean476) {
			@Pc(137) boolean local137 = arg0.isKeyFrame() == 1;
			if (!local137) {
				return;
			}
			this.aBoolean476 = false;
		}
		if (!this.aBoolean478 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException("" + local11);
			}
			this.aBoolean479 = true;
		}
	}

	@OriginalMember(owner = "client!amv", name = "s", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 35)
	@Override
	void method19502(@OriginalArg(0) OggPacket arg0) {
		@Pc(11) int local11;
		if (!this.aBoolean477) {
			local11 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local11 == 0) {
				this.aBoolean477 = true;
				if (this.aTheoraInfo1.anInt4168 > 2048 || this.aTheoraInfo1.anInt4169 > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.anInt4168, this.aTheoraInfo1.anInt4169);
				this.anInt2700 = this.aDecoderContext1.getMaxPostProcessingLevel() * -329070335;
				this.method19394(this.anInt2701 * -829060109);
			} else if (local11 < 0) {
				throw new IllegalStateException("" + local11);
			}
			return;
		}
		this.aLong177 = Class176.method23413() * 4590076333330149053L;
		local11 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local11 < 0) {
			throw new IllegalStateException("" + local11);
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble2 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean476) {
			@Pc(137) boolean local137 = arg0.isKeyFrame() == 1;
			if (!local137) {
				return;
			}
			this.aBoolean476 = false;
		}
		if (!this.aBoolean478 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException("" + local11);
			}
			this.aBoolean479 = true;
		}
	}

	@OriginalMember(owner = "client!amv", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V", line = 35)
	@Override
	void method19497(@OriginalArg(0) OggPacket arg0) {
		@Pc(11) int local11;
		if (!this.aBoolean477) {
			local11 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local11 == 0) {
				this.aBoolean477 = true;
				if (this.aTheoraInfo1.anInt4168 > 2048 || this.aTheoraInfo1.anInt4169 > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.anInt4168, this.aTheoraInfo1.anInt4169);
				this.anInt2700 = this.aDecoderContext1.getMaxPostProcessingLevel() * -329070335;
				this.method19394(this.anInt2701 * -829060109);
			} else if (local11 < 0) {
				throw new IllegalStateException("" + local11);
			}
			return;
		}
		this.aLong177 = Class176.method23413() * 4590076333330149053L;
		local11 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local11 < 0) {
			throw new IllegalStateException("" + local11);
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble2 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean476) {
			@Pc(137) boolean local137 = arg0.isKeyFrame() == 1;
			if (!local137) {
				return;
			}
			this.aBoolean476 = false;
		}
		if (!this.aBoolean478 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException("" + local11);
			}
			this.aBoolean479 = true;
		}
	}

	@OriginalMember(owner = "client!amv", name = "u", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 35)
	@Override
	void method19506(@OriginalArg(0) OggPacket arg0) {
		@Pc(11) int local11;
		if (!this.aBoolean477) {
			local11 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local11 == 0) {
				this.aBoolean477 = true;
				if (this.aTheoraInfo1.anInt4168 > 2048 || this.aTheoraInfo1.anInt4169 > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame1 = new Frame(this.aTheoraInfo1.anInt4168, this.aTheoraInfo1.anInt4169);
				this.anInt2700 = this.aDecoderContext1.getMaxPostProcessingLevel() * -329070335;
				this.method19394(this.anInt2701 * -829060109);
			} else if (local11 < 0) {
				throw new IllegalStateException("" + local11);
			}
			return;
		}
		this.aLong177 = Class176.method23413() * 4590076333330149053L;
		local11 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local11 < 0) {
			throw new IllegalStateException("" + local11);
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble2 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean476) {
			@Pc(137) boolean local137 = arg0.isKeyFrame() == 1;
			if (!local137) {
				return;
			}
			this.aBoolean476 = false;
		}
		if (!this.aBoolean478 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame1) != 0) {
				throw new IllegalStateException("" + local11);
			}
			this.aBoolean479 = true;
		}
	}

	@OriginalMember(owner = "client!amv", name = "j", descriptor = "(II)V", line = 68)
	void method19394(@OriginalArg(0) int arg0) {
		this.anInt2701 = arg0 * -1656814277;
		if (!this.aBoolean477) {
			return;
		}
		if (this.anInt2701 * -829060109 > this.anInt2700 * 2087597825) {
			this.anInt2701 = this.anInt2700 * -88559045;
		}
		if (this.anInt2701 * -829060109 < 0) {
			this.anInt2701 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt2701 * -829060109);
	}

	@OriginalMember(owner = "client!amv", name = "aa", descriptor = "()F", line = 77)
	float method19389() {
		return this.aBoolean477 && !this.aTheoraInfo1.method25191() ? (float) this.aTheoraInfo1.anInt4174 / (float) this.aTheoraInfo1.anInt4175 : 0.0F;
	}

	@OriginalMember(owner = "client!amv", name = "ak", descriptor = "()F", line = 77)
	float method19395() {
		return this.aBoolean477 && !this.aTheoraInfo1.method25191() ? (float) this.aTheoraInfo1.anInt4174 / (float) this.aTheoraInfo1.anInt4175 : 0.0F;
	}

	@OriginalMember(owner = "client!amv", name = "af", descriptor = "()F", line = 77)
	float method19396() {
		return this.aBoolean477 && !this.aTheoraInfo1.method25191() ? (float) this.aTheoraInfo1.anInt4174 / (float) this.aTheoraInfo1.anInt4175 : 0.0F;
	}

	@OriginalMember(owner = "client!amv", name = "n", descriptor = "(B)F", line = 77)
	float method19397() {
		return this.aBoolean477 && !this.aTheoraInfo1.method25191() ? (float) this.aTheoraInfo1.anInt4174 / (float) this.aTheoraInfo1.anInt4175 : 0.0F;
	}

	@OriginalMember(owner = "client!amv", name = "ah", descriptor = "()F", line = 77)
	float method19398() {
		return this.aBoolean477 && !this.aTheoraInfo1.method25191() ? (float) this.aTheoraInfo1.anInt4174 / (float) this.aTheoraInfo1.anInt4175 : 0.0F;
	}

	@OriginalMember(owner = "client!amv", name = "i", descriptor = "(B)D", line = 82)
	double method19390() {
		return this.aDouble2;
	}

	@OriginalMember(owner = "client!amv", name = "an", descriptor = "()D", line = 82)
	double method19399() {
		return this.aDouble2;
	}

	@OriginalMember(owner = "client!amv", name = "aj", descriptor = "()D", line = 82)
	double method19400() {
		return this.aDouble2;
	}

	@OriginalMember(owner = "client!amv", name = "f", descriptor = "(I)J", line = 86)
	long method19391() {
		return this.aLong177 * 2364935963835677845L;
	}

	@OriginalMember(owner = "client!amv", name = "as", descriptor = "()J", line = 86)
	long method19401() {
		return this.aLong177 * 2364935963835677845L;
	}

	@OriginalMember(owner = "client!amv", name = "ai", descriptor = "()J", line = 86)
	long method19402() {
		return this.aLong177 * 2364935963835677845L;
	}

	@OriginalMember(owner = "client!amv", name = "k", descriptor = "(I)Z", line = 90)
	boolean method19392() {
		return this.aBoolean477;
	}

	@OriginalMember(owner = "client!amv", name = "aq", descriptor = "()Z", line = 90)
	boolean method19403() {
		return this.aBoolean477;
	}

	@OriginalMember(owner = "client!amv", name = "av", descriptor = "()Z", line = 90)
	boolean method19404() {
		return this.aBoolean477;
	}

	@OriginalMember(owner = "client!amv", name = "g", descriptor = "(B)V", line = 94)
	@Override
	void method19499() {
		if (this.aFrame1 != null) {
			this.aFrame1.method25193();
		}
		if (this.aDecoderContext1 != null) {
			this.aDecoderContext1.method25193();
			this.aDecoderContext1 = null;
		}
		if (this.aGranulePos1 != null) {
			this.aGranulePos1.method25193();
			this.aGranulePos1 = null;
		}
		this.aTheoraInfo1.method25193();
		this.aTheoraComment1.method25193();
		this.aSetupInfo1.method25193();
	}

	@OriginalMember(owner = "client!amv", name = "b", descriptor = "()V", line = 94)
	@Override
	void method19504() {
		if (this.aFrame1 != null) {
			this.aFrame1.method25193();
		}
		if (this.aDecoderContext1 != null) {
			this.aDecoderContext1.method25193();
			this.aDecoderContext1 = null;
		}
		if (this.aGranulePos1 != null) {
			this.aGranulePos1.method25193();
			this.aGranulePos1 = null;
		}
		this.aTheoraInfo1.method25193();
		this.aTheoraComment1.method25193();
		this.aSetupInfo1.method25193();
	}

	@OriginalMember(owner = "client!amv", name = "z", descriptor = "()V", line = 94)
	@Override
	void method19498() {
		if (this.aFrame1 != null) {
			this.aFrame1.method25193();
		}
		if (this.aDecoderContext1 != null) {
			this.aDecoderContext1.method25193();
			this.aDecoderContext1 = null;
		}
		if (this.aGranulePos1 != null) {
			this.aGranulePos1.method25193();
			this.aGranulePos1 = null;
		}
		this.aTheoraInfo1.method25193();
		this.aTheoraComment1.method25193();
		this.aSetupInfo1.method25193();
	}

	@OriginalMember(owner = "client!amv", name = "c", descriptor = "()V", line = 94)
	@Override
	void method19505() {
		if (this.aFrame1 != null) {
			this.aFrame1.method25193();
		}
		if (this.aDecoderContext1 != null) {
			this.aDecoderContext1.method25193();
			this.aDecoderContext1 = null;
		}
		if (this.aGranulePos1 != null) {
			this.aGranulePos1.method25193();
			this.aGranulePos1 = null;
		}
		this.aTheoraInfo1.method25193();
		this.aTheoraComment1.method25193();
		this.aSetupInfo1.method25193();
	}

	@OriginalMember(owner = "client!amv", name = "at", descriptor = "(Lclient!pu;I)Ljava/lang/Object;", line = 111)
	public Object method19393(@OriginalArg(0) Interface44 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean479 || this.anObject5 == null) {
			this.anObject5 = arg0.method29838(this.aFrame1.anIntArray400, 0, this.aFrame1.anInt4166 * -1503666903, this.aFrame1.anInt4166 * -1503666903, this.aFrame1.anInt4167 * 1831513249);
			this.aBoolean479 = false;
			return this.anObject5;
		} else {
			return this.anObject5;
		}
	}

	@OriginalMember(owner = "client!amv", name = "ax", descriptor = "(Lclient!pu;)Ljava/lang/Object;", line = 111)
	public Object method19405(@OriginalArg(0) Interface44 arg0) {
		if (this.aFrame1 == null) {
			return null;
		} else if (this.aBoolean479 || this.anObject5 == null) {
			this.anObject5 = arg0.method29838(this.aFrame1.anIntArray400, 0, this.aFrame1.anInt4166 * -1503666903, this.aFrame1.anInt4166 * -1503666903, this.aFrame1.anInt4167 * 1831513249);
			this.aBoolean479 = false;
			return this.anObject5;
		} else {
			return this.anObject5;
		}
	}
}
