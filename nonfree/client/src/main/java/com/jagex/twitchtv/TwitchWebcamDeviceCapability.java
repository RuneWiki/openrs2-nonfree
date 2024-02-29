package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDeviceCapability")
public class TwitchWebcamDeviceCapability {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "p", descriptor = "I")
	public int p;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "c", descriptor = "I")
	public int c;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "v", descriptor = "I")
	public int v;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "l", descriptor = "I")
	public int l;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "y", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "<init>", descriptor = "(IIIII)V", line = 15)
	public TwitchWebcamDeviceCapability(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.p = arg0 * 1387376715;
		this.c = arg1 * 134275451;
		this.v = arg2 * 425776169;
		this.l = arg3 * -1833689191;
		this.y = arg4 * -1620636411;
	}
}
