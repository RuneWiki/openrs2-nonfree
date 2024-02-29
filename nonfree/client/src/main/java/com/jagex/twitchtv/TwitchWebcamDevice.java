package com.jagex.twitchtv;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDevice")
public class TwitchWebcamDevice {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "y", descriptor = "Ljava/util/LinkedList;")
	private LinkedList y = new LinkedList();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "v", descriptor = "I")
	public int v;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "l", descriptor = "I")
	public int l;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "p", descriptor = "Ljava/lang/String;")
	public String p;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "c", descriptor = "Ljava/lang/String;")
	public String c;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V", line = 17)
	public TwitchWebcamDevice(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.v = arg0 * 457149671;
		this.l = arg1 * 900858265;
		this.p = arg2;
		this.c = arg3;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "AddCapability", descriptor = "(IIIII)V", line = 26)
	public void AddCapability(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.y.add(new TwitchWebcamDeviceCapability(arg0, arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "p", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 30)
	public TwitchWebcamDeviceCapability p(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.y.size() ? (TwitchWebcamDeviceCapability) this.y.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "l", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 30)
	public TwitchWebcamDeviceCapability l(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.y.size() ? (TwitchWebcamDeviceCapability) this.y.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "y", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 30)
	public TwitchWebcamDeviceCapability y(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.y.size() ? (TwitchWebcamDeviceCapability) this.y.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "c", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 35)
	public TwitchWebcamDeviceCapability c(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.y.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.y.get(local1)).c * -1356474957 == arg0) {
				return (TwitchWebcamDeviceCapability) this.y.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "w", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 35)
	public TwitchWebcamDeviceCapability w(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.y.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.y.get(local1)).c * -1356474957 == arg0) {
				return (TwitchWebcamDeviceCapability) this.y.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "t", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 35)
	public TwitchWebcamDeviceCapability t(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.y.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.y.get(local1)).c * -1356474957 == arg0) {
				return (TwitchWebcamDeviceCapability) this.y.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "v", descriptor = "()I", line = 44)
	public int v() {
		return this.y.size();
	}
}
