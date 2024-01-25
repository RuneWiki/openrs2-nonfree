package jaclib.hardware_info;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/hardware_info/HardwareInfo")
public final class HardwareInfo {

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getPackedBasicCPUInfo", descriptor = "()I")
	public static native int getPackedBasicCPUInfo();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getPackedProcessorInfo", descriptor = "()I")
	private static native int getPackedProcessorInfo();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "isPentium4", descriptor = "()Z")
	private static native boolean isPentium4();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "<init>", descriptor = "()V")
	private HardwareInfo() {
	}
}
