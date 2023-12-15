package com.gildedrose;

import com.oneeyedmen.okeydoke.Approver;
import com.oneeyedmen.okeydoke.junit5.ApprovalsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.File;

public class ApprovalTest {
    @RegisterExtension
    ApprovalsExtension approvals = new ApprovalsExtension(new File("src/test/resources/approval"));

    @Test
    public void preservesBehaviour(Approver approver) {
        approver.assertApproved("foo");
    }
}
