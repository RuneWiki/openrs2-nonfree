import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
public final class Class198 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class198() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				@Pc(30) GraphicsDevice local30 = local14[local16];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method4682(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method4683(@OriginalArg(1) Frame arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method4682(arg0);
		if (arg1 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(30) boolean local30 = false;
			@Pc(34) DisplayMode[] local34 = this.aGraphicsDevice1.getDisplayModes();
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				if (local34[local36].getWidth() == arg4 && local34[local36].getHeight() == arg2 && arg3 == local34[local36].getBitDepth()) {
					@Pc(68) int local68 = local34[local36].getRefreshRate();
					if (!local30 || Math.abs(local68 - local28) < Math.abs(arg1 - local28)) {
						arg1 = local68;
						local30 = true;
					}
				}
			}
			if (!local30) {
				arg1 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg2, arg3, arg1));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(I)V")
	public void method4684() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method4682(null);
	}

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "(I)[I")
	public int[] method4685() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local3.length; local17++) {
			local9[local17 << 2] = local3[local17].getWidth();
			local9[(local17 << 2) + 1] = local3[local17].getHeight();
			local9[(local17 << 2) + 2] = local3[local17].getBitDepth();
			local9[(local17 << 2) + 3] = local3[local17].getRefreshRate();
		}
		return local9;
	}
}
