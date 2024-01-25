import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
public final class Class227 {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "()V")
	public Class227() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method5797(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5799(arg1);
		if (arg2 == 0) {
			@Pc(37) int local37 = this.aDisplayMode1.getRefreshRate();
			@Pc(41) DisplayMode[] local41 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < local41.length; local45++) {
				if (local41[local45].getWidth() == arg3 && arg4 == local41[local45].getHeight() && arg0 == local41[local45].getBitDepth()) {
					@Pc(76) int local76 = local41[local45].getRefreshRate();
					if (!local43 || Math.abs(local76 - local37) < Math.abs(arg2 - local37)) {
						local43 = true;
						arg2 = local76;
					}
				}
			}
			if (!local43) {
				arg2 = local37;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg4, arg0, arg2));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(B)[I")
	public int[] method5798() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(17) int[] local17 = new int[local3.length << 2];
		for (@Pc(19) int local19 = 0; local19 < local3.length; local19++) {
			local17[local19 << 2] = local3[local19].getWidth();
			local17[(local19 << 2) + 1] = local3[local19].getHeight();
			local17[(local19 << 2) + 2] = local3[local19].getBitDepth();
			local17[(local19 << 2) + 3] = local3[local19].getRefreshRate();
		}
		return local17;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5799(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(64) Field local64 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local64.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(71) Throwable local71) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(I)V")
	public void method5800() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5799(null);
	}
}
