package com.jagex;

import com.jagex.twitchtv.TwitchEventLiveStreams;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajz")
public final class Class77_Sub26 extends Class77 {

	@OriginalMember(owner = "client!ajz", name = "y", descriptor = "I")
	public static final int anInt1551 = 2;

	@OriginalMember(owner = "client!ajz", name = "l", descriptor = "I")
	public static final int anInt1552 = 1;

	@OriginalMember(owner = "client!ajz", name = "t", descriptor = "I")
	public static final int anInt1553 = 8;

	@OriginalMember(owner = "client!ajz", name = "d", descriptor = "I")
	public static final int anInt1554 = 64;

	@OriginalMember(owner = "client!ajz", name = "w", descriptor = "I")
	public static final int anInt1555 = 4;

	@OriginalMember(owner = "client!ajz", name = "x", descriptor = "I")
	public static final int anInt1556 = 32;

	@OriginalMember(owner = "client!ajz", name = "q", descriptor = "I")
	public static final int anInt1557 = 16;

	@OriginalMember(owner = "client!ajz", name = "ax", descriptor = "Lclient!com/jagex/twitchtv/TwitchEventLiveStreams;")
	public static TwitchEventLiveStreams aTwitchEventLiveStreams1;

	@OriginalMember(owner = "client!ajz", name = "s", descriptor = "Lclient!ajz;")
	static final Class77_Sub26 aClass77_Sub26_1 = new Class77_Sub26(0, -1);

	@OriginalMember(owner = "client!ajz", name = "r", descriptor = "I")
	public final int anInt1558;

	@OriginalMember(owner = "client!ajz", name = "g", descriptor = "I")
	public final int anInt1559;

	@OriginalMember(owner = "client!ajz", name = "<init>", descriptor = "(II)V", line = 17)
	public Class77_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1558 = arg0 * -831098693;
		this.anInt1559 = arg1 * -636688699;
	}

	@OriginalMember(owner = "client!ajz", name = "x", descriptor = "()Z", line = 23)
	public final boolean method13644() {
		return (this.anInt1558 * 1837782131 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "p", descriptor = "(S)Z", line = 23)
	public final boolean method13645() {
		return (this.anInt1558 * 1837782131 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "c", descriptor = "(IB)Z", line = 27)
	public final boolean method13646(@OriginalArg(0) int arg0) {
		return (this.anInt1558 * 1837782131 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "d", descriptor = "(I)Z", line = 27)
	public final boolean method13647(@OriginalArg(0) int arg0) {
		return (this.anInt1558 * 1837782131 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "s", descriptor = "()I", line = 31)
	public final int method13648() {
		return Class397.method28436(this.anInt1558 * 1837782131);
	}

	@OriginalMember(owner = "client!ajz", name = "v", descriptor = "(B)I", line = 31)
	public final int method13649() {
		return Class397.method28436(this.anInt1558 * 1837782131);
	}

	@OriginalMember(owner = "client!ajz", name = "r", descriptor = "()I", line = 31)
	public final int method13650() {
		return Class397.method28436(this.anInt1558 * 1837782131);
	}

	@OriginalMember(owner = "client!ajz", name = "z", descriptor = "(I)I", line = 35)
	static final int method13651(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ajz", name = "g", descriptor = "(I)I", line = 35)
	static final int method13652(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ajz", name = "j", descriptor = "()I", line = 39)
	public final int method13653() {
		return this.anInt1558 * 1837782131 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ajz", name = "y", descriptor = "(S)I", line = 39)
	public final int method13654() {
		return this.anInt1558 * 1837782131 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ajz", name = "w", descriptor = "(S)Z", line = 43)
	public final boolean method13655() {
		return (this.anInt1558 * 1837782131 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "b", descriptor = "()Z", line = 43)
	public final boolean method13656() {
		return (this.anInt1558 * 1837782131 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "n", descriptor = "()Z", line = 43)
	public final boolean method13657() {
		return (this.anInt1558 * 1837782131 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "a", descriptor = "()Z", line = 43)
	public final boolean method13658() {
		return (this.anInt1558 * 1837782131 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "t", descriptor = "(I)Z", line = 47)
	public final boolean method13659() {
		return (this.anInt1558 * 1837782131 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "m", descriptor = "()Z", line = 47)
	public final boolean method13660() {
		return (this.anInt1558 * 1837782131 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "h", descriptor = "()Z", line = 47)
	public final boolean method13661() {
		return (this.anInt1558 * 1837782131 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "q", descriptor = "(I)Z", line = 51)
	public final boolean method13662() {
		return (this.anInt1558 * 1837782131 >> 23 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ajz", name = "aj", descriptor = "()Z", line = 51)
	public final boolean method13663() {
		return (this.anInt1558 * 1837782131 >> 23 & 0x1) != 0;
	}
}
